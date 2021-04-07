package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyCustomerGradeMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomerGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyCustomerGradeService {
    @Autowired
    TxyCustomerGradeMapper customerGradeMapper;

    //查询所有客户等级
    public List<ErpCustomerGrade> allCustomerGrade(){
        return customerGradeMapper.allCustomerGrade();
    }
    //新增客户等级
    public void addCustomerGrade(ErpCustomerGrade customerGrade){
        if(customerGrade.getGradeId()==null){
            customerGradeMapper.addCustomerGrade(customerGrade);
        }else{
            customerGradeMapper.updateGrade(customerGrade);
        }
    }
    //删除客户等级
    public void deleteCustomerGrade(Integer gradeId){
        customerGradeMapper.deleteCustomerGrade(gradeId);
    }
    //根据等级id查询客户
    public List<ErpCustomer> gradeType(Integer gradeId){
        return customerGradeMapper.gradeType(gradeId);
    }
}
