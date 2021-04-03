package cn.gson.jindie.model.pojos.PurchasePojos;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "erp_buying_order", schema = "", catalog = "erp3")
public class ErpBuyingOrder {
    private String boNumber;
    private Date boDate;
    private String poNumber;

    @Id
    @Column(name = "bo_number")
    public String getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(String boNumber) {
        this.boNumber = boNumber;
    }

    @Basic
    @Column(name = "bo_date")
    public Date getBoDate() {
        return boDate;
    }

    public void setBoDate(Date boDate) {
        this.boDate = boDate;
    }

    @Basic
    @Column(name = "po_number")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpBuyingOrder that = (ErpBuyingOrder) o;

        if (boNumber != null ? !boNumber.equals(that.boNumber) : that.boNumber != null) return false;
        if (boDate != null ? !boDate.equals(that.boDate) : that.boDate != null) return false;
        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = boNumber != null ? boNumber.hashCode() : 0;
        result = 31 * result + (boDate != null ? boDate.hashCode() : 0);
        result = 31 * result + (poNumber != null ? poNumber.hashCode() : 0);
        return result;
    }
}
