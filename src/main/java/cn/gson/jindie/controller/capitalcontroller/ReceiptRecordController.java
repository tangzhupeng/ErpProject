package cn.gson.jindie.controller.capitalcontroller;

import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
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
public class ReceiptRecordController {

    @Autowired
    ReceiptRecordService receiptRecordService;

    //查询所有收款记录
    @RequestMapping("/SerReceiptRecord")
    @ResponseBody
    public Map<String, Object> serReceiptRecord(Integer pageNum, Integer size, String receiptRecord) {
        Map<String, Object> map = new HashMap<>();

        ErpReceiptRecord  receipt= JSONObject.toJavaObject(JSON.parseObject(receiptRecord), ErpReceiptRecord.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpReceiptRecord> erpReceiptRecords = receiptRecordService.serReceiptRecord(receipt);
        map.put("total", page.getTotal());
        map.put("rows", erpReceiptRecords);

        return map;
    }


    //根据id删除对应的收款单记录
    @RequestMapping("/DelReId")
    @ResponseBody
    public void delReId(Integer reId,String receiptId){
        receiptRecordService.delReId(reId,receiptId);
    }

    //批量删除收款记录单
    @RequestMapping("/DelReidList")
    @ResponseBody
    public void delReidList(@RequestBody List<ErpReceiptRecord> receiptRecords){
        receiptRecordService.delReidList(receiptRecords);
    }


    //根据id修改对应的审批状态
    @RequestMapping("/upEmpState")
    @ResponseBody
    public void upEmpState(@RequestBody List<ErpReceiptRecord> receiptRecords){
       receiptRecordService.upEmpState(receiptRecords);
    }


}
