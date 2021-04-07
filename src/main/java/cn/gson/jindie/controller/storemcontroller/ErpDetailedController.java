package cn.gson.jindie.controller.storemcontroller;

import cn.gson.jindie.model.mapper.storemmapper.ErpDelistMapper;
import cn.gson.jindie.model.pojos.storempojos.ErpCheck;
import cn.gson.jindie.model.pojos.storempojos.ErpDetailedlist;
import cn.gson.jindie.model.service.storemservice.ErpCheckService;
import cn.gson.jindie.model.service.storemservice.ErpDetailedlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ErpDetailedController {
    @Autowired
  private ErpDetailedlistService erpDetailedlistService;
    //        查询调拨表
    @RequestMapping("erp/Detailedlist")
    public List<ErpDetailedlist> Detailedlist(){
        List<ErpDetailedlist> dellist = erpDetailedlistService.Dellist();
        return  dellist;
    }
}
