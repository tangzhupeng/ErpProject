package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "erp_account", schema = "", catalog = "erp3")
public class ErpAccount {
    private Integer accountId;
    private String accountName;
    private String accountBalance;
    private String accountMoney;
    private Date accountTime;
    private Integer accountState;

    @Id
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "account_name")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "account_balance")
    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Basic
    @Column(name = "account_money")
    public String getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(String accountMoney) {
        this.accountMoney = accountMoney;
    }

    @Basic
    @Column(name = "account_time")
    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    @Basic
    @Column(name = "account_state")
    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpAccount that = (ErpAccount) o;
        return accountId == that.accountId &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accountBalance, that.accountBalance) &&
                Objects.equals(accountMoney, that.accountMoney) &&
                Objects.equals(accountTime, that.accountTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, accountName, accountBalance, accountMoney, accountTime);
    }
}
