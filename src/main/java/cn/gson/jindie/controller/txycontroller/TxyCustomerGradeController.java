package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import cn.gson.jindie.model.service.txyservice.TxyCustomerGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TxyCustomerGradeController {
    @Autowired
    TxyCustomerGradeService customerGradeService;

    //查询所有客户等级
    @RequestMapping("/all-grade")
    @ResponseBody
    public List<ErpCustomerGrade> allCustomerGrade(){
        return customerGradeService.allCustomerGrade();
    }
    //新增客户等级
    @PostMapping("/add-grade")
    @ResponseBody
    public void addCustomerGrade(@RequestBody ErpCustomerGrade customerGrade){
        customerGradeService.addCustomerGrade(customerGrade);
    }
    //删除客户等级
    @GetMapping("/delete-grade")
    @ResponseBody
    public void deleteCustomerGrade(Integer gradeId){
        customerGradeService.deleteCustomerGrade(gradeId);
    }
    //根据等级id查询客户
    @RequestMapping("/grade-type")
    @ResponseBody
    public List<ErpCustomer> gradeType(Integer gradeId){
        return customerGradeService.gradeType(gradeId);
    }
}
