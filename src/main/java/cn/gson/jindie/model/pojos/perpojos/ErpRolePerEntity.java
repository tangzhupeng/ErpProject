package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_role_per", schema = "", catalog = "erp3")
public class ErpRolePerEntity {
    private int roleId;
    private int perId;

    @Id
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "per_id")
    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpRolePerEntity that = (ErpRolePerEntity) o;
        return roleId == that.roleId &&
                perId == that.perId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, perId);
    }
}
