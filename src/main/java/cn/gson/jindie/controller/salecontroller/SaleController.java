package cn.gson.jindie.controller.salecontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.orderservice.*;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.service.txyservice.TxyCustomerService;
import cn.gson.jindie.model.service.txyservice.TxyProductService;
import cn.gson.jindie.model.service.txyservice.TxyStoreService;
import cn.gson.jindie.model.vo.OrderDetailsVo;
import cn.gson.jindie.model.vo.ParameterVo;
import cn.gson.jindie.model.vo.SaleOrderVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sale")
public class SaleController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ErpOrderDetailsService erpOrderDetailsService;

    @Autowired
    private TxyProductService productService;

    @Autowired
    private TxyStoreService storeService;

    @Autowired
    private EmpService empService;

    @Autowired
    private TxyCustomerService customerService;

    @GetMapping("/findAllSaleOrder")
    public PageInfo<ErpOrder> findAllSaleOrder(ParameterVo parameterVo){
        return orderService.findAllSaleOrder(parameterVo);
    }

    @GetMapping("/findAllDeliveryOrder")
    public PageInfo<ErpDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo){
        return orderService.findAllDeliveryOrder(parameterVo);
    }


    @GetMapping("/orderDetailsVoList/{id}")
    public List<OrderDetailsVo>  orderDetailsVoList(@PathVariable("id") Integer  id) {
            return erpOrderDetailsService.orderDetailsVoList(id);
    }

    @GetMapping("/updateOrderStatusById/{id}")
    public String  updateOrderStatusById(@PathVariable("id") Integer id) {
        if (erpOrderDetailsService.updateOrderStatusById(id) == 1){
            return "修改成功";
        }
        return  "修改失败";
    }
    @GetMapping("/updateExecuteStatusById/{id}")
    public String  updateExecuteStatusById(@PathVariable("id") Integer id) {
        if (erpOrderDetailsService.updateExecuteStatusById(id) == 1){
            return "驳回成功";
        }
        return  "驳回失败";
    }


    @GetMapping("/findAllProduct")
    public PageInfo<ErpProduct> findAllProduct(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        return productService.findAllProduct(productName, productNum, productCategories, limit, page);

    }

    //查询所有客户信息
    @GetMapping("/findAllCustomers")
    public List<ErpCustomer> findAllCustomers() {
        return customerService.findAllCustomers();
    }

    //查询所有员工信息
    @GetMapping("/findAllEmp")
    public List<ErpEmp> findAllEmp() {
        return empService.selectAllEmp();
    }

    //查询所有仓库信息
    @GetMapping("/findAllStore")
    public List<ErpStore> findAllStore() {
        return storeService.findAllStore();
    }

    //新增销售订单，订单产品详情
    @PostMapping("/addOrder")
    public String addOrder(@RequestBody SaleOrderVo saleOrderVo) {
        try {
            if (orderService.addOrder(saleOrderVo)){
                return "新增成功";
            }else {
                return "新增失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "新增失败";
        }
    }
}
