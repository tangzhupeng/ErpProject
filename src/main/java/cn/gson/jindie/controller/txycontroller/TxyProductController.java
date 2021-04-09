package cn.gson.jindie.controller.txycontroller;


import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.txyservice.TxyProductService;
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
public class TxyProductController {
    @Autowired
    private TxyProductService productService;

    /**
     * 分页，模糊查询所有商品
     * @param pageNum
     * @param size
     * @param pro
     * @return
     */
    @RequestMapping("/all-goods")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String pro) {
        Map<String, Object> map = new HashMap<>();
        ErpProduct p = JSONObject.toJavaObject(JSON.parseObject(pro), ErpProduct.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpProduct> zh = productService.allGoods(p);
        map.put("total", page.getTotal());
        map.put("rows", zh);
        return map;
    }

    /**
     * 查询所有下架商品
     * @return
     */
    @RequestMapping("/select-xjgoods")
    @ResponseBody
    public List<ErpProduct> selectXjGoods(){
        return productService.selectXjGoods();
    }

    /**
     * 新增编辑商品
     * @param product
     */
    @PostMapping("/add-goods")
    @ResponseBody
    public void addGoods(@RequestBody ErpProduct product){
        productService.addGoods(product);
    }


    /**
     * 下架商品
     * @param productId
     */
    @GetMapping("/xj-goods")
    @ResponseBody
    public void xjGoods(Integer productId){
        productService.xjGoods(productId);
    }

    /**
     * 重新上架商品
     * @param productId
     */
    @GetMapping("/sj-goods")
    @ResponseBody
    public void sjGoods(Integer productId){
        productService.sjGoods(productId);
    }

    /**
     * 删除商品
     * @param productId
     */
    @GetMapping("/delete-goods")
    @ResponseBody
    public void deleteGoods(Integer productId){
        productService.deleteGoods(productId);
    }

    /**
     * 查看商品类别
     * @return
     */
    @RequestMapping("/good-type")
    @ResponseBody
    public List<ErpProductType> goodType(){
        return productService.goodType();
    }

    /**
     * 查看仓库名称
     * @return
     */
    @RequestMapping("/store-byName")
    @ResponseBody
    public List<ErpStore> storeByName(){
        return productService.storeByName();
    }

}

