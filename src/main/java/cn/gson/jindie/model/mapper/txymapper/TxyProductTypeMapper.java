package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyProductTypeMapper {
    //查询所有商品类别
    public List<ErpProductType> allProductType();

    //根据商品类别id查询商品
    public List<ErpProduct> productType(Integer protypeId);

    //新增商品类别
    public void addProtype(ErpProductType productType);

    //编辑商品类别
    public void updateProtype(ErpProductType productType);

    //删除商品类别
    public void deleteProType(Integer protypeId);
}
