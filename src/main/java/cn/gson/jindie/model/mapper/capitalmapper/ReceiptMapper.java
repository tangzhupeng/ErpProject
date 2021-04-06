package cn.gson.jindie.model.mapper.capitalmapper;


import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ReceiptMapper {

    //查询销货单
    public List<ErpDeliveryOrder> SerDeliveryOrder();

    //根据销货id，查询对应的销货单
    public List<ErpDeliveryOrder> findByDeliveryOrderId(Integer deliveryOrderId);

    //新增收款单
    public void InReceipt(ErpReceipt erpReceipt);

    //新增收款记录单
    public void InReceiptRecord(ErpReceiptRecord receiptRecord);

}
