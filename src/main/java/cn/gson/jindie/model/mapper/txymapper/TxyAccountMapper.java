package cn.gson.jindie.model.mapper.txymapper;

import cn.gson.jindie.model.pojos.txypojos.ErpAccount;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TxyAccountMapper {
    //查询所有账户
    public List<ErpAccount> allAccount(ErpAccount account);
    //新增账户
    public void addAccount(ErpAccount account);
    //编辑账户
    public void updateAccount(Integer accountId);
    //冻结账户
    public void deleteAccount(Integer accountId);
    //恢复账户
    public void hfAccount(Integer accountId);
}