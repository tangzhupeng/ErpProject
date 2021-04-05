package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    //查询所有员工
    @PostMapping("/selectAllEmp")
    @ResponseBody
    public List<ErpEmp> selectAllEmp(){
        List<ErpEmp> erpEmps = empService.selectAllEmp();
        System.out.println(erpEmps);
        return erpEmps;
    }


}