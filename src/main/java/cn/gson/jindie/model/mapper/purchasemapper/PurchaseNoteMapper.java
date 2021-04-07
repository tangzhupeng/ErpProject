package cn.gson.jindie.model.mapper.purchasemapper;

import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PurchaseNoteMapper {
    public void addPurNote(ErpBuyingOrder erpBuyingOrder);
    public List<ErpBuyingOrder> findAllPurNote();
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber);
    public void updateboEastate(ErpBuyingOrder erpBuyingOrder);
}
