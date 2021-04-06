package cn.gson.jindie.model.mapper.txymapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyCustomerMapper {
    //分页模糊查询所有客户
    public List<ErpCustomer> allCustomer(ErpCustomer customer);

    //查询所有客户
    public List<ErpCustomer> SerCustomer();

    //新增客户
    public void addCustomer(ErpCustomer customer);

    //查询职员
    public List<ErpEmp> selectUser();

    //查询客户等级
    public List<ErpCustomerGrade> selectGrade();

    //编辑客户
    public void updateCustomer(ErpCustomer customer);

    //删除客户
    public void deleteCustomer(Integer customerId);

    //查询包含销售人员的客户
    public List<ErpCustomer> haveEmp();

    //查询禁用客户
    public List<ErpCustomer> notState();

    //禁用客户
    public void jyCustomer(Integer customerId);

    //恢复客户
    public void hfCustomer(Integer customerId);
}