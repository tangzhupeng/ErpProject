package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyCustomerGradeMapper {
    //查询所有客户等级
    public List<ErpCustomerGrade> allCustomerGrade();
    //新增客户等级
    public void addCustomerGrade(ErpCustomerGrade customerGrade);
    //编辑客户等级
    public void updateGrade(ErpCustomerGrade customerGrade);
    //删除客户等级
    public void deleteCustomerGrade(Integer gradeId);
    //根据等级id查询客户
    public List<ErpCustomer> gradeType(Integer gradeId);
}
