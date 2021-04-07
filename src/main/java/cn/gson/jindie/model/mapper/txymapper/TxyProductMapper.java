package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.apache.ibatis.annotations.Mapper;
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
}
