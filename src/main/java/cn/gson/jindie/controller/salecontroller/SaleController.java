package cn.gson.jindie.controller.salecontroller;

import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.service.orderservice.ErpOrderDetailsService;
import cn.gson.jindie.model.service.orderservice.OrderService;
import cn.gson.jindie.view.OrderDetailsVo;
import cn.gson.jindie.view.ParameterVo;
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
}
