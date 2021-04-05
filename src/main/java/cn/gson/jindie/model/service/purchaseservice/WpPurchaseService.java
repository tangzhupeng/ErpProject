package cn.gson.jindie.model.service.purchaseservice;

import cn.gson.jindie.model.mapper.purchasemapper.PurchaseMapper;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class WpPurchaseService {
    @Autowired
    PurchaseMapper purchaseMapper;

    public List<Map<String,Object>> findPOderList(){
        return purchaseMapper.findPOderList();
    }

    public void addMPurO(ErpPOrderMaster erpPOrderMaster){
        purchaseMapper.addMPurO(erpPOrderMaster);
    }

}
