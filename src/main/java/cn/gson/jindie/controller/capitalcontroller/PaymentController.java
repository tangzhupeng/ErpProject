package cn.gson.jindie.controller.capitalcontroller;

import cn.gson.jindie.model.pojos.capitalpojos.ErpPayment;
import cn.gson.jindie.model.pojos.capitalpojos.ErpReceipt;
import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.service.capitalservice.PaymentService;
import cn.gson.jindie.model.service.capitalservice.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @RequestMapping("/findAllPurNoteTT")
    @ResponseBody
    //根据id查询对应的采购单
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber){
        return   paymentService.findAllPurNoteT(boNumber);
    }

    @RequestMapping("/findAllPurNoteXX")
    @ResponseBody
    //查询所有的采购单
    public List<ErpBuyingOrder> findAllPurNoteX(){
        return paymentService.findAllPurNoteX();
    }


    @RequestMapping("/SerProvider")
    @ResponseBody
    //查询所有供货商
    public List<ErpProvider> SerProvider(){
        return paymentService.SerProvider();
    }

    @RequestMapping("/InPayment")
    @ResponseBody
    public void InPayment(@RequestBody ErpPayment payment){
        System.out.println("付款单"+payment);
        paymentService.InPayment(payment);
    }
}
