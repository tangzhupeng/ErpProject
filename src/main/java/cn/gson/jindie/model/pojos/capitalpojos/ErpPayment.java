package cn.gson.jindie.model.pojos.capitalpojos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "erp_payment", schema = "", catalog = "erp3")
public class ErpPayment {
    private String paymentId;
    private Integer empId;
    private Integer empAuditId;
    private Integer providerId;
    private String boNumber;
    private Timestamp paymentTime;
    private Double paymentMoney;
    private Double paymentHxmoney;
    private Double paymentDiscount;
    private String paymentRemark;

    @Id
    @Column(name = "payment_id")
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
    @Column(name = "provider_id")
    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "bo_number")
    public String getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(String boNumber) {
        this.boNumber = boNumber;
    }

    @Basic
    @Column(name = "payment_time")
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "payment_money")
    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    @Basic
    @Column(name = "payment_hxmoney")
    public Double getPaymentHxmoney() {
        return paymentHxmoney;
    }

    public void setPaymentHxmoney(Double paymentHxmoney) {
        this.paymentHxmoney = paymentHxmoney;
    }

    @Basic
    @Column(name = "payment_discount")
    public Double getPaymentDiscount() {
        return paymentDiscount;
    }

    public void setPaymentDiscount(Double paymentDiscount) {
        this.paymentDiscount = paymentDiscount;
    }

    @Basic
    @Column(name = "payment_remark")
    public String getPaymentRemark() {
        return paymentRemark;
    }

    public void setPaymentRemark(String paymentRemark) {
        this.paymentRemark = paymentRemark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpPayment that = (ErpPayment) o;
        return Objects.equals(paymentId, that.paymentId) &&
                Objects.equals(empId, that.empId) &&
                Objects.equals(empAuditId, that.empAuditId) &&
                Objects.equals(providerId, that.providerId) &&
                Objects.equals(boNumber, that.boNumber) &&
                Objects.equals(paymentTime, that.paymentTime) &&
                Objects.equals(paymentMoney, that.paymentMoney) &&
                Objects.equals(paymentHxmoney, that.paymentHxmoney) &&
                Objects.equals(paymentDiscount, that.paymentDiscount) &&
                Objects.equals(paymentRemark, that.paymentRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, empId, empAuditId, providerId, boNumber, paymentTime, paymentMoney, paymentHxmoney, paymentDiscount, paymentRemark);
    }
}
