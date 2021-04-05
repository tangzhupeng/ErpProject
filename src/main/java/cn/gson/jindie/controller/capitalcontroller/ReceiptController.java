package cn.gson.jindie.controller.capitalcontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.service.capitalservice.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceiptController {

    @Autowired
    ReceiptService receipt;

    @RequestMapping("/SerCustomer")
    @ResponseBody
    //查询所有客户
    public List<ErpCustomer> SerCustomer(){
        return receipt.SerCustomer();
    }
}
