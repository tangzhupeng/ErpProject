package cn.gson.jindie.model.service.orderservice;

import cn.gson.jindie.model.mapper.salemapper.StoreMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService  {
    //仓库
    @Autowired
    private StoreMapper storeMapper;

    public List<ErpStore> findAllStore() {
        return storeMapper.findAllStore();
    }
}
