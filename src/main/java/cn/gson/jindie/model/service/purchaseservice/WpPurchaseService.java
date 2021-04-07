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

@Service
@Transactional
public class WpPurchaseService {
    String ztiem;
    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    TxyProviderMapper txyProviderMapper;

    @Autowired
    TxyStoreMapper txyStoreMapper;

    @Autowired
    TxyProductMapper txyProductMapper;

    public List<Map<String,Object>> findPOderList(){
        return purchaseMapper.findPOderList();
    }

    public List<ErpPOrderDetail> findPOderListpdi(String poNumber){
        return purchaseMapper.findPOderListpdi(poNumber);
    }

    public List<ErpPOrderDetail> findPOderListpmi(String poNumber){
        return purchaseMapper.findPOderListpmi(poNumber);
    }

//    筛选
    public List<ErpPOrderMaster> filterPOderList(ErpPOrderMaster erpPOrderMaster){
        return purchaseMapper.filterPOderList(erpPOrderMaster);
    }

    // 新增销售订单主表
    public void addMPurO(ErpPOrderMaster erpPOrderMaster){
        Date date = new Date();
        SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
        ztiem = "CGM"+sformat.format(date);
        erpPOrderMaster.setPoNumber(ztiem);
        purchaseMapper.addMPurO(erpPOrderMaster);

            erpPOrderMaster.getDetail().forEach(v->{
            Date date1 = new Date();
            SimpleDateFormat sformat1 = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
            String tiem = sformat1.format(date1);
            int max=999,min=1;
            long randomNum = System.currentTimeMillis();
            int ran3 = (int) (randomNum%(max-min)+min);
            v.setPodNumber("CGS"+tiem+ran3);
            v.setZpoNumber(ztiem);
            purchaseMapper.addDPurO(v);
        });
    }

    // 新增销售订单从表
//    public void addDPurO(ErpPOrderDetail erpPOrderDetail){
//        System.out.println("sbhz"+ztiem);
//
//    }

    public void updatepoEastate(ErpPOrderMaster erpPOrderMaster){
        purchaseMapper.updatepoEastate(erpPOrderMaster);
    }

//查询供货商
    public List<ErpProvider> findProvider(){
        return txyProviderMapper.findProvider();
    }

//查询仓库
    public List<ErpStore> findStore(){
        return txyStoreMapper.findStore();
    }

//查询商品
    public List<ErpProduct> allProduct(){
        return txyProductMapper.allProduct();
    }
}
