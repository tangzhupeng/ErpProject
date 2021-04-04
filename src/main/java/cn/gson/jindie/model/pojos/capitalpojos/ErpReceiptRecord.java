package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_receipt_record", schema = "", catalog = "erp3")
public class ErpReceiptRecord {
    private int reId;
    private String reWay;
    private String reMark;
    private Double reMoney;
    private String reRemark;

    private ErpReceipt receiptId;
    private ErpAccount accountId; //
    private ErpOrder order; //销售订单


    @Id
    @Column(name = "re_id")
    public int getReId() {
        return reId;
    }

    public void setReId(int reId) {
        this.reId = reId;
    }


    @ManyToOne
    @JoinColumn(name = "receipt_id")
    public ErpReceipt getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(ErpReceipt receiptId) {
        this.receiptId = receiptId;
    }

    @ManyToOne
    @JoinColumn(name = "account_id")
    public ErpAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(ErpAccount accountId) {
        this.accountId = accountId;
    }


    @ManyToOne
    @JoinColumn(name = "order_id")
    public ErpOrder getOrder() {
        return order;
    }

    public void setOrder(ErpOrder order) {
        this.order = order;
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


    @Override
    public String toString() {
        return "ErpReceiptRecord{" +
                "reId=" + reId +
                ", reWay='" + reWay + '\'' +
                ", reMark='" + reMark + '\'' +
                ", reMoney=" + reMoney +
                ", reRemark='" + reRemark + '\'' +
                ", receiptId=" + receiptId +
                ", accountId=" + accountId +
                ", order=" + order +
                '}';
    }
}
