package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_permission", schema = "erp3", catalog = "")
public class ErpPermissionEntity {
    private int perId;
    private String perName;

    @Id
    @Column(name = "per_id")
    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    @Basic
    @Column(name = "per_name")
    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpPermissionEntity that = (ErpPermissionEntity) o;
        return perId == that.perId &&
                Objects.equals(perName, that.perName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perId, perName);
    }
}
