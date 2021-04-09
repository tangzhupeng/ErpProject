package cn.gson.jindie.controller.storemcontroller;

import cn.gson.jindie.model.pojos.storempojos.ErpCheck;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.service.storemservice.ErpCheckService;
import cn.gson.jindie.model.service.txyservice.TxyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品的盘点
 */
@RestController
@RequestMapping
public class ErpCheckController {
    @Autowired
    private ErpCheckService erpCheckService;
    @Autowired
    private TxyProductService txyProductService;
    //        查询调拨表
    @RequestMapping("erp/checklist")
    public List<ErpCheck> erpAlloList(Integer  sid){
        return erpCheckService.checkList(sid);
    }

    //查询指定仓库下所有商品
    @RequestMapping("/all-product2")
    @ResponseBody
    public List<ErpProduct> allAccount2(Integer sid){
        return txyProductService.allProduct2(sid);
    }

    //查询已经盘点所有商品
    @GetMapping("/all-productS")
    @ResponseBody
    public List<ErpProduct>  allAccountState(Integer sid) {
        return  txyProductService.allProduct2s(sid);

    }

    //查询未盘点所有商品
    @GetMapping("/all-productS2")
    @ResponseBody
    public List<ErpProduct>  allAccountState2(Integer sid) {

        return   txyProductService.allProductState2(sid);
    }

    //查询指定仓库所有商品
    @GetMapping("/all-queryProductc")
    @ResponseBody
    public List<ErpProduct> queryProductc(Integer sid) {
        return  txyProductService.queryProducts(sid);

    }

}
