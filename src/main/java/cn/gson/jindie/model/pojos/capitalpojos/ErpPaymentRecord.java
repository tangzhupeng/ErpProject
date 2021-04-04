package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.PurchasePojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_payment_record", schema = "", catalog = "erp3")
public class ErpPaymentRecord {
    private int recordId;
    private String recordWay;
    private Double recordMoney;
    private String recordRemark;

    private ErpPayment payment; //付款单
    private ErpAccount account; //结算账号
    private ErpBuyingOrder boNumber; //购货单

    @Id
    @Column(name = "record_id")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }


    @ManyToOne
    @JoinColumn(name = "payment_id")
    public ErpPayment getPayment() {
        return payment;
    }

    public void setPayment(ErpPayment payment) {
        this.payment = payment;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    public ErpAccount getAccount() {
        return account;
    }

    public void setAccount(ErpAccount account) {
        this.account = account;
    }



    @ManyToOne
    @JoinColumn(name = "bo_number")
    public ErpBuyingOrder getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(ErpBuyingOrder boNumber) {
        this.boNumber = boNumber;
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
                Objects.equals(payment, that.payment) &&
                Objects.equals(account, that.account) &&
                Objects.equals(recordWay, that.recordWay) &&
                Objects.equals(recordMoney, that.recordMoney) &&
                Objects.equals(recordRemark, that.recordRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, payment, account, recordWay, recordMoney, recordRemark);
    }

    @Override
    public String toString() {
        return "ErpPaymentRecord{" +
                "recordId=" + recordId +
                ", recordWay='" + recordWay + '\'' +
                ", recordMoney=" + recordMoney +
                ", recordRemark='" + recordRemark + '\'' +
                ", payment=" + payment +
                ", account=" + account +
                ", boNumber=" + boNumber +
                '}';
    }
}
