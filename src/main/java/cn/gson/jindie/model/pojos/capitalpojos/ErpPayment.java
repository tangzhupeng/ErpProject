package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;


public class ErpPayment {
    private String paymentId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date paymentTime;
    private Double paymentMoney;
    private Double paymentHxMoney;
    private Double paymentDiscount;
    private String paymentRemark;
    private String preparedBy;//制单人


    private ErpEmp emp; //收款人
    private ErpProvider provider; //供货商

    private ErpPaymentRecord paymentRecord;//付款记录单


    public ErpPaymentRecord getPaymentRecord() {
        return paymentRecord;
    }

    public void setPaymentRecord(ErpPaymentRecord paymentRecord) {
        this.paymentRecord = paymentRecord;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(Double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public Double getPaymentHxMoney() {
        return paymentHxMoney;
    }

    public void setPaymentHxMoney(Double paymentHxMoney) {
        this.paymentHxMoney = paymentHxMoney;
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

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public ErpEmp getEmp() {
        return emp;
    }

    public void setEmp(ErpEmp emp) {
        this.emp = emp;
    }

    public ErpProvider getProvider() {
        return provider;
    }

    public void setProvider(ErpProvider provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "ErpPayment{" +
                "paymentId='" + paymentId + '\'' +
                ", paymentTime=" + paymentTime +
                ", paymentMoney=" + paymentMoney +
                ", paymentHxMoney=" + paymentHxMoney +
                ", paymentDiscount=" + paymentDiscount +
                ", paymentRemark='" + paymentRemark + '\'' +
                ", preparedBy='" + preparedBy + '\'' +
                ", emp=" + emp +
                ", provider=" + provider +
                ", paymentRecord=" + paymentRecord +
                '}';
    }
}
