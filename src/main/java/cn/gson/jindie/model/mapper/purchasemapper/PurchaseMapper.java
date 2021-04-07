package cn.gson.jindie.model.mapper.purchasemapper;

import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderDetail;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PurchaseMapper {
    public List<Map<String,Object>> findPOderList();
    public void addMPurO(ErpPOrderMaster erpPOrderMaster);
    public List<ErpPOrderDetail> findPOderListpdi(String poNumber);
    public List<ErpPOrderDetail> findPOderListpmi(String poNumber);
    public void updatepoEastate(ErpPOrderMaster erpPOrderMaster);
    public List<ErpPOrderMaster> filterPOderList(ErpPOrderMaster erpPOrderMaster);
    public void addDPurO(ErpPOrderDetail erpPOrderDetail);
    public List<ErpPOrderMaster> findPOderListispoState0();
}
