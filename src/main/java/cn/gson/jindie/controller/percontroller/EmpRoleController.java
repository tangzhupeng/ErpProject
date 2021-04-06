package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpRoleService;
import cn.gson.jindie.model.vo.EmpRoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmpRoleController {
    @Autowired
    private EmpRoleService empRoleService;

    @GetMapping("/selectEmpRole")
    @Transactional
    public List<ErpEmp> findEmpRole(){
//        List<EmpRoleVo> empRoleVos = new ArrayList<>();
//        empRoleVos.add(empRoleService.findRoleByEmp());
//        System.out.println(empRoleVos);
        System.out.print(empRoleService.findEmpRole());
        return empRoleService.findEmpRole();
    }


}
