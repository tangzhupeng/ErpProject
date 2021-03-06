package cn.gson.jindie.model.service.txyservice;



import cn.gson.jindie.model.mapper.txymapper.TxyAccountMapper;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class TxyAccountService {
    @Autowired
    TxyAccountMapper accountMapper;

    /**
     * 分页，模糊查询所有账户
     * @param account
     * @return
     */
    public List<ErpAccount> allAccount(ErpAccount account){
        return accountMapper.allAccount(account);
    }

    /**
     * 查询所有账户
     * @return
     */
    public List<ErpAccount> SerAccount(){
        return accountMapper.SerAccount();
    }

    /**
     * 新增账户
     * @param account
     */
    public void addAccount(ErpAccount account){
        if(account.getAccountId()==null){
            account.setAccountBalance(account.getAccountMoney());
            account.setAccountTime(new Date());
            accountMapper.addAccount(account);
        }else{
            accountMapper.updateAccount(account);
        }
    }

    /**
     * 冻结账户
     * @param accountId
     */
    public void deleteAccount(Integer accountId){
        accountMapper.deleteAccount(accountId);
    }

    /**
     * 恢复账户
     * @param accountId
     */
    public void hfAccount(Integer accountId){
        accountMapper.hfAccount(accountId);
    }
}
