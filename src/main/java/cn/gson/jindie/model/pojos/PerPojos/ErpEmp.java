package cn.gson.jindie.model.pojos.PerPojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_emp", schema = "", catalog = "erp3")
public class ErpEmp {
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

        ErpEmp erpEmp = (ErpEmp) o;

        if (empId != erpEmp.empId) return false;
        if (empName != null ? !empName.equals(erpEmp.empName) : erpEmp.empName != null) return false;
        if (password != null ? !password.equals(erpEmp.password) : erpEmp.password != null) return false;
        if (phone != null ? !phone.equals(erpEmp.phone) : erpEmp.phone != null) return false;
        if (statu != null ? !statu.equals(erpEmp.statu) : erpEmp.statu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ErpEmp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", statu=" + statu +
                '}';
    }
}
