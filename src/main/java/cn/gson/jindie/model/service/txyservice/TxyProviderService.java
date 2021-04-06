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

    //查询所有
    public List<ErpProvider> findProvider(){
        return providerMapper.findProvider();
    }

    //分页，模糊查询所有供应商
    public List<ErpProvider> allProvider(ErpProvider provider){
        return providerMapper.allProvider(provider);
    }

    //查询供应商类别
    public List<ErpProviderType> selectGys(){
        return providerMapper.selectGys();
    }

    //新增供应商
    public void addProvider(ErpProvider provider){
        if(provider.getProviderId()==null){
            provider.setProviderTime(new Date());
            providerMapper.addProvider(provider);
        }else{
            providerMapper.updateProvider(provider);
        }
    }

    //查看应付款金额为0的供应商
    public List<ErpProvider> nullMoney(){
        return providerMapper.nullMoney();
    }

    //禁用供应商
    public void jyProvider(Integer providerId){
        providerMapper.jyProvider(providerId);
    }

    //恢复供应商
    public void hfProvider(Integer providerId){
        providerMapper.hfProvider(providerId);
    }

    //查看禁用供应商
    public List<ErpProvider> findJy(){
        return providerMapper.findJy();
    }

    //删除供应商
    public void deleteProvider(Integer providerId){
        providerMapper.deleteProvider(providerId);
    }
}
