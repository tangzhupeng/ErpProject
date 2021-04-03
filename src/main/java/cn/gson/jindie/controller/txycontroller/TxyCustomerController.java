package cn.gson.jindie.controller.txycontroller;

import cn.gson.jindie.model.service.txyservice.TxyCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TxyCustomerController {
    @Autowired
    TxyCustomerService customerService;
}
