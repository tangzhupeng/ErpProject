package cn.gson.jindie.controller.purchasecontroller;

import cn.gson.jindie.model.service.purchaseservice.WpPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class WpPurchaseController {
    @Autowired
    WpPurchaseService wpPurchaseService;

    @RequestMapping("/purchase-list")
    @ResponseBody
    public List<Map<String,Object>> findPOderList(){
        return wpPurchaseService.findPOderList();
    }

}
