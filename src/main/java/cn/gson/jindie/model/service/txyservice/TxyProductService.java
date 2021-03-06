package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProductMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TxyProductService {
    @Autowired
    private TxyProductMapper productMapper;

    /**
     * 模糊查询所有商品
     * @param product
     * @return
     */
    public List<ErpProduct> allGoods(ErpProduct product){
        return productMapper.allGoods(product);
    }

    /**
     * 查询所有下架商品
     * @return
     */
    public List<ErpProduct> selectXjGoods(){
        return productMapper.selectXjGoods();
    }

    /**
     * 新增编辑商品
     * @param product
     */
    public void addGoods(ErpProduct product){
        if(product.getProductId()==null){
            productMapper.addGoods(product);
        }else {
            productMapper.updateGoods(product);
        }
    }
    /**
     * 下架商品
     * @param productId
     */
    public void xjGoods(Integer productId){
        productMapper.xjGoods(productId);
    }

    /**
     * 重新上架商品
     * @param productId
     */
    public void sjGoods(Integer productId){
        productMapper.sjGoods(productId);
    }

    /**
     * 删除商品
     * @param productId
     */
    public void deleteGoods(Integer productId){
        productMapper.deleteGoods(productId);
    }

    /**
     * 查看商品类别
     * @return
     */
    public List<ErpProductType> goodType(){
        return productMapper.goodType();
    }

    /**
     * 查看仓库名称
     * @return
     */
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


    //查询所有商品
    public List<ErpProduct> allProduct2(Integer sid){
        return productMapper.allProduct2(sid);
    }

    public List<ErpProduct> allProduct2s(int  sid){
        return productMapper.allProductState(sid);
    }

    //按状态查询所有商品
    public List<ErpProduct> allProductState2(int  sid ){

        return productMapper.allProductState2(sid);
    }

    //按状态查询所有商品
    public List<ErpProduct> queryProducts(Integer  sid ){

        return productMapper.queryProduct(sid);
    }
}
