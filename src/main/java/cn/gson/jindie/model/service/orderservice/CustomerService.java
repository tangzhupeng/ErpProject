package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.CustomerMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    //供货商
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询所有客户
     * @return
     */
    public List<ErpCustomer> findAllCustomers() {
        return customerMapper.findAllCustomers();
    }
}
