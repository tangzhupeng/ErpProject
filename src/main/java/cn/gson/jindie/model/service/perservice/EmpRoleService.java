package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpRoleMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.vo.EmpRoleVo;
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

    public List<ErpEmp> findEmpRole(){
//        List<EmpRoleVo> empRoleVoList = new ArrayList<EmpRoleVo>();
//        for(int i=0;i<empRoleVoList.size();i++){
//            EmpRoleVo empRoleVo = new EmpRoleVo();
//            empRoleVo.setEmpRoleId(i+1);
//            empRoleVo.setEmpName(empRoleMapper.findEmpRole().get(i).getEmpName());
//            empRoleVo.setRoleName(empRoleMapper.findEmpRole().get(i).getRoleList().get(0).getRoleName());
//            System.out.print(empRoleVo);
//            empRoleVoList.add(empRoleVo);
//        }
////            System.out.println(empRoleVoList);
//            System.out.print(empRoleVoList);
//            return empRoleVoList;
        return empRoleMapper.findEmpRole();
        
    }
}
