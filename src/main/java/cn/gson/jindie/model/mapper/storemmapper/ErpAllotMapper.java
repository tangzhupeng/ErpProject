package cn.gson.jindie.model.mapper.storemmapper;

import cn.gson.jindie.model.pojos.storempojos.ErpAllot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface ErpAllotMapper {
    void addAllotm(List<ErpAllot> erpAllot);

}
