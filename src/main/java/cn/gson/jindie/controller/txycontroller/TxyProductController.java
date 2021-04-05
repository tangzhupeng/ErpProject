package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.service.txyservice.TxyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TxyProductController {
    @Autowired
     private TxyProductService txyProductService;
    //查询所有商品
    @RequestMapping("/all-product")
    @ResponseBody
    public List<ErpProduct> allAccount(){

        return txyProductService.allProduct();
    }

}
