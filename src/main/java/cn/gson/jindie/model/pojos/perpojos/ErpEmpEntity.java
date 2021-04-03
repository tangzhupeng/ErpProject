package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_emp", schema = "erp3", catalog = "")
public class ErpEmpEntity {
    private int empId;
    private String empName;
    private String password;
    private String phone;
    private Integer statu;

    @Id
    @Column(name = "emp_id")
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "emp_name")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "statu")
    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpEmpEntity that = (ErpEmpEntity) o;
        return empId == that.empId &&
                Objects.equals(empName, that.empName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(statu, that.statu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, password, phone, statu);
    }
}
