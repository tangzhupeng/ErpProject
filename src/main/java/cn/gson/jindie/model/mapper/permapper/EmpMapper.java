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
    public ErpEmp updateEmp(ErpEmp emp);
    //修改员工状态
    public int updateStatus(ErpEmp emp);
    //查询所有员工
    public List<ErpEmp> selectAllEmp();
//    //删除员工
//    public int deleteEmp(Integer empid);
}
