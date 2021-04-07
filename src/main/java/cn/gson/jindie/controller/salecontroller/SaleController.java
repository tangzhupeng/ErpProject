package cn.gson.jindie.controller.salecontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.orderservice.*;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.view.OrderDetailsVo;
import cn.gson.jindie.view.ParameterVo;
import cn.gson.jindie.view.SaleOrderVo;
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
    private ProductService productService;

    @Autowired
    private StoreService storeService;

    @Autowired
    private EmpService empService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/findAllSaleOrder")
    public PageInfo<ErpOrder> findAllSaleOrder(ParameterVo parameterVo){
        System.out.println(parameterVo);
        PageInfo<ErpOrder> orders = orderService.findAllSaleOrder(parameterVo);
        for (ErpOrder erpOrder : orders.getList()) {
            System.out.println(erpOrder);
        }
        return orders;
    }

    @GetMapping("/findAllDeliveryOrder")
    public PageInfo<ErpDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo){
        System.out.println(parameterVo);
        PageInfo<ErpDeliveryOrder> orders = orderService.findAllDeliveryOrder(parameterVo);
        for (ErpDeliveryOrder erpDeliveryOrder : orders.getList()) {
            System.out.println(erpDeliveryOrder);
        }
        return orders;
    }


    @GetMapping("/orderDetailsVoList/{id}")
    public List<OrderDetailsVo>  orderDetailsVoList(@PathVariable("id") Integer  id) {
        List<OrderDetailsVo> erpOrderDetails = erpOrderDetailsService.orderDetailsVoList(id);
        for (OrderDetailsVo orderDetailsVo : erpOrderDetails) {
            System.out.println(orderDetailsVo);
        }
            return erpOrderDetails;
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






    /**
     * 查询所有产品基础信息
     *
     * @param productName       产品名称
     * @param productNum        产品编号
     * @param productCategories 产品类别
     * @param limit             条数
     * @param page              页码
     * @return
     */
    @GetMapping("/findAllProduct")
    public PageInfo<ErpProduct> findAllProduct(String productName, String productNum, String productCategories, Integer limit, Integer page) {

        PageInfo<ErpProduct> list = productService.findAllProduct(productName, productNum, productCategories, limit, page);
        return list;

    }

    //查询所有客户信息
    @GetMapping("/findAllCustomers")
    public List<ErpCustomer> findAllCustomers() {
        try {
            List<ErpCustomer> erpCustomers = customerService.findAllCustomers();
            for (ErpCustomer erpCustomer : erpCustomers) {
                System.out.println("客户"+erpCustomer);
            }
            return erpCustomers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //查询所有员工信息
    @GetMapping("/findAllEmp")
    public List<ErpEmp> findAllEmp() {
        try {
            List<ErpEmp> erpEmps = empService.findAllEmp();
            for (ErpEmp erpEmp : erpEmps) {
                System.out.println("员工"+erpEmp);
            }
            return erpEmps;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //查询所有仓库信息
    @GetMapping("/findAllStore")
    public List<ErpStore> findAllStore() {
        try {
            List<ErpStore> erpStores = storeService.findAllStore();
            for (ErpStore erpStore : erpStores) {
                System.out.println("仓库"+erpStore);
            }
            return erpStores;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //新增采购单，采购单产品详情
    @PostMapping("/addOrder")
    public String addOrder(@RequestBody SaleOrderVo saleOrderVo) {
        try {
            Boolean aBoolean = orderService.addOrder(saleOrderVo);
            System.out.println(saleOrderVo.toString());
            if (aBoolean){
                return "新增成功";
            }else {
                return "新增失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "新增失败";
    }
}
