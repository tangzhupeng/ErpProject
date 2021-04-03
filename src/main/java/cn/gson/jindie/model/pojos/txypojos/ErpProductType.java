package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_product_type", schema = "", catalog = "erp3")
public class ErpProductType {
    private int protypeId;
    private String protypeName;

    @Id
    @Column(name = "protype_id")
    public int getProtypeId() {
        return protypeId;
    }

    public void setProtypeId(int protypeId) {
        this.protypeId = protypeId;
    }

    @Basic
    @Column(name = "protype_name")
    public String getProtypeName() {
        return protypeName;
    }

    public void setProtypeName(String protypeName) {
        this.protypeName = protypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpProductType that = (ErpProductType) o;
        return protypeId == that.protypeId &&
                Objects.equals(protypeName, that.protypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protypeId, protypeName);
    }
}
