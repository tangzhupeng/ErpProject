package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface EmpMapper {
    List<ErpEmp> personnelEmpClientList();
}
