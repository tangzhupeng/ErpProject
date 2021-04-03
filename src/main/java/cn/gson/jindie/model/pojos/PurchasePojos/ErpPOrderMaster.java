package cn.gson.jindie.model.pojos.PurchasePojos;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "erp_p_order_master", schema = "", catalog = "erp3")
public class ErpPOrderMaster {
    private String poNumber;
    private Date poDate;
    private String poTos;
    private Integer providerId;
    private Double poMoney;
    private Integer empId;
    private Integer storeId;
    private Integer poState;
    private String boNumber;
    private Integer poEastate;
    private Integer supEmpId;
    private Integer poStstate;

    @Id
    @Column(name = "po_number")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @Basic
    @Column(name = "po_date")
    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    @Basic
    @Column(name = "po_tos")
    public String getPoTos() {
        return poTos;
    }

    public void setPoTos(String poTos) {
        this.poTos = poTos;
    }

    @Basic
    @Column(name = "provider_id")
    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "po_money")
    public Double getPoMoney() {
        return poMoney;
    }

    public void setPoMoney(Double poMoney) {
        this.poMoney = poMoney;
    }

    @Basic
    @Column(name = "emp_id")
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "store_id")
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "po_state")
    public Integer getPoState() {
        return poState;
    }

    public void setPoState(Integer poState) {
        this.poState = poState;
    }

    @Basic
    @Column(name = "bo_number")
    public String getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(String boNumber) {
        this.boNumber = boNumber;
    }

    @Basic
    @Column(name = "po_eastate")
    public Integer getPoEastate() {
        return poEastate;
    }

    public void setPoEastate(Integer poEastate) {
        this.poEastate = poEastate;
    }

    @Basic
    @Column(name = "sup_emp_id")
    public Integer getSupEmpId() {
        return supEmpId;
    }

    public void setSupEmpId(Integer supEmpId) {
        this.supEmpId = supEmpId;
    }

    @Basic
    @Column(name = "po_ststate")
    public Integer getPoStstate() {
        return poStstate;
    }

    public void setPoStstate(Integer poStstate) {
        this.poStstate = poStstate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpPOrderMaster that = (ErpPOrderMaster) o;

        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;
        if (poDate != null ? !poDate.equals(that.poDate) : that.poDate != null) return false;
        if (poTos != null ? !poTos.equals(that.poTos) : that.poTos != null) return false;
        if (providerId != null ? !providerId.equals(that.providerId) : that.providerId != null) return false;
        if (poMoney != null ? !poMoney.equals(that.poMoney) : that.poMoney != null) return false;
        if (empId != null ? !empId.equals(that.empId) : that.empId != null) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (poState != null ? !poState.equals(that.poState) : that.poState != null) return false;
        if (boNumber != null ? !boNumber.equals(that.boNumber) : that.boNumber != null) return false;
        if (poEastate != null ? !poEastate.equals(that.poEastate) : that.poEastate != null) return false;
        if (supEmpId != null ? !supEmpId.equals(that.supEmpId) : that.supEmpId != null) return false;
        if (poStstate != null ? !poStstate.equals(that.poStstate) : that.poStstate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = poNumber != null ? poNumber.hashCode() : 0;
        result = 31 * result + (poDate != null ? poDate.hashCode() : 0);
        result = 31 * result + (poTos != null ? poTos.hashCode() : 0);
        result = 31 * result + (providerId != null ? providerId.hashCode() : 0);
        result = 31 * result + (poMoney != null ? poMoney.hashCode() : 0);
        result = 31 * result + (empId != null ? empId.hashCode() : 0);
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (poState != null ? poState.hashCode() : 0);
        result = 31 * result + (boNumber != null ? boNumber.hashCode() : 0);
        result = 31 * result + (poEastate != null ? poEastate.hashCode() : 0);
        result = 31 * result + (supEmpId != null ? supEmpId.hashCode() : 0);
        result = 31 * result + (poStstate != null ? poStstate.hashCode() : 0);
        return result;
    }
}
