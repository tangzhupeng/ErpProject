package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StoreMapper {
    List<ErpStore> findAllStore();
}
