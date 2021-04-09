package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpEmpRole;
import cn.gson.jindie.model.service.perservice.EmpRoleService;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.vo.EmpRoleVo;
import cn.gson.jindie.model.vo.EmpRoleVos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpRoleController {
    @Autowired
    private EmpRoleService empRoleService;

    @Autowired
    private EmpService empService;

    /**
     *查询员工角色
     * @return
     */
    @GetMapping("/selectEmpRole")
    @Transactional
    public List<EmpRoleVo> findEmpRole(){
        List<EmpRoleVo> empRoleVoList = new ArrayList<EmpRoleVo>();
        int i = 0;
        for(;i<empRoleService.findEmpRole().size();i++){
            EmpRoleVo empRoleVo = new EmpRoleVo();
            int empRoleId = empRoleService.findEmpRole().get(i).getEmpRoleId();
            String empName = empRoleService.findEmpRole().get(i).getEmpList().get(0).getEmpName();
            String roleName = empRoleService.findEmpRole().get(i).getRoleList().get(0).getRoleName();
            int statu = empRoleService.findEmpRole().get(i).getEmpList().get(0).getStatu();
            empRoleVo.setEmpRoleId(empRoleId);
            empRoleVo.setEmpName(empName);
            empRoleVo.setRoleName(roleName);
            empRoleVo.setStatu(statu);
            empRoleVoList.add(i,empRoleVo);
        }
        return empRoleVoList;
    }

    /**
     *修改角色
     * @param empRoleVos
     */
    @PostMapping("/updateEmpRole")
    @Transactional
    public void updateEmpRole(EmpRoleVos empRoleVos){
        System.out.print(empRoleVos);
        Integer roleId = empRoleVos.getRoleId();
        Integer empId = empService.selectByEmpName(empRoleVos.getEmpName()).getEmpId();
        Integer empRoleId = empRoleVos.getEmpRoleId();
        empRoleService.updateEmpRole(roleId,empId,empRoleId);
    }

    /**
     * 赋予角色
     * @param erpEmpRole
     */
    @PostMapping("/getEmpRole")
    @Transactional
    public void addEmpRole(ErpEmpRole erpEmpRole){
        empRoleService.addEmpRole(erpEmpRole);
    }


}
