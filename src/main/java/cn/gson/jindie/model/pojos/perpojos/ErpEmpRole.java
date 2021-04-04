package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_emp_role", schema = "", catalog = "erp3")
public class ErpEmpRole {
    private Integer empId;
    private Integer roleId;

    @Id
    @Column(name = "emp_id")
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpEmpRole that = (ErpEmpRole) o;

        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }
}
