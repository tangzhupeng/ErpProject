package cn.gson.jindie.model.service.purchaseservice;

import cn.gson.jindie.model.mapper.purchasemapper.PurchaseMapper;

import cn.gson.jindie.model.mapper.txymapper.TxxProductMapper;
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
    @Autowired
    PurchaseMapper purchaseMapper;

    @Autowired
    TxyProviderMapper txyProviderMapper;

    @Autowired
    TxyStoreMapper txyStoreMapper;

    @Autowired
    TxxProductMapper txxProductMapper;

    public List<Map<String,Object>> findPOderList(){
        return purchaseMapper.findPOderList();
    }

    public List<ErpPOrderDetail> findPOderListpdi(String poNumber){
        return purchaseMapper.findPOderListpdi(poNumber);
    }

    public List<ErpPOrderDetail> findPOderListpmi(String poNumber){
        return purchaseMapper.findPOderListpmi(poNumber);
    }

    public void addMPurO(ErpPOrderMaster erpPOrderMaster){
        Date date = new Date();
        SimpleDateFormat sformat = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
        String tiem = sformat.format(date);
        erpPOrderMaster.setPoNumber("CG"+tiem);
        System.out.println("service"+erpPOrderMaster);
        purchaseMapper.addMPurO(erpPOrderMaster);
    }

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
        return txxProductMapper.allProduct();
    }
}
