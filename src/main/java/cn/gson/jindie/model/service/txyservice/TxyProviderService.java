package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyProviderMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpProviderType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TxyProviderService {
    @Autowired
    TxyProviderMapper providerMapper;

    /**
     * 模糊查询所有供应商
     * @return
     */
    public List<ErpProvider> allProvider(ErpProvider provider){
        return providerMapper.allProvider(provider);
    }

    /**
     * 查询供应商类别
     * @return
     */
    public List<ErpProviderType> selectGys(){
        return providerMapper.selectGys();
    }

    /**
     * 新增供应商
     * @param provider
     */
    public void addProvider(ErpProvider provider){
        if(provider.getProviderId()==null){
            provider.setProviderTime(new Date());
            providerMapper.addProvider(provider);
        }else{
            providerMapper.updateProvider(provider);
        }
    }

    /**
     * 禁用供应商
     * @param providerId
     */
    public void jyProvider(Integer providerId){
        providerMapper.jyProvider(providerId);
    }

    /**
     * 恢复供应商
     * @param providerId
     */
    public void hfProvider(Integer providerId){
        providerMapper.hfProvider(providerId);
    }

    /**
     * 查看禁用供应商
     * @return
     */
    public List<ErpProvider> findJy(){
        return providerMapper.findJy();
    }

    /**
     * 删除供应商
     * @param providerId
     */
    public void deleteProvider(Integer providerId){
        providerMapper.deleteProvider(providerId);
    }

    /**
     * 查询所有供应商
     * @return
     */
    public List<ErpProvider> findProvider(){
        return providerMapper.findProvider();
    }
}
