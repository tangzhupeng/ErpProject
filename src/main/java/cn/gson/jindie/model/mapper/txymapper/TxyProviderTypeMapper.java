package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyProviderTypeMapper {
    //查询所有供应商类别
    public List<ErpProviderType> allProviderType();

    //新增供应商类别
    public void addGys(ErpProviderType providerType);

    //编辑供应商类别
    public void updateGys(ErpProviderType providerType);

    //删除供应商类别
    public void deleteProviderType(Integer gysId);

    //根据供应商类别id查询供应商
    public List<ErpProvider> gysType(Integer gysId);
}
