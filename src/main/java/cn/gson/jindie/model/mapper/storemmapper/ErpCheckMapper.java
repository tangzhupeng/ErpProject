package cn.gson.jindie.model.mapper.storemmapper;

import cn.gson.jindie.model.pojos.storempojos.ErpCheck;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ErpCheckMapper {
    List<ErpCheck> erpCheckList();
}
