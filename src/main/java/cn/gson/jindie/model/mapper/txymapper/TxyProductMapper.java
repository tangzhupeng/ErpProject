package cn.gson.jindie.model.mapper.txymapper;


import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyProductMapper {
    //分页，模糊查询所有商品
    public List<ErpProduct> allGoods(ErpProduct product);
    //查询下架商品
    public List<ErpProduct> selectXjGoods();
    //新增商品
    public void addGoods(ErpProduct product);
    //编辑商品
    public void updateGoods(ErpProduct product);
    //下架商品
    public void xjGoods(Integer productId);
    //重新上架商品
    public void sjGoods(Integer productId);
    //删除商品
    public void deleteGoods(Integer productId);
    //查看商品类别
    public List<ErpProductType> goodType();
    //查看仓库名称
    public List<ErpStore> storeByName();


    //查询所有商品
    public List<ErpProduct> allProduct2(Integer sid);
    //    按状态查询
    List<ErpProduct> allProductState(int sid);

    List<ErpProduct>    allProductState2(int sid);
    //     按仓库查询所有商品
    List<ErpProduct>    queryProduct(Integer sid );
    /*
        查询所有产品基础信息
    */
    public List<ErpProduct> findAllProduct(@Param("productName") String productName, @Param("productNumber") String productNumber, @Param("protypeId") String protypeId);
}
