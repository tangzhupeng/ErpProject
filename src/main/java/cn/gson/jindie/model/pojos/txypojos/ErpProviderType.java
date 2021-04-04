package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_provider_type", schema = "", catalog = "erp3")
public class ErpProviderType {
    private Integer gysId;
    private String gysName;

    @Id
    @Column(name = "gys_id")
    public Integer getGysId() {
        return gysId;
    }

    public void setGysId(Integer gysId) {
        this.gysId = gysId;
    }

    @Basic
    @Column(name = "gys_name")
    public String getGysName() {
        return gysName;
    }

    public void setGysName(String gysName) {
        this.gysName = gysName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpProviderType that = (ErpProviderType) o;
        return gysId == that.gysId &&
                Objects.equals(gysName, that.gysName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gysId, gysName);
    }
}
