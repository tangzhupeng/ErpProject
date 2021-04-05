package cn.gson.jindie.model.service.txyservice;
import cn.gson.jindie.model.mapper.txymapper.TxyCustomerMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyCustomerService {
    @Autowired
    TxyCustomerMapper customerMapper;

    //查询所有客户
    public List<ErpCustomer> allCustomer(ErpCustomer customer){
        return customerMapper.allCustomer(customer);
    }
    //新增客户
    public void addCustomer(ErpCustomer customer){
        if(customer.getCustomerId()==null){
            customerMapper.addCustomer(customer);
        }else{
            customerMapper.updateCustomer(customer);
        }
    }
    //查询职员
    public List<ErpEmp> selectUser(){
        return customerMapper.selectUser();
    }
    //查询客户等级
    public List<ErpCustomerGrade> selectGrade(){
        return customerMapper.selectGrade();
    }
    //删除客户
    public void deleteCustomer(Integer customerId){
        customerMapper.deleteCustomer(customerId);
    }
}
