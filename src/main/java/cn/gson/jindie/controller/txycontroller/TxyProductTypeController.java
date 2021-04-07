package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpProductType;
import cn.gson.jindie.model.service.txyservice.TxyProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TxyProductTypeController {
    @Autowired
    TxyProductTypeService productTypeService;

    //查询所有商品类别
    @RequestMapping("/all-ProductType")
    @ResponseBody
    public List<ErpProductType> allProductType(){
        return productTypeService.allProductType();
    }
    //根据商品类别id查询商品
    @RequestMapping("/product-type")
    @ResponseBody
    public List<ErpProduct> productType(Integer protypeId){
        return productTypeService.productType(protypeId);
    }
    //新增商品类别
    @PostMapping("/add-protype")
    @ResponseBody
    public void addProtype(@RequestBody ErpProductType productType){
        productTypeService.addProtype(productType);
    }
    //删除商品类别
    @GetMapping("/delete-proType")
    @ResponseBody
    public void deleteProType(Integer protypeId){
        productTypeService.deleteProType(protypeId);
    }
}
