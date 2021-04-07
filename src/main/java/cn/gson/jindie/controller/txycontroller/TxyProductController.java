package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.service.txyservice.TxyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TxyProductController {
    @Autowired
     private TxyProductService productService;
    //查询所有商品
    @RequestMapping("/all-product")
    @ResponseBody
    public List<ErpProduct> allAccount(){

        return productService.allProduct();
    }

    //查询所有商品
    @RequestMapping("/all-product2")
    @ResponseBody
    public List<ErpProduct> allAccount2(Integer sid){
        return productService.allProduct2(sid);
    }


    //查询已经盘点所有商品
    @GetMapping("/all-productS")
    @ResponseBody
    public List<ErpProduct>  allAccountState(Integer sid) {
        List<ErpProduct>   e=  productService.allProduct2s(sid);
        return e;
    }

    //查询未盘点所有商品
    @GetMapping("/all-productS2")
    @ResponseBody
    public List<ErpProduct>  allAccountState2(int sid) {
        List<ErpProduct>   e=  productService.allProductState2(sid);
        return e;
    }
    //查询指定仓库所有商品
    @GetMapping("/all-queryProductc")
    @ResponseBody
    public List<ErpProduct> queryProductc(Integer sid) {
        System.out.println("进来了");
        List<ErpProduct>   e=  productService.queryProducts(sid);
        return e;
    }

}
