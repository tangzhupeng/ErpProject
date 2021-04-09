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
    public List<ErpPOrderMaster> findPOderList();// 查询所有采购订单
    public void addMPurO(ErpPOrderMaster erpPOrderMaster);// 新增采购订单（主）
    public List<ErpPOrderDetail> findPOderListpdi(String poNumber);// 根据单据编号查询(从表)
    public List<ErpPOrderDetail> findPOderListpmi(String poNumber);// 根据编号查询(主表)
    public void updatepoEastate(ErpPOrderMaster erpPOrderMaster);// 修改采购订单执行、审核状态
    public List<ErpPOrderMaster> filterPOderList(ErpPOrderMaster erpPOrderMaster);// 筛选查询
    public void addDPurO(ErpPOrderDetail erpPOrderDetail);// 新增采购订单(从表)
    public List<ErpPOrderMaster> findPOderListispoState0();// 查找状态为执行中的采购单
}
