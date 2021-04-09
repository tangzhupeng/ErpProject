package cn.gson.jindie.model.mapper.capitalmapper;


import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ReceiptMapper {

    //查询销货单
    public List<ErpDeliveryOrder> serDeliveryOrder(Integer customerId);

    //根据销货id，查询对应的销货单
    public List<ErpDeliveryOrder> findByDeliveryOrderId(Integer deliveryOrderId);

    //新增收款单
    public void inReceipt(ErpReceipt erpReceipt);

    //新增收款记录单
    public void inReceiptRecord(ErpReceiptRecord receiptRecord);

    //新增收款单时修改客户的欠款金额
    public void upCustomerMoney(ErpReceipt receipt);

    //新增收款单时修改未销金额
    public void upUnverifiedAmount(Double receiptHxMoney,Integer deliveryOrderId);

    //新增收款单时修改账号的金额
    public void upAccountMoney(ErpReceiptRecord receiptRecord);


}
