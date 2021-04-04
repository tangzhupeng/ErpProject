package cn.gson.jindie.controller.percontroller;

import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;
import cn.gson.jindie.model.service.perservice.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    @ResponseBody
    public Object findUserLogin(@RequestBody ErpEmp erpEmp){
        System.out.println(erpEmp);
        ErpEmp emp = loginService.findUserLogin(erpEmp.getEmpName());
        if(emp == null){
            System.out.println("用户不存在");
            return "账号不存在";
        }else if(!emp.getPassword().equals(erpEmp.getPassword())){
            return "密码错误";
        }else{
            System.out.println("登陆成功");
            return emp;
        }

    }

//    @GetMapping("/")
//
//    public void shouye(){
//        return ;
//    }


}
