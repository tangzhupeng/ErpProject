package cn.gson.jindie.model.mapper.permapper;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpEmpRole;
import cn.gson.jindie.model.vo.EmpRoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpRoleMapper {

    //获取员工权限表
    public List<ErpEmpRole> findEmpRole();

    //通过员工角色表修改员工角色
    public void updateEmpRole(Integer roleId,Integer empId,Integer empRoleId);

}
