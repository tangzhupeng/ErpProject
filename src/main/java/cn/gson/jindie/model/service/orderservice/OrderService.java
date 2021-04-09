package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.OrderMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.vo.ParameterVo;
import cn.gson.jindie.model.vo.SaleOrderVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private EmpService empService;

    public PageInfo<ErpOrder> findAllSaleOrder(ParameterVo parameterVo){
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        return new PageInfo<>(orderMapper.findAllSaleOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));
    }


    public PageInfo<ErpDeliveryOrder> findAllDeliveryOrder(ParameterVo parameterVo) {
        PageHelper.startPage(parameterVo.getPageNum(),parameterVo.getPageSize());
        return new PageInfo<>(orderMapper.findAllDeliveryOrder("%"+parameterVo.getEmpNameOrStoreNameOrNumber()+"%",parameterVo.getStartTime(),parameterVo.getEndTime(),parameterVo.getStatus()));

    }

    public Boolean addOrder(SaleOrderVo saleOrderVo) {
        ErpEmp emp = empService.findEmpById(saleOrderVo.getEmpId());

        ErpOrder order=new ErpOrder();
        order.setOrderId(null);
        order.setOrderNumber(saleOrderVo.getBianHao());
        order.setDocumentDate(saleOrderVo.getDocumentDate());
        order.setAccountReceivable(saleOrderVo.getZonJi());
        order.setDeliveryDate(saleOrderVo.getDeliveryDate());
        order.setErpEmp(emp);
        order.setErpStore(new ErpStore(saleOrderVo.getStoreId()));
        order.setErpCustomer(new ErpCustomer(saleOrderVo.getCustomerId()));

        Integer id = orderMapper.addOrder(order);

        ErpOrderDetails orderDetails = new ErpOrderDetails();
        List<ErpOrderDetails> list= saleOrderVo.getOrderDetails();
        List<ErpOrderDetails> orderDetailsList=new ArrayList<>();

        double v = 0;
        for (int i = 0; i < list.size(); i++) {
            ErpOrderDetails erpOrderDetails=new ErpOrderDetails();
            erpOrderDetails.setErpOrder(new ErpOrder(order.getOrderId()));
            erpOrderDetails.setProductName(list.get(i).getProductName());

            erpOrderDetails.setNumber(list.get(i).getNumber());
            if (list.get(i).getProductPrice() >= 0){
                v = list.get(i).getProductPrice();
            }

            erpOrderDetails.setProductPrice(saleOrderVo.getSalePrice()[i]);

            if (v==0){
                erpOrderDetails.setProductMoney(0.00);
            }else {
                erpOrderDetails.setProductMoney(list.get(i).getNumber()*saleOrderVo.getSalePrice()[i]);
            }

            orderDetailsList.add(erpOrderDetails);
        }
        int count = orderMapper.addOrderDetails(orderDetailsList);
        if (count > 0 && id != null){
            return true;
        }else {
            return false;
        }
    }

}
