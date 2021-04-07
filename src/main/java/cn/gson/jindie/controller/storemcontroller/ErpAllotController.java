package cn.gson.jindie.controller.storemcontroller;

import cn.gson.jindie.model.service.storemservice.ErpAllotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class ErpAllotController {

    @Autowired
    private ErpAllotService  erpAllotService;

    @GetMapping("erp/addAllot")
    @ResponseBody
    public void erpAlloList( String  arr){
        System.out.println(arr);

    }

}
