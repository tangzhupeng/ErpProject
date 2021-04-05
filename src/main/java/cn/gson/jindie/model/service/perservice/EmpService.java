package cn.gson.jindie.model.service.perservice;

import cn.gson.jindie.model.mapper.permapper.EmpMapper;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpService {
    @Autowired
    EmpMapper empMapper;

    /*新增员工*/
    public void addEmp(ErpEmp emp){

        empMapper.addEmp(emp);
    }
    //修改员工状态
    public void updateStatus(ErpEmp emp){
        empMapper.updateStatus(emp);
    }

    //修改员工信息
    public void updateEmp(ErpEmp emp){
        empMapper.updateEmp(emp);
    }


    //查询所有员工
    public List<ErpEmp> selectAllEmp(){
        return empMapper.selectAllEmp();
    }

}
