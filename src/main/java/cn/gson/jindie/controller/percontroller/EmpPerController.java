package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.EmpPerService;
import cn.gson.jindie.model.service.perservice.LoginService;
import cn.gson.jindie.model.vo.EmpPerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpPerController {
    @Autowired
    EmpPerService empPerService;

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public Object findPerLogin(@RequestBody ErpEmp erpEmp){
        ErpEmp empPerVo = loginService.findUserLogin(erpEmp.getEmpName());
        System.out.println(empPerVo);
        if(empPerVo == null){
            System.out.println("用户不存在");
            return "账号不存在";
        }else if(!empPerVo.getPassword().equals(erpEmp.getPassword())){
            return "密码错误";
        }else{
            System.out.println("登陆成功");
            return empPerVo;
        }

    }

}
