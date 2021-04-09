package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpMapper;
import cn.gson.jindie.model.mapper.permapper.EmpPerMapper;
import cn.gson.jindie.model.mapper.permapper.LoginMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.vo.EmpPerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmpPerService {
    @Autowired
    private EmpPerMapper empPerMapper;

    @Autowired
    LoginMapper loginMapper;

    //登录
    public ErpEmp findUserLogin(String name){
        return loginMapper.findUserLogin(name);
    }

}
