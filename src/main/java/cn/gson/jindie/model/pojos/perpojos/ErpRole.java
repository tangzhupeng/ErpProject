package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_role", schema = "", catalog = "erp3")
public class ErpRole {
    private int roleId;
    private String roleName;

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpRole erpRole = (ErpRole) o;

        if (roleId != erpRole.roleId) return false;
        if (roleName != null ? !roleName.equals(erpRole.roleName) : erpRole.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
