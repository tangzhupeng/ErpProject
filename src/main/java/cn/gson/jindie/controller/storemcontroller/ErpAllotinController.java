package cn.gson.jindie.controller.storemcontroller;

import cn.gson.jindie.model.pojos.storempojos.ErpAllot;
import cn.gson.jindie.model.service.storemservice.ErpAllotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ErpAllotinController {
        @Autowired
        private ErpAllotService erpAllotList;
//        查询调拨表
        @RequestMapping("erp/list")
        public List<ErpAllot> erpAlloList(){
            List<ErpAllot> a= erpAllotList.erpAllotList();
           System.out.println(a);
            return  a;
       }
//       修改调拨表

}
