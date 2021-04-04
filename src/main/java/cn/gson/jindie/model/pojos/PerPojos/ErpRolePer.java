package cn.gson.jindie.model.pojos.PerPojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_role_per", schema = "", catalog = "erp3")
@IdClass(ErpRolePerPK.class)
public class ErpRolePer {
    private Integer roleId;
    private Integer perId;

    @Id
    @Column(name = "role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "per_id")
    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpRolePer that = (ErpRolePer) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (perId != null ? !perId.equals(that.perId) : that.perId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (perId != null ? perId.hashCode() : 0);
        return result;
    }
}
