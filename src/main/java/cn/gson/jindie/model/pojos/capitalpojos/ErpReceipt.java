package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.perpojos.ErpEmp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "erp_receipt", schema = "", catalog = "erp3")
public class ErpReceipt {
    private String receiptId;
    private Timestamp receiptTime;
    private Double receiptMoney;
    private Double receiptHxmoney;
    private Double receiptYsmoney;
    private String receiptDiscount;
    private String receiptRemark;

    private ErpEmp emp; //收款人
    private ErpEmp empAudit; //审批人
    private ErpCustomer customer; //客户


    @Id
    @Column(name = "receipt_id")
    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }


    @ManyToOne
    @JoinColumn(name = "emp_id")
    public ErpEmp getEmp() {
        return emp;
    }

    public void setEmp(ErpEmp emp) {
        this.emp = emp;
    }



    @ManyToOne
    @JoinColumn(name = "emp_audit_id")
    public ErpEmp getEmpAudit() {
        return empAudit;
    }

    public void setEmpAudit(ErpEmp empAudit) {
        this.empAudit = empAudit;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    public ErpCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ErpCustomer customer) {
        this.customer = customer;
    }



    @Basic
    @Column(name = "receipt_time")
    public Timestamp getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Timestamp receiptTime) {
        this.receiptTime = receiptTime;
    }

    @Basic
    @Column(name = "receipt_money")
    public Double getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Double receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    @Basic
    @Column(name = "receipt_hxmoney")
    public Double getReceiptHxmoney() {
        return receiptHxmoney;
    }

    public void setReceiptHxmoney(Double receiptHxmoney) {
        this.receiptHxmoney = receiptHxmoney;
    }

    @Basic
    @Column(name = "receipt_ysmoney")
    public Double getReceiptYsmoney() {
        return receiptYsmoney;
    }

    public void setReceiptYsmoney(Double receiptYsmoney) {
        this.receiptYsmoney = receiptYsmoney;
    }

    @Basic
    @Column(name = "receipt_discount")
    public String getReceiptDiscount() {
        return receiptDiscount;
    }

    public void setReceiptDiscount(String receiptDiscount) {
        this.receiptDiscount = receiptDiscount;
    }

    @Basic
    @Column(name = "receipt_remark")
    public String getReceiptRemark() {
        return receiptRemark;
    }

    public void setReceiptRemark(String receiptRemark) {
        this.receiptRemark = receiptRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpReceipt that = (ErpReceipt) o;
        return Objects.equals(receiptId, that.receiptId) &&
                Objects.equals(receiptTime, that.receiptTime) &&
                Objects.equals(receiptMoney, that.receiptMoney) &&
                Objects.equals(receiptHxmoney, that.receiptHxmoney) &&
                Objects.equals(receiptYsmoney, that.receiptYsmoney) &&
                Objects.equals(receiptDiscount, that.receiptDiscount) &&
                Objects.equals(receiptRemark, that.receiptRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptId, receiptTime, receiptMoney, receiptHxmoney, receiptYsmoney, receiptDiscount, receiptRemark);
    }

    @Override
    public String toString() {
        return "ErpReceipt{" +
                "receiptId='" + receiptId + '\'' +
                ", receiptTime=" + receiptTime +
                ", receiptMoney=" + receiptMoney +
                ", receiptHxmoney=" + receiptHxmoney +
                ", receiptYsmoney=" + receiptYsmoney +
                ", receiptDiscount='" + receiptDiscount + '\'' +
                ", receiptRemark='" + receiptRemark + '\'' +
                ", emp=" + emp +
                ", empAudit=" + empAudit +
                ", customer=" + customer +
                '}';
    }
}
