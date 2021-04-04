package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<ErpOrder> findAll();
}
