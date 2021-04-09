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

    /**
     * 分页查询所有仓库
     * @param pageNum
     * @param size
     * @param store
     * @return
     */
    @RequestMapping("/all-store")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String store) {
        Map<String, Object> map = new HashMap<>();
        ErpStore s = JSONObject.toJavaObject(JSON.parseObject(store), ErpStore.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpStore> sectors = storeService.allStore(s);
        map.put("total", page.getTotal());
        map.put("rows", sectors);

        return map;
    }

    /**
     * 新增仓库
     * @param store
     */
    @PostMapping("/add-store")
    @ResponseBody
    public void addStore(@RequestBody ErpStore store){
        storeService.addStore(store);
    }

    /**
     * 查看禁用仓库
     * @return
     */
    @RequestMapping("/by-store")
    @ResponseBody
    public List<ErpStore> byStore(){
        return storeService.byStore();
    }

    /**
     * 根据仓库id查询商品
     * @param storeId
     * @return
     */
    @GetMapping("/store-good")
    @ResponseBody
    public List<ErpProduct> storeGood(Integer storeId){
        return storeService.storeGood(storeId);
    }

    /**
     * 禁用仓库
     * @param storeId
     */
    @GetMapping("/jy-store")
    @ResponseBody
    public void jyStore(Integer storeId){

        storeService.jyStore(storeId);
    }

    /**
     * 恢复仓库
     * @param storeId
     */
    @GetMapping("/hf-store")
    @ResponseBody
    public void hfStore(Integer storeId){
        storeService.hfStore(storeId);
    }

    /**
     * 删除仓库
     * @param storeId
     */
    @GetMapping("/delete-store")
    @ResponseBody
    public void deleteStore(Integer storeId){
        storeService.deleteStore(storeId);
    }

    /**
     * 查询仓库
     * @return
     */
    @GetMapping("/queryStore")
    @ResponseBody
    public List<ErpStore> queryStore(){
       return storeService.queryStore();
    }
}
