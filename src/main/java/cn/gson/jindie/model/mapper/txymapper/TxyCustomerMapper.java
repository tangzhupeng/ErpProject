package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyCustomerMapper {
    //查询所有客户
    public List<ErpCustomer> allCustomer(ErpCustomer customer);
    //新增客户
    public void addCustomer(ErpCustomer customer);
    //查询职员
//    public List<ErpEmpEntity> selectUser(ErpEmpEntity emp);
    //编辑客户
    public void updateCustomer(ErpCustomer customer);
    //删除客户
    public void deleteCustomer(Integer customerId);
}
