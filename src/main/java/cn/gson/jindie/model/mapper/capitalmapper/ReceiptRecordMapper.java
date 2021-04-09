package cn.gson.jindie.model.mapper.capitalmapper;

import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReceiptRecordMapper {

    //分页模糊查询所有付款记录单
    public List<ErpReceiptRecord> serReceiptRecord(ErpReceiptRecord erpReceiptRecord);

    //根据id删除对应的收款单记录
    public void delReId(Integer reId);

    //根据id删除对应的收款单
    public void delReceiptId(String receiptId);

    //根据id修改审批状态
    public void upEmpState(Integer reId);

}
