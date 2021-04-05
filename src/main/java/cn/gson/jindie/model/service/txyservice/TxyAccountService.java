package cn.gson.jindie.model.service.txyservice;

import cn.gson.jindie.model.mapper.txymapper.TxyAccountMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TxyAccountService {
    @Autowired
    TxyAccountMapper accountMapper;

    //分页，模糊查询所有账户
    public List<ErpAccount> allAccount(ErpAccount account){
        return accountMapper.allAccount(account);
    }

    //查询所有
    public List<ErpAccount> SerAccount(ErpAccount account){
        return accountMapper.SerAccount(account);
    }

    //新增账户
    public void addAccount(ErpAccount account){
        if(account.getAccountId()==null){
            account.setAccountTime(new Date());
            accountMapper.addAccount(account);
        }else{
            accountMapper.updateAccount(account);
        }
    }

    //冻结账户
    public void deleteAccount(Integer accountId){
        accountMapper.deleteAccount(accountId);
    }
}
