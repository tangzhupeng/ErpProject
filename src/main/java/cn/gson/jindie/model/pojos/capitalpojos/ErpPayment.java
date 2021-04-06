package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;

import java.sql.Timestamp;

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



    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }


    public ErpEmp getEmp() {
        return emp;
    }

    public void setEmp(ErpEmp emp) {
        this.emp = emp;
    }


    public ErpEmp getEmpAudit() {
        return empAudit;
    }

    public void setEmpAudit(ErpEmp empAudit) {
        this.empAudit = empAudit;
    }


    public ErpProvider getProvider() {
        return provider;
    }

    public void setProvider(ErpProvider provider) {
        this.provider = provider;
    }

    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Double getPaymentHxmoney() {
        return paymentHxmoney;
    }

    public void setPaymentHxmoney(Double paymentHxmoney) {
        this.paymentHxmoney = paymentHxmoney;
    }

    public Double getPaymentDiscount() {
        return paymentDiscount;
    }

    public void setPaymentDiscount(Double paymentDiscount) {
        this.paymentDiscount = paymentDiscount;
    }

    public String getPaymentRemark() {
        return paymentRemark;
    }

    public void setPaymentRemark(String paymentRemark) {
        this.paymentRemark = paymentRemark;
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
