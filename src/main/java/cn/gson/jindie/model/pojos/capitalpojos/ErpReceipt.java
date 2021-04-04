package cn.gson.jindie.model.pojos.capitalpojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "erp_receipt", schema = "", catalog = "erp3")
public class ErpReceipt {
    private String receiptId;
    private Integer empId;
    private Integer empAuditId;
    private Integer customerId;
    private Integer orderId;
    private Timestamp receiptTime;
    private Double receiptMoney;
    private Double receiptHxmoney;
    private Double receiptYsmoney;
    private String receiptDiscount;
    private String receiptRemark;

    @Id
    @Column(name = "receipt_id")
    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    @Basic
    @Column(name = "emp_id")
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "emp_audit_id")
    public Integer getEmpAuditId() {
        return empAuditId;
    }

    public void setEmpAuditId(Integer empAuditId) {
        this.empAuditId = empAuditId;
    }

    @Basic
    @Column(name = "customer_id")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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
                Objects.equals(empId, that.empId) &&
                Objects.equals(empAuditId, that.empAuditId) &&
                Objects.equals(customerId, that.customerId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(receiptTime, that.receiptTime) &&
                Objects.equals(receiptMoney, that.receiptMoney) &&
                Objects.equals(receiptHxmoney, that.receiptHxmoney) &&
                Objects.equals(receiptYsmoney, that.receiptYsmoney) &&
                Objects.equals(receiptDiscount, that.receiptDiscount) &&
                Objects.equals(receiptRemark, that.receiptRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptId, empId, empAuditId, customerId, orderId, receiptTime, receiptMoney, receiptHxmoney, receiptYsmoney, receiptDiscount, receiptRemark);
    }
}
