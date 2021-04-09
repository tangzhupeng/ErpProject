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
/**
 * 采购订单控制（Controller）层
 * @author wp
 * @Time 2021-4-5
 *
 */
@Controller
public class WpPurchaseController {

    // 采购订单service层
    @Autowired
    WpPurchaseService wpPurchaseService;

    // 员工service层
    @Autowired
    EmpService empService;

     /*
        查询所有采购订单
     */
    @RequestMapping("/purchase-list")
    @ResponseBody
    public Map<String,Object> findPOderList(Integer pageNum,Integer size){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpPOrderMaster> list = wpPurchaseService.findPOderList();
        PageHelper.startPage(pageNum,size);
        map.put("rows",list);
        map.put("total",page.getTotal());
        return map;
    }

    /*
        新增采购订单（主）
     */
    @PostMapping("/addMPurO")
    @ResponseBody
    public String addMPurO(@RequestBody ErpPOrderMaster erpPOrderMaster){
        try {
            wpPurchaseService.addMPurO(erpPOrderMaster);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "新增成功";
    }

    /*
        修改采购订单执行、审核状态
     */
    @PostMapping("/updatepoEastate")
    @ResponseBody
    public String updatepoEastate(@RequestBody ErpPOrderMaster erpPOrderMaster){
        try {
            wpPurchaseService.updatepoEastate(erpPOrderMaster);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "修改成功";
    }

    /*
        查询员工
     */
    @RequestMapping("/find-emp")
    @ResponseBody
    public List<ErpEmp> selectAllEmp(){
        return empService.selectAllEmp();
    }

    /*
        查询仓库
     */
    @RequestMapping("/find-store")
    @ResponseBody
    public List<ErpStore> findStore(){
        return wpPurchaseService.findStore();
    }

    /*
        查询商品
     */
    @RequestMapping("/find-product")
    @ResponseBody
    public List<ErpProduct> allProduct(){
        return wpPurchaseService.allProduct();
    }

    /*
        根据采购订单标号查询对应订单从表
     */
    @RequestMapping("/find-pdid")
    @ResponseBody
    public Map<String,Object> findPOderListpdi(Integer pageNum,Integer size,String poNumber){
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpPOrderDetail> list = wpPurchaseService.findPOderListpdi(poNumber);
        PageHelper.startPage(pageNum,size);
        map.put("rows",list);
        map.put("total",page.getTotal());
        return map;
    }

    /*
        根据采购订单标号查询对应订单主表
     */
    @RequestMapping("/find-pmid")
    @ResponseBody
    public List<ErpPOrderDetail> findPOderListpmi(String poNumber){
        return wpPurchaseService.findPOderListpmi(poNumber);
    }

    /*
        筛选查询
     */
    @RequestMapping("/filter-poderList")
    @ResponseBody
    public Map<String,Object> FilterPOderList(Integer pageNum,Integer size,String erpPOrderMaster){
        ErpPOrderMaster e = JSONObject.toJavaObject(JSON.parseObject(erpPOrderMaster),ErpPOrderMaster.class);
        Map<String,Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpPOrderMaster> e1 = wpPurchaseService.filterPOderList(e);
        PageHelper.startPage(pageNum,size);
        map.put("rows",e1);
        map.put("total",page.getTotal());
        return map;
    }
}
