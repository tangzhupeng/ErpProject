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
}
