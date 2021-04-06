package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.view.OrderDetailsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ErpOrderDetailsMapper {

    List<OrderDetailsVo> orderDetailsVoList(Integer id);

    ErpOrder selectOrderById(Integer id);

    Integer updateOrderStatusById(Integer id);

    Integer updateExecuteStatusById(Integer id);
}
