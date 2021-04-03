package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_emp_role", schema = "erp3", catalog = "")
public class ErpEmpRoleEntity {
    private int empId;
    private int roleId;

    @Id
    @Column(name = "emp_id")
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpEmpRoleEntity that = (ErpEmpRoleEntity) o;
        return empId == that.empId &&
                roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, roleId);
    }
}
