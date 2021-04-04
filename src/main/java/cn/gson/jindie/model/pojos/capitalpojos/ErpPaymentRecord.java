package cn.gson.jindie.model.pojos.capitalpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_payment_record", schema = "", catalog = "erp3")
public class ErpPaymentRecord {
    private int recordId;
    private String paymentId;
    private Integer accountId;
    private String recordWay;
    private Double recordMoney;
    private String recordRemark;

    @Id
    @Column(name = "record_id")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "payment_id")
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
    @Column(name = "record_way")
    public String getRecordWay() {
        return recordWay;
    }

    public void setRecordWay(String recordWay) {
        this.recordWay = recordWay;
    }

    @Basic
    @Column(name = "record_money")
    public Double getRecordMoney() {
        return recordMoney;
    }

    public void setRecordMoney(Double recordMoney) {
        this.recordMoney = recordMoney;
    }

    @Basic
    @Column(name = "record_remark")
    public String getRecordRemark() {
        return recordRemark;
    }

    public void setRecordRemark(String recordRemark) {
        this.recordRemark = recordRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpPaymentRecord that = (ErpPaymentRecord) o;
        return recordId == that.recordId &&
                Objects.equals(paymentId, that.paymentId) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(recordWay, that.recordWay) &&
                Objects.equals(recordMoney, that.recordMoney) &&
                Objects.equals(recordRemark, that.recordRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, paymentId, accountId, recordWay, recordMoney, recordRemark);
    }
}
