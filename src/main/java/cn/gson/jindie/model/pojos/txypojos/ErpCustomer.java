package cn.gson.jindie.model.pojos.txypojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmpEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "erp_customer", schema = "", catalog = "erp3")
public class ErpCustomer {
    private Integer customerId;
    private String customerName;
    private String customerPeople;
    private String customerPhone;
    private String customerLocation;
    private Integer empId;
    private Double customerMoney;
    private Date customerTime;
    private int customerState;

    private ErpEmpEntity emps;

    @ManyToOne
    @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
    public ErpEmpEntity getEmps() {
        return emps;
    }

    public void setEmps(ErpEmpEntity emps) {
        this.emps = emps;
    }

    @Id
    @Column(name = "customer_id")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_people")
    public String getCustomerPeople() {
        return customerPeople;
    }

    public void setCustomerPeople(String customerPeople) {
        this.customerPeople = customerPeople;
    }

    @Basic
    @Column(name = "customer_phone")
    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "customer_location")
    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
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
    @Column(name = "customer_money")
    public Double getCustomerMoney() {
        return customerMoney;
    }

    public void setCustomerMoney(Double customerMoney) {
        this.customerMoney = customerMoney;
    }

    @Basic
    @Column(name = "customer_time")
    public Date getCustomerTime() {
        return customerTime;
    }

    public void setCustomerTime(Date customerTime) {
        this.customerTime = customerTime;
    }

    @Basic
    @Column(name = "customer_state")
    public int getCustomerState() {
        return customerState;
    }

    public void setCustomerState(int customerState) {
        this.customerState = customerState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpCustomer that = (ErpCustomer) o;
        return customerId == that.customerId &&
                customerState == that.customerState &&
                Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerPeople, that.customerPeople) &&
                Objects.equals(customerPhone, that.customerPhone) &&
                Objects.equals(customerLocation, that.customerLocation) &&
                Objects.equals(empId, that.empId) &&
                Objects.equals(customerMoney, that.customerMoney) &&
                Objects.equals(customerTime, that.customerTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerPeople, customerPhone, customerLocation, empId, customerMoney, customerTime, customerState);
    }
}
