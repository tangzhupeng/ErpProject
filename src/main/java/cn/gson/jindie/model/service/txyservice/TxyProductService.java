package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProductMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyProductService {
    @Autowired
    private TxyProductMapper productMapper;
    //查询所有商品
    public List<ErpProduct> allProduct(){
        return productMapper.allProduct();
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
