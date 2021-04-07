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
}
