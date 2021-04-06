package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.txyservice.TxyStoreService;
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
public class TxyStoreController {
    @Autowired
    TxyStoreService storeService;

    //分页，模糊查询所有仓库
    @RequestMapping("/all-store")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String stores) {
        Map<String, Object> map = new HashMap<>();

        ErpStore s = JSONObject.toJavaObject(JSON.parseObject(stores), ErpStore.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpStore> ck = storeService.allStore(s);
        map.put("total", page.getTotal());
        map.put("rows", ck);

        return map;
    }

    //新增仓库
    @PostMapping("/add-store")
    @ResponseBody
    public void addStore(@RequestBody ErpStore store){
        System.err.println("新增：" +store.getStoreName());
        storeService.addStore(store);
    }

    //查看禁用仓库
    @RequestMapping("/by-store")
    @ResponseBody
    public List<ErpStore> byStore(){
        return storeService.byStore();
    }

    //根据仓库id查询商品
    @GetMapping("/store-good")
    @ResponseBody
    public List<ErpProduct> storeGood(Integer storeId){
        return storeService.storeGood(storeId);
    }

    //禁用仓库
    @GetMapping("/jy-store")
    @ResponseBody
    public void jyStore(Integer storeId){

        storeService.jyStore(storeId);
    }

    //恢复仓库
    @GetMapping("/hf-store")
    @ResponseBody
    public void hfStore(Integer storeId){
        storeService.hfStore(storeId);
    }

    //删除仓库
    @GetMapping("/delete-store")
    @ResponseBody
    public void deleteStore(Integer storeId){
        storeService.deleteStore(storeId);
    }
}
