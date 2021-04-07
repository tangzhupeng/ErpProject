package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpRole;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.service.perservice.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    RoleService roleService;

    //新增角色
    @PostMapping("/addRole")
    @ResponseBody
    public void addRole(ErpRole role){

        roleService.addRole(role);
    }

    //查询所有角色
    @GetMapping("/selectAllRole")
    @ResponseBody
    public List<ErpRole> selectAllRole(){
        List<ErpRole> erpRoles = roleService.selectAllRole();
//        System.out.println(erpRoles);
        return erpRoles;
    }

}
