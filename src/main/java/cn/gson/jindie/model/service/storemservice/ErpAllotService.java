package cn.gson.jindie.model.service.storemservice;

import cn.gson.jindie.model.mapper.storemmapper.ErpAllotMapper;
import cn.gson.jindie.model.pojos.storempojos.ErpAllot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ErpAllotService {
    @Autowired
    private  ErpAllotMapper erpAllotmapper;

    public List<ErpAllot> erpAllotList(){
        return  erpAllotmapper.erpAllList();
    }
}
