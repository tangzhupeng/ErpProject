package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<ErpOrder> findAllSaleOrder(@Param("empNameOrStoreNameOrNumber") String empNameOrStoreNameOrNumber,@Param("startTime") String startTime,@Param("endTime") String endTime,@Param("status") Integer status);

    List<ErpDeliveryOrder> findAllDeliveryOrder(@Param("empNameOrStoreNameOrNumber") String empNameOrStoreNameOrNumber,@Param("startTime") String startTime,@Param("endTime") String endTime,@Param("status") Integer status);

    public int addOrder(ErpOrder erpOrder);

    public int addOrderDetails(@Param("erpOrderDetails") List<ErpOrderDetails> erpOrderDetails);
}
