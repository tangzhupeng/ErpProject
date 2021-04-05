package cn.gson.jindie.controller.storemcontroller;

import cn.gson.jindie.model.pojos.storempojos.ErpCheck;
import cn.gson.jindie.model.service.storemservice.ErpCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ErpCheckController {
    @Autowired
    private ErpCheckService erpCheckService;
    //        查询调拨表
    @RequestMapping("erp/checklist")
    public List<ErpCheck> erpAlloList(){
        List<ErpCheck> a= erpCheckService.checkList();
        System.out.println(a);
        return  a;
    }

}
