package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.service.perservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    //新增员工
    @PostMapping("/addEmp")
    @ResponseBody
    public void addEmp(ErpEmp emp){
        empService.addEmp(emp);
    }



}
