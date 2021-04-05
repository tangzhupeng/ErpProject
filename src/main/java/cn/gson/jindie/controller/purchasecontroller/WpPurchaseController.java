package cn.gson.jindie.controller.purchasecontroller;

import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import cn.gson.jindie.model.service.purchaseservice.WpPurchaseService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WpPurchaseController {
    @Autowired
    WpPurchaseService wpPurchaseService;

    @RequestMapping("/purchase-list")
    @ResponseBody
    public Map<String,Object> findPOderList(Integer pageNum,Integer size){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<Map<String,Object>> list = wpPurchaseService.findPOderList();
        PageHelper.startPage(pageNum,size);
        map.put("rows",list);
        map.put("total",page.getTotal());
        return map;
    }

    @PostMapping("/addMPurO")
    @ResponseBody
    public String addMPurO(@RequestBody ErpPOrderMaster erpPOrderMaster){
        System.out.println(erpPOrderMaster);
        try {
            System.out.println(1);
            wpPurchaseService.addMPurO(erpPOrderMaster);
        }catch (Exception e){
            System.out.println(2);
            System.out.println(e.getMessage());
        }
        return "新增成功";
    }

}
