package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxxProductMapper {
    //查询所有商品
    public List<ErpProduct> allProduct();
}
