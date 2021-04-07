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

@Service
@Transactional
public class WpPurchaseNoteServe {

    @Autowired
    PurchaseNoteMapper purchaseNoteMapper;

    @Autowired
    PurchaseMapper purchaseMapper;

    public List<ErpPOrderMaster> findPOderListispoState0(){
        return purchaseMapper.findPOderListispoState0();
    }

    public void addPurNote(ErpBuyingOrder erpBuyingOrder){
        Date date = new Date();
        SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
        String ztiem = "CGC"+sformat.format(date);
        erpBuyingOrder.setBoNumber(ztiem);
        purchaseNoteMapper.updateboEastate(erpBuyingOrder);
        purchaseNoteMapper.addPurNote(erpBuyingOrder);
    }

    public List<ErpBuyingOrder> findAllPurNote(){
        return purchaseNoteMapper.findAllPurNote();
    }
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber){
        return purchaseNoteMapper.findAllPurNoteT(boNumber);
    }

}
