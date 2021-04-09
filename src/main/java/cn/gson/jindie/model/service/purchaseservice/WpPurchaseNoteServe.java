package cn.gson.jindie.model.service.purchaseservice;

import cn.gson.jindie.model.mapper.purchasemapper.PurchaseMapper;
import cn.gson.jindie.model.mapper.purchasemapper.PurchaseNoteMapper;
import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderDetail;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 * 采购单服务（service）层
 * @author wp
 * @Time 2021-4-6
 *
 */
@Service
@Transactional
public class WpPurchaseNoteServe {

    // 采购单接口
    @Autowired
    PurchaseNoteMapper purchaseNoteMapper;

    // 采购订单接口
    @Autowired
    PurchaseMapper purchaseMapper;

    // 查询状态为执行中的采购订单
    public List<ErpPOrderMaster> findPOderListispoState0(){
        return purchaseMapper.findPOderListispoState0();
    }

    // 新增采购单
    public void addPurNote(ErpBuyingOrder erpBuyingOrder){
        // 根据当前时间加CGC前缀生成采购单
        Date date = new Date();
        SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
        String ztiem = "CGC"+sformat.format(date);
        erpBuyingOrder.setBoNumber(ztiem);
        purchaseNoteMapper.updateboEastate(erpBuyingOrder);
        purchaseNoteMapper.addPurNote(erpBuyingOrder);
    }

    // 查询所有采购单
    public List<ErpBuyingOrder> findAllPurNote(){
        return purchaseNoteMapper.findAllPurNote();
    }
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber){
        return purchaseNoteMapper.findAllPurNoteT(boNumber);
    }

}
