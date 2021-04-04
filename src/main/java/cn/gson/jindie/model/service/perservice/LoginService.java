package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.LoginMapper;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {
    @Autowired
    LoginMapper loginMapper;

    public ErpEmp findUserLogin(String name){
        return loginMapper.findUserLogin(name);
    }
}
