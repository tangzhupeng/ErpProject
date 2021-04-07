package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProductMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyProductService {
    @Autowired
    private TxyProductMapper productMapper;
    //分页，模糊查询所有商品
    public List<ErpProduct> allGoods(ErpProduct product){
        return productMapper.allGoods(product);
    }
    //查询下架商品
    public List<ErpProduct> selectXjGoods(){
        return productMapper.selectXjGoods();
    }
    //新增编辑商品
    public void addGoods(ErpProduct product){
        if(product.getProductId()==null){
            productMapper.addGoods(product);
        }else {
            productMapper.updateGoods(product);
        }
    }
    //下架商品
    public void xjGoods(Integer productId){
        productMapper.xjGoods(productId);
    }
    //重新上架商品
    public void sjGoods(Integer productId){
        productMapper.sjGoods(productId);
    }
    //删除商品
    public void deleteGoods(Integer productId){
        productMapper.deleteGoods(productId);
    }
    //查看商品类别
    public List<ErpProductType> goodType(){
        return productMapper.goodType();
    }
    //查看仓库名称
    public List<ErpStore> storeByName(){
        return productMapper.storeByName();
    }

    /**
     * 查询所有产品基础信息
     * @return
     */
    public PageInfo<ErpProduct> findAllProduct(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        PageHelper.startPage(limit,page);
        return new PageInfo<>(productMapper.findAllProduct(productName,productNum,productCategories));
    }
}
