package cn.gson.jindie.controller.purchasecontroller;

import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderDetail;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import cn.gson.jindie.model.service.purchaseservice.WpPurchaseNoteServe;
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
public class WpPurchaseNoteController {
    @Autowired
    WpPurchaseNoteServe wpPurchaseNoteServe;

    @RequestMapping("/find-zpoderlist")
    @ResponseBody
    public List<ErpPOrderMaster> findPOderListispoState0(){
        return wpPurchaseNoteServe.findPOderListispoState0();
    }

    @PostMapping("/addPurNote")
    @ResponseBody
    public String addPurNote(@RequestBody ErpBuyingOrder erpBuyingOrder){
        try {
            System.out.println(1);
            wpPurchaseNoteServe.addPurNote(erpBuyingOrder);
        }catch (Exception e){
            System.out.println(2);
            System.out.println(e.getMessage());
        }
        return "新增成功";
    }

    @RequestMapping("/findAllPurNoteT")
    @ResponseBody
    public List<ErpBuyingOrder> findAllPurNoteT(String boNumber){
        return wpPurchaseNoteServe.findAllPurNoteT(boNumber);
    }

    @RequestMapping("/findAllPurNote")
    @ResponseBody
    public Map<String,Object> findAllPurNote(Integer pageNum, Integer size){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpBuyingOrder> list = wpPurchaseNoteServe.findAllPurNote();
        PageHelper.startPage(pageNum,size);
        map.put("rows",list);
        map.put("total",page.getTotal());
        return map;
    }
}
