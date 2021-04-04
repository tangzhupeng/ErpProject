package cn.gson.jindie.model.pojos.purchasepojos;

import javax.persistence.*;

@Entity
@Table(name = "erp_p_order_detail", schema = "", catalog = "erp3")
public class ErpPOrderDetail {
    private String podNumber;
    private String poNumber;
    private Integer productId;
    private Integer podAmount;
    private String podUnit;
    private Integer podUnitprice;
    private Double podMoney;
    private String podDescribe;

    @Id
    @Column(name = "pod_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getPodNumber() {
        return podNumber;
    }

    public void setPodNumber(String podNumber) {
        this.podNumber = podNumber;
    }

    @Basic
    @Column(name = "po_number")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "pod_amount")
    public Integer getPodAmount() {
        return podAmount;
    }

    public void setPodAmount(Integer podAmount) {
        this.podAmount = podAmount;
    }

    @Basic
    @Column(name = "pod_unit")
    public String getPodUnit() {
        return podUnit;
    }

    public void setPodUnit(String podUnit) {
        this.podUnit = podUnit;
    }

    @Basic
    @Column(name = "pod_unitprice")
    public Integer getPodUnitprice() {
        return podUnitprice;
    }

    public void setPodUnitprice(Integer podUnitprice) {
        this.podUnitprice = podUnitprice;
    }

    @Basic
    @Column(name = "pod_money")
    public Double getPodMoney() {
        return podMoney;
    }

    public void setPodMoney(Double podMoney) {
        this.podMoney = podMoney;
    }

    @Basic
    @Column(name = "pod_describe")
    public String getPodDescribe() {
        return podDescribe;
    }

    public void setPodDescribe(String podDescribe) {
        this.podDescribe = podDescribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpPOrderDetail that = (ErpPOrderDetail) o;

        if (podNumber != null ? !podNumber.equals(that.podNumber) : that.podNumber != null) return false;
        if (poNumber != null ? !poNumber.equals(that.poNumber) : that.poNumber != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (podAmount != null ? !podAmount.equals(that.podAmount) : that.podAmount != null) return false;
        if (podUnit != null ? !podUnit.equals(that.podUnit) : that.podUnit != null) return false;
        if (podUnitprice != null ? !podUnitprice.equals(that.podUnitprice) : that.podUnitprice != null) return false;
        if (podMoney != null ? !podMoney.equals(that.podMoney) : that.podMoney != null) return false;
        if (podDescribe != null ? !podDescribe.equals(that.podDescribe) : that.podDescribe != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = podNumber != null ? podNumber.hashCode() : 0;
        result = 31 * result + (poNumber != null ? poNumber.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (podAmount != null ? podAmount.hashCode() : 0);
        result = 31 * result + (podUnit != null ? podUnit.hashCode() : 0);
        result = 31 * result + (podUnitprice != null ? podUnitprice.hashCode() : 0);
        result = 31 * result + (podMoney != null ? podMoney.hashCode() : 0);
        result = 31 * result + (podDescribe != null ? podDescribe.hashCode() : 0);
        return result;
    }
}
