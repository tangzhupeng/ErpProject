package cn.gson.jindie.model.service.storemservice;

import cn.gson.jindie.model.mapper.storemmapper.ErpDelistMapper;
import cn.gson.jindie.model.pojos.storempojos.ErpDetailedlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ErpDetailedlistService {
      @Autowired
    private ErpDelistMapper erpDelistMapper;

      public List<ErpDetailedlist> Dellist(){
          return  erpDelistMapper.DetList();
      };
}
