package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyStoreMapper {
    //查询所有仓库
    public List<ErpStore> allStore(ErpStore store);

    //新增仓库
    public void addStore(ErpStore store);

    //修改仓库
    public void updateStore(ErpStore store);

    //查看禁用仓库
    public List<ErpStore> byStore();

    //根据仓库id查询商品
    public List<ErpProduct> storeGood(Integer storeId);

    //禁用仓库
    public void jyStore(Integer storeId);

    //恢复仓库
    public void hfStore(Integer storeId);

    //删除仓库
    public void deleteStore(Integer storeId);

    public List<ErpStore> findStore();

    public   List<ErpStore> queryStore( );

    List<ErpStore> findAllStore();
}