package cn.gson.jindie.model.mapper.storemmapper;

import cn.gson.jindie.model.pojos.storempojos.ErpDetailedlist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ErpDelistMapper {

    List<ErpDetailedlist> DetList();
}
