package cn.gson.jindie.model.mapper.permapper;


import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    public ErpEmp findUserLogin(String name);
}
