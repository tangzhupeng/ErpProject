package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "erp_payment", schema = "", catalog = "erp3")
public class ErpPayment {
    private String paymentId;
    private Timestamp paymentTime;
    private Double paymentMoney;
    private Double paymentHxmoney;
    private Double paymentDiscount;
    private String paymentRemark;

    private ErpEmp emp; //收款人
    private ErpEmp empAudit; //审批人
    private ErpProvider provider; //供货商



    @Id
    @Column(name = "payment_id")
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
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
    @JoinColumn(name = "provider_id")
    public ErpProvider getProvider() {
        return provider;
    }

    public void setProvider(ErpProvider provider) {
        this.provider = provider;
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
                Objects.equals(paymentTime, that.paymentTime) &&
                Objects.equals(paymentMoney, that.paymentMoney) &&
                Objects.equals(paymentHxmoney, that.paymentHxmoney) &&
                Objects.equals(paymentDiscount, that.paymentDiscount) &&
                Objects.equals(paymentRemark, that.paymentRemark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, paymentTime, paymentMoney, paymentHxmoney, paymentDiscount, paymentRemark);
    }

    @Override
    public String toString() {
        return "ErpPayment{" +
                "paymentId='" + paymentId + '\'' +
                ", paymentTime=" + paymentTime +
                ", paymentMoney=" + paymentMoney +
                ", paymentHxmoney=" + paymentHxmoney +
                ", paymentDiscount=" + paymentDiscount +
                ", paymentRemark='" + paymentRemark + '\'' +
                ", emp=" + emp +
                ", empAudit=" + empAudit +
                ", provider=" + provider +
                '}';
    }
}
