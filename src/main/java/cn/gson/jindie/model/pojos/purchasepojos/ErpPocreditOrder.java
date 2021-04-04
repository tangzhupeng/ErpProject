package cn.gson.jindie.model.pojos.purchasepojos;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "erp_pocredit_order", schema = "", catalog = "erp3")
public class ErpPocreditOrder {
    private String coNumber;
    private Date coDate;
    private String poNumber;

    @Id
    @Column(name = "co_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getCoNumber() {
        return coNumber;
    }

    public void setCoNumber(String coNumber) {
        this.coNumber = coNumber;
    }

    @Basic
    @Column(name = "co_date")
    public Date getCoDate() {
        return coDate;
    }

    public void setCoDate(Date coDate) {
        this.coDate = coDate;
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

        ErpPocreditOrder that = (ErpPocreditOrder) o;

        if (coNumber != null ? !coNumber.equals(that.coNumber) : that.coNumber != null) return false;
        if (coDate != null ? !coDate.equals(that.coDate) : that.coDate != null) return false;
        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coNumber != null ? coNumber.hashCode() : 0;
        result = 31 * result + (coDate != null ? coDate.hashCode() : 0);
        result = 31 * result + (poNumber != null ? poNumber.hashCode() : 0);
        return result;
    }
}
