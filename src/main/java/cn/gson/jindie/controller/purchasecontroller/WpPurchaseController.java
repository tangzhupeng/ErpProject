package cn.gson.jindie.controller.purchasecontroller;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderDetail;
import cn.gson.jindie.model.pojos.purchasepojos.ErpPOrderMaster;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.perservice.EmpService;
import cn.gson.jindie.model.service.purchaseservice.WpPurchaseService;
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
public class WpPurchaseController {
    @Autowired
    WpPurchaseService wpPurchaseService;

    @Autowired
    EmpService empService;

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
        try {
            System.out.println(1);
            wpPurchaseService.addMPurO(erpPOrderMaster);
        }catch (Exception e){
            System.out.println(2);
            System.out.println(e.getMessage());
        }
        return "新增成功";
    }
//
//    @PostMapping("/addDPurO")
//    @ResponseBody
//    public String addDPurO(@RequestBody ErpPOrderDetail erpPOrderDetail){
//        System.out.println(erpPOrderDetail);
//        try {
//            System.out.println(1);
//            wpPurchaseService.addDPurO(erpPOrderDetail);
//        }catch (Exception e){
//            System.out.println(2);
//            System.out.println(e.getMessage());
//        }
//        return "新增成功";
//    }

    @PostMapping("/updatepoEastate")
    @ResponseBody
    public String updatepoEastate(@RequestBody ErpPOrderMaster erpPOrderMaster){
        try {
            System.out.println(1);
            wpPurchaseService.updatepoEastate(erpPOrderMaster);
        }catch (Exception e){
            System.out.println(2);
            System.out.println(e.getMessage());
        }
        return "修改成功";
    }


    @RequestMapping("/find-provider")
    @ResponseBody
    public List<ErpProvider> findProvider(){
        return wpPurchaseService.findProvider();
    }

    @RequestMapping("/find-emp")
    @ResponseBody
    public List<ErpEmp> selectAllEmp(){
        return empService.selectAllEmp();
    }

    @RequestMapping("/find-store")
    @ResponseBody
    public List<ErpStore> findStore(){
        return wpPurchaseService.findStore();
    }

    @RequestMapping("/find-product")
    @ResponseBody
    public List<ErpProduct> allProduct(){
        return wpPurchaseService.allProduct();
    }

    @RequestMapping("/find-pdid")
    @ResponseBody
    public List<ErpPOrderDetail> findPOderListpdi(String poNumber){
        return wpPurchaseService.findPOderListpdi(poNumber);
    }

    @RequestMapping("/find-pmid")
    @ResponseBody
    public List<ErpPOrderDetail> findPOderListpmi(String poNumber){
        return wpPurchaseService.findPOderListpmi(poNumber);
    }

//筛选
    @RequestMapping("/filter-poderList")
    @ResponseBody
    public Map<String,Object> FilterPOderList(Integer pageNum,Integer size,String erpPOrderMaster){
        ErpPOrderMaster e = JSONObject.toJavaObject(JSON.parseObject(erpPOrderMaster),ErpPOrderMaster.class);
        System.out.println(e);
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpPOrderMaster> e1 = wpPurchaseService.filterPOderList(e);
        PageHelper.startPage(pageNum,size);
        System.out.println(e1);
        map.put("rows",e1);
        map.put("total",page.getTotal());
        return map;
    }
}
