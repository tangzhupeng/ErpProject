package cn.gson.jindie.model.service.orderservice;


import cn.gson.jindie.model.mapper.salemapper.ProductMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService{
    //ChoosePslvoicingMapper
    @Autowired
    private ProductMapper productMapper;

    /**
     * 查询所有产品基础信息
     * @return
     */
    public PageInfo<ErpProduct> findAllProduct(String productName, String productNum, String productCategories, Integer limit, Integer page) {
        PageHelper.startPage(limit,page);
        return new PageInfo<>(productMapper.findAllProduct(productName,productNum,productCategories));
    }
}
