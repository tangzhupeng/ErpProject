package cn.gson.jindie.model.pojos.perpojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_permission", schema = "", catalog = "erp3")
public class ErpPermission {
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

        ErpPermission that = (ErpPermission) o;

        if (perId != that.perId) return false;
        if (perName != null ? !perName.equals(that.perName) : that.perName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = perId;
        result = 31 * result + (perName != null ? perName.hashCode() : 0);
        return result;
    }
}
