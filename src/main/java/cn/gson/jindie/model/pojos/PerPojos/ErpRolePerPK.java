package cn.gson.jindie.model.pojos.PerPojos;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ErpRolePerPK implements Serializable {
    private Integer roleId;
    private Integer perId;

    @Column(name = "role_id")
    @Id
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Column(name = "per_id")
    @Id
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

        ErpRolePerPK that = (ErpRolePerPK) o;

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
