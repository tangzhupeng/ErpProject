package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
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
        List<ErpEmp> erpEmps = empService.selectAllEmp();
//        System.out.println(erpEmps);
        return erpEmps;
    }


    @PostMapping("/updateEmp")
    @ResponseBody
    public void updateEmp(ErpEmp emp){
        System.out.println(emp);
        empService.updateEmp(emp);
    }


//    //删除员工
//    @GetMapping("/deleteEmp")
//    @ResponseBody
//    public void deleteEmp(Integer empid){
//        empService.deleteEmp(empid);
//    }


}
