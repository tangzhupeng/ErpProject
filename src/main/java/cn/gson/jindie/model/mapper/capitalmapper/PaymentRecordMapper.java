package cn.gson.jindie.model.mapper.capitalmapper;

import cn.gson.jindie.model.pojos.capitalpojos.ErpPaymentRecord;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PaymentRecordMapper {

    //分页模糊查询所有付款记录单
    public List<ErpPaymentRecord> SerPaymentRecord(ErpPaymentRecord paymentRecord);

    //根据id删除对应的付款单记录
    public void DelRecordId(Integer recordId);

    //根据id删除对应的付款单
    public void DelPaymentId(String paymentId);

    //根据id修改审批状态
    public void upEmpStates(Integer recordId);

}
