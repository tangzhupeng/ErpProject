package cn.gson.jindie.controller.capitalcontroller;

import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceiptRecord;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.service.capitalservice.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiptController {

    @Autowired
    ReceiptService receipt;


    @RequestMapping("/SerDeliveryOrder")
    @ResponseBody
    public List<ErpDeliveryOrder>  SerDeliveryOrder(){
        return receipt.SerDeliveryOrder();
    }

    @RequestMapping("/findByDeliveryOrderId")
    @ResponseBody
    //根据销货id，查询对应的销货单
    public List<ErpDeliveryOrder> findByDeliveryOrderId(Integer deliveryOrderId){
        return receipt.findByDeliveryOrderId(deliveryOrderId);
    }

    @RequestMapping("/SerCustomer")
    @ResponseBody
    //查询所有客户
    public List<ErpCustomer> SerCustomer(){
        return receipt.SerCustomer();
    }

    @RequestMapping("/InReceipt")
    @ResponseBody
    public void InReceipt(@RequestBody ErpReceipt erpReceipt){
        System.out.println("收款单"+erpReceipt);
        System.out.println("收款记录单"+erpReceipt.getReceiptRecords());
        receipt.InReceipt(erpReceipt);
    }
}
