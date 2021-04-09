package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import cn.gson.jindie.model.service.txyservice.TxyProviderService;
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

public class TxyProviderController {
    @Autowired
    TxyProviderService providerService;

    /**
     * 分页，模糊查询所有供应商
     * @param pageNum
     * @param size
     * @param provider
     * @return
     */
    @RequestMapping("/all-provider")
    @ResponseBody
    public Map<String, Object> demo(Integer pageNum, Integer size, String provider) {
        Map<String, Object> map = new HashMap<>();

        ErpProvider p = JSONObject.toJavaObject(JSON.parseObject(provider), ErpProvider.class);
        Page<Object> page = PageHelper.startPage(pageNum, size);
        List<ErpProvider> ep = providerService.allProvider(p);
        map.put("total", page.getTotal());
        map.put("rows", ep);

        return map;
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/find-provider")
    @ResponseBody
    public List<ErpProvider> findProvider(){
        return providerService.findProvider();
    }

    /**
     * 查询供应商类别
     * @return
     */
    @GetMapping("/select-gys")
    @ResponseBody
    public List<ErpProviderType> selectGys(){
        return providerService.selectGys();
    }

    /**
     * 新增供应商
     * @param provider
     */
    @PostMapping("/add-provider")
    @ResponseBody
    public void addProvider(@RequestBody ErpProvider provider){
        providerService.addProvider(provider);
    }

    /**
     * 禁用供应商
     * @param providerId
     */
    @GetMapping("/jy-provider")
    @ResponseBody
    public void jyProvider(Integer providerId){
        providerService.jyProvider(providerId);
    }

    /**
     * 查看禁用供应商
     * @return
     */
    @RequestMapping("/find-jy")
    @ResponseBody
    public List<ErpProvider> findJy(){
        return providerService.findJy();
    }

    /**
     * 恢复供应商
     * @param providerId
     */
    @GetMapping("/hf-provider")
    @ResponseBody
    public void hfProvider(Integer providerId){
        providerService.hfProvider(providerId);
    }

    /**
     * 删除供应商
     * @param providerId
     */
    @GetMapping("/delete-provider")
    @ResponseBody
    public void deleteProvider(Integer providerId){
        providerService.deleteProvider(providerId);
    }
}
