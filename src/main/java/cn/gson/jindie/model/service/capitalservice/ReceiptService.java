package cn.gson.jindie.model.service.capitalservice;


import cn.gson.jindie.model.mapper.capitalmapper.ReceiptMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyCustomerMapper;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class ReceiptService {

    @Autowired
    TxyCustomerMapper customerMapper;

    @Autowired
    ReceiptMapper receiptMapper;

    //查询所有销货单
    public List<ErpDeliveryOrder> SerDeliveryOrder(Integer customerId){
        return receiptMapper.SerDeliveryOrder(customerId);
    }

    //根据销货id，查询对应的销货单
    public List<ErpDeliveryOrder> findByDeliveryOrderId(Integer deliveryOrderId){
        return receiptMapper.findByDeliveryOrderId(deliveryOrderId);
    }

    //查询所有客户
    public List<ErpCustomer> SerCustomer(){
        return customerMapper.SerCustomer();
    }

    //新增收款单
    public void InReceipt(ErpReceipt erpReceipt){

        if(erpReceipt.getReceiptId()==null){
            Date date=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddHHmmss");
            String str = "fk" + sdf.format(date);
            erpReceipt.setReceiptId(str);
            erpReceipt.setReceiptTime(new Date());

            //新增收款单
            receiptMapper.InReceipt(erpReceipt);

            //修改客户的欠款金额
            receiptMapper.upCustomerMoney(erpReceipt);
            //修改销货单的核销金额
            receiptMapper.upUnverifiedAmount(erpReceipt.getReceiptHxMoney(),erpReceipt.getReceiptRecords().getDeliveryOrder().getDeliveryOrderId());
            //新增收款单时修改账号的金额
            receiptMapper.upAccountMoney(erpReceipt.getReceiptRecords());

            //新增收款单记录
            erpReceipt.getReceiptRecords().setReceipt(erpReceipt);
            erpReceipt.getReceiptRecords().setEmpState(1);
            receiptMapper.InReceiptRecord(erpReceipt.getReceiptRecords());
        }else {
//            //修改付款单
//            receiptMapper.upReceipt(erpReceipt);
//            //修改付款记录单
//            erpReceipt.getReceiptRecords().setReceipt(erpReceipt);
//            erpReceipt.getReceiptRecords().setEmpState(1);
//            receiptMapper.upReceiptRecord(erpReceipt);
        }

    }




}
