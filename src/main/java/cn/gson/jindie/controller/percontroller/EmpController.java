package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/selectAllEmp")
    @ResponseBody
    public List<ErpEmp> selectAllEmp(){
        return empService.selectAllEmp();
    }


}
