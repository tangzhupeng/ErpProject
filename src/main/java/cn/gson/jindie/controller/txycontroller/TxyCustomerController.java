package cn.gson.jindie.controller.txycontroller;
import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import cn.gson.jindie.model.service.txyservice.TxyCustomerService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TxyCustomerController {
    @Autowired
    TxyCustomerService customerService;

    //查询所有客户
    @RequestMapping("/all-customer")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String customer) {
        Map<String, Object> map = new HashMap<>();

        ErpCustomer c = JSONObject.toJavaObject(JSON.parseObject(customer), ErpCustomer.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpCustomer> kh = customerService.allCustomer(c);
        map.put("total", page.getTotal());
        map.put("rows", kh);

        return map;
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
    public List<ErpEmp> selectUser(ErpEmp emp){
        return customerService.selectUser(emp);
    }
    //查询客户等级
    @RequestMapping("/select-grade")
    @ResponseBody
    public List<ErpCustomerGrade> selectGrade(){
        return customerService.selectGrade();
    }
    //删除客户
    @GetMapping("/delete-customer")
    @ResponseBody
    public void deleteCustomer(Integer customerId){
        customerService.deleteCustomer(customerId);
    }
}
