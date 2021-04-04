package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.service.txyservice.TxyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TxyCustomerController {
    @Autowired
    TxyCustomerService customerService;

    //查询所有客户
    @RequestMapping("/all-customer")
    @ResponseBody
    public List<ErpCustomer> allCustomer(ErpCustomer customer){
        return customerService.allCustomer(customer);
    }
    //新增客户
    @PostMapping("/add-customer")
    @ResponseBody
    public void addCustomer(ErpCustomer customer){
        customerService.addCustomer(customer);
    }
    //查询职员
    @RequestMapping("/select-user")
    @ResponseBody
    public List<ErpEmpEntity> selectUser(ErpEmpEntity emp){
        return customerService.selectUser(emp);
    }
    //删除客户
    @GetMapping("/delete-customer")
    @ResponseBody
    public void deleteCustomer(Integer customerId){
        customerService.deleteCustomer(customerId);
    }
}
