package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.RoleMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleMapper rolemapper;

    /*新增角色*/
    public void addRole(ErpRole role){

        rolemapper.addRole(role);
    }

    //查询所有员工
    public List<ErpRole> selectAllRole(){
        return rolemapper.selectAllRole();
    }
}
