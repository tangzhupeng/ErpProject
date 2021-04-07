package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    /*新增员工*/
    public void addEmp(ErpEmp emp){
//        int empid = empMapper.getClass().get

        empMapper.addEmp(emp);
    }
    //修改员工状态
    public void updateStatus(){
        empMapper.updateStatus();
    }

    //修改员工信息
    public void updateEmp(ErpEmp emp){
        empMapper.updateEmp(emp.getEmpName(),emp.getPassword(),emp.getPhone(),emp.getEmpId());
    }


    //查询所有员工
    public List<ErpEmp> selectAllEmp(){
        return empMapper.selectAllEmp();
    }

//    根据id删除员工信息
    public Integer deleteEmp(Integer empId){

        return empMapper.deleteEmp(empId);
    }

    public ErpEmp selectByEmpName(String empName){
        return empMapper.selectByEmpName(empName);
    }
}
