package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 查询所有产品基础信息
 */
@Mapper
@Repository
public interface ProductMapper {
    /*
    查询所有产品基础信息
     */
    public List<ErpProduct> findAllProduct(@Param("productName") String productName, @Param("productNumber") String productNumber, @Param("protypeId") String protypeId);
}
