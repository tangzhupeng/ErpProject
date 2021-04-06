package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import cn.gson.jindie.model.service.txyservice.TxyAccountService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TxyAccountController {
    @Autowired
    TxyAccountService accountService;

    //分页，模糊查询所有账户
    @RequestMapping("/all-account")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String acc) {
        Map<String, Object> map = new HashMap<>();

        ErpAccount a = JSONObject.toJavaObject(JSON.parseObject(acc), ErpAccount.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpAccount> zh = accountService.allAccount(a);
        map.put("total", page.getTotal());
        map.put("rows", zh);

        return map;
    }

    //查询所有
    @RequestMapping("/Ser-account")
    @ResponseBody
    public List<ErpAccount> SerAccount(){
        return accountService.SerAccount();
    }

    //新增账户
    @PostMapping("/add-account")
    @ResponseBody
    public void addAccount(@RequestBody ErpAccount account){
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
