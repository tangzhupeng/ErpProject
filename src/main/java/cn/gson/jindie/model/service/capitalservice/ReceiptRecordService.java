package cn.gson.jindie.model.service.capitalservice;

import cn.gson.jindie.model.mapper.capitalmapper.ReceiptRecordMapper;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReceiptRecordService {

    @Autowired
    ReceiptRecordMapper receiptRecordMapper;

    //分页模糊查询所有付款记录单
    public List<ErpReceiptRecord> SerReceiptRecord(ErpReceiptRecord erpReceiptRecord){
        return receiptRecordMapper.SerReceiptRecord(erpReceiptRecord);
    }

    //根据id删除对应的收款单记录
    public void DelReId(Integer reId,String receiptId){
        receiptRecordMapper.DelReId(reId);
        //根据id删除对应的收款单
        receiptRecordMapper.DelReceiptId(receiptId);

    }

    //批量删除收款记录单
    public void DelReidList(List<ErpReceiptRecord> receiptRecords){
        receiptRecords.forEach(v->{
            receiptRecordMapper.DelReId(v.getReId());
            //根据id删除对应的收款单
            receiptRecordMapper.DelReceiptId(v.getReceipt().getReceiptId());
        });

    }

    //根据id修改审批状态
    public void upEmpState(List<ErpReceiptRecord> receiptRecords){

        receiptRecords.forEach(v->{
            receiptRecordMapper.upEmpState(v.getReId());
        });
    }


}
