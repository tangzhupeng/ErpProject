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
    private Integer empId;
    private Integer gradeId;
    private Double customerMoney;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date customerTime;
    private int customerState;

    private ErpEmp emps;

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

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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


}
