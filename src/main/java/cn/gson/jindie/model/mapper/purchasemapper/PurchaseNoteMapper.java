package cn.gson.jindie.model.mapper.purchasemapper;

import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PurchaseNoteMapper {
    public void addPurNote(ErpBuyingOrder erpBuyingOrder);// 新增采购单
    public List<ErpBuyingOrder> findAllPurNote();// 查询所有采购单
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber);// 根据采购单编号查询对应的采购单
    public void updateboEastate(ErpBuyingOrder erpBuyingOrder);// 修改采购单状态
    public List<ErpBuyingOrder> findAllPurNoteX(Integer providerId);// 查询所有的采购单
}
