package cn.gson.jindie.model.service.capitalservice;

import cn.gson.jindie.model.mapper.capitalmapper.PaymentRecordMapper;
import cn.gson.jindie.model.mapper.capitalmapper.ReceiptRecordMapper;
import cn.gson.jindie.model.pojos.capitalpojos.ErpPaymentRecord;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentRecordService {

    @Autowired
    PaymentRecordMapper recordMapper;

    //分页模糊查询所有付款记录单
    public List<ErpPaymentRecord> serPaymentRecord(ErpPaymentRecord paymentRecord){
        return recordMapper.serPaymentRecord(paymentRecord);
    }

    //根据id删除对应的付款单记录
    public void delPaymentId(Integer recordId,String paymentId){
        recordMapper.delRecordId(recordId);
        //根据id删除对应的收款单
        recordMapper.delPaymentId(paymentId);

    }

    //批量删除付款记录单
    public void delPaymentIdList(List<ErpPaymentRecord> paymentRecords){
        paymentRecords.forEach(v->{
            recordMapper.delRecordId(v.getRecordId());
            //根据id删除对应的收款单
            recordMapper.delPaymentId(v.getPayment().getPaymentId());
        });

    }

    //根据id修改审批状态
    public void upEmpStates(List<ErpPaymentRecord> paymentRecords){
        paymentRecords.forEach(v->{
            recordMapper.upEmpStates(v.getRecordId());
        });
    }
}
