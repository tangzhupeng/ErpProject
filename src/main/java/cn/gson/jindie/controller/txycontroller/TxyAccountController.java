package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import cn.gson.jindie.model.service.txyservice.TxyAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TxyAccountController {
    @Autowired
    TxyAccountService accountService;

    //查询所有账户
    @RequestMapping("/all-account")
    @ResponseBody
    public List<ErpAccount> allAccount(ErpAccount account){
        return accountService.allAccount(account);
    }

    //新增账户
    @PostMapping("/add-account")
    @ResponseBody
    public void addAccount(ErpAccount account){
        accountService.addAccount(account);
    }

    //冻结账户
    @GetMapping("/delete-account")
    @ResponseBody
    public void deleteAccount(Integer accountId){
        accountService.deleteAccount(accountId);
    }

    //恢复账户
    @GetMapping("/hf-account")
    @ResponseBody
    public void hfAccount(Integer accountId){
        accountService.hfAccount(accountId);
    }

}
