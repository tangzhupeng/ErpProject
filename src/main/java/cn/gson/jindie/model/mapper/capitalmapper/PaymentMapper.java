package cn.gson.jindie.model.mapper.capitalmapper;


import cn.gson.jindie.model.pojos.capitalpojos.ErpPayment;
import cn.gson.jindie.model.pojos.capitalpojos.ErpPaymentRecord;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface PaymentMapper {


    //新增付款单
    public void InPayment(ErpPayment payment);

    //新增付款记录单
    public void InPaymentRecord(ErpPaymentRecord paymentRecord);

    //新增付款单时修改客户的欠款金额
    public void upProviderMoney(ErpPayment payment);

    //新增付款单时修改未销金额
    public void upNotConsumed(ErpPayment payment);

    //新增付款单时修改账号的金额
    public void upRecordMoney(ErpPaymentRecord paymentRecord);


}
