package cn.gson.jindie.model.mapper.txymapper;


import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyProductMapper {
    //查询所有商品
    public List<ErpProduct> allProduct();


    //查询所有商品
    public List<ErpProduct> allProduct2(Integer sid);
    //    按状态查询
    List<ErpProduct> allProductState(int sid);

    List<ErpProduct>    allProductState2(int sid);
    //     按仓库查询所有商品
    List<ErpProduct>    queryProduct(Integer sid );
}
