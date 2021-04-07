package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpMapper;
import cn.gson.jindie.model.mapper.permapper.EmpRoleMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpEmpRole;
import cn.gson.jindie.model.vo.EmpRoleVo;
import cn.gson.jindie.model.vo.EmpRoleVos;
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
//        List<EmpRoleVo> empRoleVoList = new ArrayList<>();
//        for(int i=0;i<empRoleVoList.size();i++){
//            EmpRoleVo empRoleVo = new EmpRoleVo();
//            empRoleVo.setEmpRoleId(i+1);
//            empRoleVo.setEmpName(empRoleMapper.findEmpRole().get(i).getEmpName());
//            empRoleVo.setRoleName(empRoleMapper.findEmpRole().get(i).getRoleList().get(0).getRoleName());
//            System.out.print(empRoleVo);
//            empRoleVoList.add(i,empRoleVo);
//
//        }
//            System.out.println(empRoleVoList);
//            System.out.print(empRoleVoList);
//            return empRoleVoList;
        return empRoleMapper.findEmpRole();
        
    }

    public void updateEmpRole(Integer roleId,Integer empId,Integer empRoleId){


        empRoleMapper.updateEmpRole(roleId,empId,empRoleId);

    }


}
