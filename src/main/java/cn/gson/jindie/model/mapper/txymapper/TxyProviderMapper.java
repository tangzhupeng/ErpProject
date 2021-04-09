package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyProviderMapper {
    //查询所有
    public List<ErpProvider> findProvider();

    //分页，模糊查询所有
    public List<ErpProvider> allProvider(ErpProvider provider);

    //查询供应商类别
    public List<ErpProviderType> selectGys();

    //新增供应商
    public void addProvider(ErpProvider Provider);

    //编辑供应商
    public void updateProvider(ErpProvider provider);

    //禁用供应商
    public void jyProvider(Integer providerId);

    //查看禁用供应商
    public List<ErpProvider> findJy();

    //恢复供应商
    public void hfProvider(Integer providerId);

    //删除供应商
    public void deleteProvider(Integer providerId);
}
