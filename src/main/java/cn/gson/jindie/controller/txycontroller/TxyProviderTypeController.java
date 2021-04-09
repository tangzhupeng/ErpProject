package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import cn.gson.jindie.model.service.txyservice.TxyProviderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TxyProviderTypeController {
    @Autowired
    TxyProviderTypeService providerTypeService;

    /**
     * 查询所有供应商类别
     * @return
     */
    @RequestMapping("/all-ProviderType")
    @ResponseBody
    public List<ErpProviderType> allProviderType(){
        return providerTypeService.allProviderType();
    }

    /**
     * 新增供应商类别
     * @param providerType
     */
    @PostMapping("/add-gys")
    @ResponseBody
    public void addGys(@RequestBody ErpProviderType providerType){
        providerTypeService.addGys(providerType);
    }

    /**
     * 删除供应商类别
     * @param gysId
     */
    @GetMapping("/delete-gys")
    @ResponseBody
    public void deleteProviderType(Integer gysId){
        providerTypeService.deleteProviderType(gysId);
    }

    /**
     * 根据供应商类别id查询供应商
     * @param gysId
     * @return
     */
    @RequestMapping("/gys-type")
    @ResponseBody
    public List<ErpProvider> gysType(Integer gysId){
        return providerTypeService.gysType(gysId);
    }
}
