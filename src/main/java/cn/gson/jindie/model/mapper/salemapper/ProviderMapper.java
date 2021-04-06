package cn.gson.jindie.model.mapper.salemapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ProviderMapper {
    List<ErpProvider> findAllProvider();
}
