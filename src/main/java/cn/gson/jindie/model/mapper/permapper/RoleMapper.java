package cn.gson.jindie.model.mapper.permapper;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoleMapper {
    //新增员工
    public void addRole(ErpRole role);
    //修改角色信息
    public ErpRole updateRole(ErpRole role);

    //查询所有员工
    public List<ErpRole> selectAllRole();
    //通过角色名查询角色信息
    public Integer selectRoleByName(String roleName);


}
