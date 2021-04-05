package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyStoreMapper {
    //查询所有仓库
    public List<ErpStore> allStore(ErpStore stores);
    //新增仓库
    public void addStore(ErpStore store);
    //修改仓库
    public void updateStore(ErpStore store);
    //删除仓库
    public void deleteStore(Integer storeId);
}
