package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.OrderMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.view.ParameterVo;
import cn.gson.jindie.view.SaleOrderVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public PageInfo<ErpOrder> findAllSaleOrder(ParameterVo parameterVo){

        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());

        PageInfo<ErpOrder> orders = new PageInfo<>(orderMapper.findAllSaleOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));

        System.out.println(orders);
        return orders;
    }


    public PageInfo<ErpDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo) {

        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
            PageInfo<ErpDeliveryOrder> orders = new PageInfo<>(orderMapper.findAllDeliveryOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));
        System.out.println(orders);

        return orders;

    }

    public Boolean addOrder(SaleOrderVo saleOrderVo) {
        ErpOrder order=new ErpOrder();
        order.setOrderId(null);
        order.setOrderNumber(saleOrderVo.getBianHao());
        order.setDocumentDate(saleOrderVo.getDocumentDate());
        order.setAccountReceivable(saleOrderVo.getZonJi());
        order.setDeliveryDate(saleOrderVo.getDeliveryDate());
        order.setErpEmp(new ErpEmp(saleOrderVo.getEmpId()));
        order.setErpStore(new ErpStore(saleOrderVo.getStoreId()));
        order.setErpCustomer(new ErpCustomer(saleOrderVo.getCustomerId()));
        int id = orderMapper.addOrder(order);
        System.out.println(id);
        ErpOrderDetails orderDetails = new ErpOrderDetails();
        List<ErpOrderDetails> list= saleOrderVo.getOrderDetails();
        List<ErpOrderDetails> orderDetailsList=new ArrayList<>();
        for (ErpOrderDetails orderDetail : list) {

        }
        for (int i = 0; i < list.size(); i++) {
            ErpOrderDetails pu=new ErpOrderDetails();
            pu.setErpOrder(new ErpOrder(order.getOrderId()));//采购编号
            pu.setProductName(list.get(i).getProductName());//产品名称

            pu.setNumber(list.get(i).getNumber());
            double v = 0;
            if (list.get(i).getProductPrice() >= 0){
                v = list.get(i).getProductPrice();
            }
            pu.setProductPrice(saleOrderVo.getSalePrice()[i]);//单价
            if (v==0){
                pu.setProductMoney(0.00);
            }else {
                pu.setProductMoney(list.get(i).getNumber()*saleOrderVo.getSalePrice()[i]);//总价
            }
            orderDetailsList.add(pu);
        }
        System.out.println(orderDetailsList);
        int xqing = orderMapper.addOrderDetails(orderDetailsList);
        if (xqing>0&&id>0){
            return true;
        }else {
            return false;
        }
    }

}
