package cn.gson.jindie.model.service.storemservice;


import cn.gson.jindie.model.mapper.storemmapper.ErpCheckMapper;
import cn.gson.jindie.model.pojos.storempojos.ErpCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ErpCheckService {
    @Autowired
    private ErpCheckMapper erpCheckMapper;

    public List<ErpCheck>   checkList(Integer sid){

        return  erpCheckMapper.erpCheckList(sid);
    }


}
