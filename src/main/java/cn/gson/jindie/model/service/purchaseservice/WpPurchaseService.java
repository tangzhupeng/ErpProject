package cn.gson.jindie.model.service.purchaseservice;

import cn.gson.jindie.model.mapper.purchasemapper.PurchaseMapper;

import cn.gson.jindie.model.mapper.txymapper.TxyProductMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyProviderMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyStoreMapper;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderDetail;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 采购订单服务（service）层
 * @author wp
 * @Time 2021-4-5
 *
 */
@Service
@Transactional
public class WpPurchaseService {

    // 采购接口
    @Autowired
    PurchaseMapper purchaseMapper;

    // 供应商接口
    @Autowired
    TxyProviderMapper txyProviderMapper;

    // 仓库接口
    @Autowired
    TxyStoreMapper txyStoreMapper;

    // 商品接口
    @Autowired
    TxyProductMapper txxProductMapper;

    // 查询所有采购订单
    public List<ErpPOrderMaster> findPOderList(){
        return purchaseMapper.findPOderList();
    }

    // 根据单据编号查询(从表)
    public List<ErpPOrderDetail> findPOderListpdi(String poNumber){
        return purchaseMapper.findPOderListpdi(poNumber);
    }

    // 根据编号查询(主表)
    public List<ErpPOrderDetail> findPOderListpmi(String poNumber){
        return purchaseMapper.findPOderListpmi(poNumber);
    }

    // 筛选
    public List<ErpPOrderMaster> filterPOderList(ErpPOrderMaster erpPOrderMaster){
        return purchaseMapper.filterPOderList(erpPOrderMaster);
    }

    // 新增销售订单主表
    public void addMPurO(ErpPOrderMaster erpPOrderMaster){
        // 根据当前时间和前缀生成采购订单编号（主表）
        Date date = new Date();
        SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
        String ztiem = "CGM"+sformat.format(date);
        erpPOrderMaster.setPoNumber(ztiem);
        purchaseMapper.addMPurO(erpPOrderMaster);
        // 循环新增采购订单（从表）
        erpPOrderMaster.getDetail().forEach(v->{
            Date date1 = new Date();
            SimpleDateFormat sformat1 = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
            String tiem = sformat1.format(date1);
            // 根据当前时间加三位随机数生成采购订单（从表）
            int max=999,min=1;
            long randomNum = System.currentTimeMillis();
            int ran3 = (int) (randomNum%(max-min)+min);
            v.setPodNumber("CGS"+tiem+ran3);
            v.setZpoNumber(ztiem);
            purchaseMapper.addDPurO(v);
        });
    }

    // 修改采购订单执行、审核状态
    public void updatepoEastate(ErpPOrderMaster erpPOrderMaster){
        purchaseMapper.updatepoEastate(erpPOrderMaster);
    }


    //查询仓库
    public List<ErpStore> findStore(){
        return txyStoreMapper.findStore();
    }

    //查询商品
    public List<ErpProduct> allProduct(){
        return txxProductMapper.allProduct();
    }
}
