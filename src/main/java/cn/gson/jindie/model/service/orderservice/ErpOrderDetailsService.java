package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.ErpOrderDetailsMapper;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.view.OrderDetailsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpOrderDetailsService {
    @Autowired
    private ErpOrderDetailsMapper erpOrderDetailsMapper;

    public List<OrderDetailsVo> orderDetailsVoList(Integer Id) {

        return erpOrderDetailsMapper.orderDetailsVoList(Id);
    }


    public Integer updateOrderStatusById(Integer id) {
        return erpOrderDetailsMapper.updateOrderStatusById(id);
    }

    public Integer updateExecuteStatusById(Integer id) {
        return erpOrderDetailsMapper.updateExecuteStatusById(id);
    }
}
