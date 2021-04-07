package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyStoreMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyStoreService {
    @Autowired
    TxyStoreMapper storeMapper;

    //查询所有仓库
    public List<ErpStore> allStore(ErpStore store){
        return storeMapper.allStore(store);
    }
    //新增仓库
    public void addStore(ErpStore store){
        if(store.getStoreId()==null){
            storeMapper.addStore(store);
        }else{
            storeMapper.updateStore(store);
        }
    }
    //查看禁用仓库
    public List<ErpStore> byStore(){
        return storeMapper.byStore();
    }
    //根据仓库id查询商品
    public List<ErpProduct> storeGood(Integer storeId){
        return storeMapper.storeGood(storeId);
    }
    //禁用仓库
    public void jyStore(Integer storeId){
        storeMapper.jyStore(storeId);
    }
    //恢复仓库
    public void hfStore(Integer storeId){
        storeMapper.hfStore(storeId);
    }
    //删除仓库
    public void deleteStore(Integer storeId){
        storeMapper.deleteStore(storeId);
    }

    public List<ErpStore> findAllStore() {
        return storeMapper.findAllStore();
    }
}
