package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import cn.gson.jindie.model.service.txyservice.TxyStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TxyStoreController {
    @Autowired
    TxyStoreService storeService;

    //查询所有仓库
    @RequestMapping("/all-store")
    @ResponseBody
    public List<ErpStore> allStore(ErpStore store){
        return storeService.allStore(store);
    }

    //新增仓库
    @PostMapping("/add-store")
    @ResponseBody
    public void addStore(ErpStore store){
        storeService.addStore(store);
    }

    //删除仓库
    @GetMapping("/delete-store")
    @ResponseBody
    public void deleteStore(Integer storeId){
        storeService.deleteStore(storeId);
    }
}
