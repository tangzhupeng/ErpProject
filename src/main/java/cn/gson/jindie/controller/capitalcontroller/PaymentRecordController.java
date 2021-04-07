package cn.gson.jindie.controller.capitalcontroller;

import cn.gson.jindie.model.pojos.capitalpojos.ErpPaymentRecord;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import cn.gson.jindie.model.service.capitalservice.PaymentRecordService;
import cn.gson.jindie.model.service.capitalservice.ReceiptRecordService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PaymentRecordController {

    @Autowired
    PaymentRecordService paymentRecordService;

    //查询所有付款记录
    @RequestMapping("/SerPaymentRecord")
    @ResponseBody
    public Map<String, Object> SerPaymentRecord(Integer pageNum, Integer size, String receiptRecord) {
        Map<String, Object> map = new HashMap<>();

        ErpPaymentRecord  receipt= JSONObject.toJavaObject(JSON.parseObject(receiptRecord), ErpPaymentRecord.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpPaymentRecord> erpReceiptRecords = paymentRecordService.SerPaymentRecord(receipt);
        map.put("total", page.getTotal());
        map.put("rows", erpReceiptRecords);

        return map;
    }


    //根据id删除对应的收款单记录
    @RequestMapping("/DelPaymentId")
    @ResponseBody
    public void DelPaymentId(Integer recordId,String paymentId){
        paymentRecordService.DelPaymentId(recordId,paymentId);
    }

    //批量删除收款记录单
    @RequestMapping("/DelPaymentIdList")
    @ResponseBody
    public void DelPaymentIdList(@RequestBody List<ErpPaymentRecord> paymentRecords){
        paymentRecordService.DelPaymentIdList(paymentRecords);
    }


    //根据id修改对应的审批状态
    @RequestMapping("/upEmpStates")
    @ResponseBody
    public void upEmpStates(@RequestBody List<ErpPaymentRecord> paymentRecords){
        paymentRecordService.upEmpStates(paymentRecords);
    }
}
