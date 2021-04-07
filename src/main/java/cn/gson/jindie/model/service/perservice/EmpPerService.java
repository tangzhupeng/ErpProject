package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpMapper;
import cn.gson.jindie.model.mapper.permapper.EmpPerMapper;
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
        //登录传用户名和密码
        public EmpPerVo findPerLogin(String name) {
            EmpPerVo empPerVo = new EmpPerVo();
            empPerVo.setEmpName(empPerMapper.findPerLogin(name).getEmpName());
            empPerVo.setPassword(empPerMapper.findPerLogin(name).getPassword());
            empPerVo.setRoles(empPerMapper.findPerLogin(name).getPermissionList().get(0).getPerName());

        return empPerVo;
    }
}
