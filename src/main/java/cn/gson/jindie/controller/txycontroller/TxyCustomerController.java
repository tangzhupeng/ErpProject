package cn.gson.jindie.controller.txycontroller;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import cn.gson.jindie.model.service.txyservice.TxyCustomerService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TxyCustomerController {
    @Autowired
    TxyCustomerService customerService;

    /**
     * 分页，模糊查询所有客户
     * @param pageNum
     * @param size
     * @param customer
     * @return
     */
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

    /**
     * 新增客户
     * @param customer
     */
    @PostMapping("/add-customer")
    @ResponseBody
    public void addCustomer(@RequestBody ErpCustomer customer){
        customerService.addCustomer(customer);
    }

    /**
     * 查询职员
     * @return
     */
    @RequestMapping("/select-user")
    @ResponseBody
    public List<ErpEmp> selectUser(){
        return customerService.selectUser();
    }

    /**
     * 查询客户等级
     * @return
     */
    @RequestMapping("/select-grade")
    @ResponseBody
    public List<ErpCustomerGrade> selectGrade(){
        return customerService.selectGrade();
    }

    /**
     * 删除客户
     * @param customerId
     */
    @GetMapping("/delete-customer")
    @ResponseBody
    public void deleteCustomer(Integer customerId){
        customerService.deleteCustomer(customerId);
    }

    /**
     * 查询包含销售人员客户
     * @return
     */
    @RequestMapping("/have-emp")
    @ResponseBody
    public List<ErpCustomer> haveEmp(){
        return customerService.haveEmp();
    }

    /**
     * 查询禁用客户
     * @return
     */
    @RequestMapping("/not-state")
    @ResponseBody
    public List<ErpCustomer> notState(){
        return customerService.notState();
    }

    /**
     * 禁用客户
     * @param customerId
     */
    @GetMapping("/jy-customer")
    @ResponseBody
    public void jyCustomer(Integer customerId){
        customerService.jyCustomer(customerId);
    }

    /**
     * 恢复客户
     * @param customerId
     */
    @GetMapping("/hf-customer")
    @ResponseBody
    public void hfCustomer(Integer customerId){
        customerService.hfCustomer(customerId);
    }
}
