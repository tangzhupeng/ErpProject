package cn.gson.jindie.model.pojos.txypojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErpAccount {
    private Integer accountId;
    private String accountName;
    private String accountBalance;
    private String accountMoney;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date accountTime;
    private Integer accountState;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(String accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }

    @Override
    public String toString() {
        return "ErpAccount{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", accountMoney='" + accountMoney + '\'' +
                ", accountTime=" + accountTime +
                ", accountState=" + accountState +
                '}';
    }
}
