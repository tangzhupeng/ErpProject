package cn.gson.jindie.model.pojos.txypojos;

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
    private Date customerTime;
    private int customerState;

//    private ErpEmpEntity emps;
//
//    @ManyToOne
//    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
//    public ErpEmpEntity getEmps() {
//        return emps;
//    }
//
//    public void setEmps(ErpEmpEntity emps) {
//        this.emps = emps;
//    }

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

    @Override
    public String toString() {
        return "ErpCustomer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPeople='" + customerPeople + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                ", empId=" + empId +
                ", gradeId=" + gradeId +
                ", customerMoney=" + customerMoney +
                ", customerTime=" + customerTime +
                ", customerState=" + customerState +
                ", grades=" + grades +
                '}';
    }
}
