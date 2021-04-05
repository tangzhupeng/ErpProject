package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxxProductMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxxProductService {

    @Autowired

    private TxxProductMapper txxProductMapper;
    //查询所有客户
    public List<ErpProduct> allProduct(){
        return txxProductMapper.allProduct();
    }
}
