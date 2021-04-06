package cn.gson.jindie.model.mapper.permapper;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.vo.EmpRoleVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpRoleMapper {

    //通过员工id获取权限
    public List<ErpEmp> findEmpRole();

}
