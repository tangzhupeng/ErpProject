package cn.gson.jindie.model.pojos.txypojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErpCustomer {
    private Integer customerId;
    private String customerName;
    private String customerPeople;
    private String customerPhone;
    private String customerLocation;
    private Double customerMoney;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date customerTime;
    private int customerState;
    private String customerDizhi;

    private ErpEmp emps;

    public ErpCustomer() {
    }

    public ErpCustomer(Integer customerId) {
        this.customerId = customerId;
    }

    public ErpEmp getEmps() {
        return emps;
    }

    public void setEmps(ErpEmp emps) {
        this.emps = emps;
    }

    private ErpCustomerGrade grades;

    public ErpCustomerGrade getGrades() {
        return grades;
    }

    public void setGrades(ErpCustomerGrade grades) {
        this.grades = grades;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPeople() {
        return customerPeople;
    }

    public void setCustomerPeople(String customerPeople) {
        this.customerPeople = customerPeople;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public Double getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(Double customerMoney) {
        this.customerMoney = customerMoney;
    }

    public Date getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(Date customerTime) {
        this.customerTime = customerTime;
    }

    public int getCustomerState() {
        return customerState;
    }

    public void setCustomerState(int customerState) {
        this.customerState = customerState;
    }

    public String getCustomerDizhi() {
        return customerDizhi;
    }

    public void setCustomerDizhi(String customerDizhi) {
        this.customerDizhi = customerDizhi;
    }

    @Override
    public String toString() {
        return "ErpCustomer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPeople='" + customerPeople + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                ", customerMoney=" + customerMoney +
                ", customerTime=" + customerTime +
                ", customerState=" + customerState +
                ", emps=" + emps +
                ", grades=" + grades +
                '}';
    }


}
