package cn.gson.jindie.model.service.capitalservice;


import cn.gson.jindie.model.mapper.capitalmapper.PaymentMapper;
import cn.gson.jindie.model.mapper.capitalmapper.ReceiptMapper;
import cn.gson.jindie.model.mapper.purchasemapper.PurchaseNoteMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyCustomerMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyProductMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyProviderMapper;
import cn.gson.jindie.model.pojos.capitalpojos.ErpPayment;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PaymentService {

    @Autowired
    TxyProviderMapper providerMapper;

    @Autowired
    PaymentMapper paymentMapper;

    @Autowired
    PurchaseNoteMapper purchaseNoteMapper;

    //根据id查询对应的采购单
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber){
      return   purchaseNoteMapper.findAllPurNoteT(boNumber);
    }

    //查询所有的采购单
    public List<ErpBuyingOrder> findAllPurNoteX(){
        return purchaseNoteMapper.findAllPurNoteX();
    }


    //查询所有供货商
    public List<ErpProvider> SerProvider(){
        return providerMapper.findProvider();
    }

    //新增付款单
    public void InPayment(ErpPayment payment){

        if(payment.getPaymentId()==null){
            Date date=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddHHmmss");
            String str = "fk" + sdf.format(date);
            payment.setPaymentId(str);
            payment.setPaymentTime(new Date());

            //新增收款单
            paymentMapper.InPayment(payment);

            //修改客户的欠款金额
            paymentMapper.upProviderMoney(payment);
            //修改销货单的核销金额
//            paymentMapper.upNotConsumed(payment);
            //新增收款单时修改账号的金额
            paymentMapper.upRecordMoney(payment.getPaymentRecord());

            //新增收款单记录
            payment.getPaymentRecord().setPayment(payment);
            payment.getPaymentRecord().setEmpState(1);
            paymentMapper.InPaymentRecord(payment.getPaymentRecord());
        }

    }




}
