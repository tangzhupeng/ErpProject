package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProviderTypeMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TxyProviderTypeService {
    @Autowired
    TxyProviderTypeMapper providerTypeMapper;

    /**
     * 查询所有供应商类别
     * @return
     */
    public List<ErpProviderType> allProviderType(){
        return providerTypeMapper.allProviderType();
    }

    /**
     * 新增供应商类别
     * @param providerType
     */
    public void addGys(ErpProviderType providerType){
        if (providerType.getGysId()==null){
            providerTypeMapper.addGys(providerType);
        }else {
            providerTypeMapper.updateGys(providerType);
        }
    }

    /**
     * 删除供应商类别
     * @param gysId
     */
    public void deleteProviderType(Integer gysId){
        providerTypeMapper.deleteProviderType(gysId);
    }

    /**
     * 根据供应商类别id查询供应商
     * @param gysId
     * @return
     */
    public List<ErpProvider> gysType(Integer gysId){
        return providerTypeMapper.gysType(gysId);
    }
}
