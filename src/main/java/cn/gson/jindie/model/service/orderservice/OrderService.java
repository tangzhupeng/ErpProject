package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.OrderMapper;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.view.ParameterVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
