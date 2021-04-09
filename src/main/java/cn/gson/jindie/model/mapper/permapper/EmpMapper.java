package cn.gson.jindie.model.mapper.permapper;


import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper {
    //新增员工
    public void addEmp(ErpEmp emp);
    //修改员工信息
    public void updateEmp(String empName,String password,String phone,Integer empId);
    //修改员工状态
    public void updateStatus();
    //查询所有员工
    public List<ErpEmp> selectAllEmp();
    //删除员工
    public Integer deleteEmp(Integer empId);
    //根据姓名查询员工信息
    public ErpEmp selectByEmpName(String empName);
    //根据id查询员工
    ErpEmp findEmpById(Integer id);

}
