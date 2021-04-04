package cn.gson.jindie.model.pojos.capitalpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_receipt_record", schema = "", catalog = "erp3")
public class ErpReceiptRecord {
    private int reId;
    private String receiptId;
    private Integer accountId;
    private String reWay;
    private String reMark;
    private Double reMoney;
    private String reRemark;

    @Id
    @Column(name = "re_id")
    public int getReId() {
        return reId;
    }

    public void setReId(int reId) {
        this.reId = reId;
    }

    @Basic
    @Column(name = "receipt_id")
    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    @Basic
    @Column(name = "account_id")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "re_way")
    public String getReWay() {
        return reWay;
    }

    public void setReWay(String reWay) {
        this.reWay = reWay;
    }

    @Basic
    @Column(name = "re_mark")
    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

    @Basic
    @Column(name = "re_money")
    public Double getReMoney() {
        return reMoney;
    }

    public void setReMoney(Double reMoney) {
        this.reMoney = reMoney;
    }

    @Basic
    @Column(name = "re_remark")
    public String getReRemark() {
        return reRemark;
    }

    public void setReRemark(String reRemark) {
        this.reRemark = reRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpReceiptRecord that = (ErpReceiptRecord) o;
        return reId == that.reId &&
                Objects.equals(receiptId, that.receiptId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(reWay, that.reWay) &&
                Objects.equals(reMark, that.reMark) &&
                Objects.equals(reMoney, that.reMoney) &&
                Objects.equals(reRemark, that.reRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reId, receiptId, accountId, reWay, reMark, reMoney, reRemark);
    }
}
