package cn.gson.jindie.model.service.capitalservice;

import cn.gson.jindie.model.mapper.capitalmapper.ReceiptMapper;
import cn.gson.jindie.model.mapper.txymapper.TxyCustomerMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ReceiptService {

    @Autowired
    TxyCustomerMapper customerMapper;

    //查询所有客户
    public List<ErpCustomer> SerCustomer(){
        return customerMapper.SerCustomer();
    }

}
