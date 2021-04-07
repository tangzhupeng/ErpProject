package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProductTypeMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyProductTypeService {
    @Autowired
    TxyProductTypeMapper productTypeMapper;

    //查询所有商品类别
    public List<ErpProductType> allProductType(){
        return productTypeMapper.allProductType();
    }
    //根据商品类别id查询商品
    public List<ErpProduct> productType(Integer protypeId){
        return productTypeMapper.productType(protypeId);
    }
    //新增商品类别
    public void addProtype(ErpProductType productType){
        if(productType.getProtypeId()==null){
            productTypeMapper.addProtype(productType);
        }else{
            productTypeMapper.updateProtype(productType);
        }
    }
    //删除商品类别
    public void deleteProType(Integer protypeId){
        productTypeMapper.deleteProType(protypeId);
    }
}
