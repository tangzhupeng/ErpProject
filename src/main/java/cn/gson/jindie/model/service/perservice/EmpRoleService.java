package cn.gson.jindie.model.service.perservice;


import cn.gson.jindie.model.mapper.permapper.EmpRoleMapper;

import cn.gson.jindie.model.pojos.perpojos.ErpEmpRole;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmpRoleService {
    @Autowired
    private EmpRoleMapper empRoleMapper;

    @Autowired
    private EmpService empService;

    //查询员工角色表
    public List<ErpEmpRole> findEmpRole(){
        return empRoleMapper.findEmpRole();

    }
    //修改角色
    public void updateEmpRole(Integer roleId,Integer empId,Integer empRoleId){
        empRoleMapper.updateEmpRole(roleId,empId,empRoleId);
    }

    //分配角色
    public void addEmpRole(ErpEmpRole erpEmpRole){
        empRoleMapper.addEmpRole(erpEmpRole);
    }


}
