package cn.gson.jindie.model.pojos.PurchasePojos;

public class ErpPOrderDetail {
    private String podNumber;
    private String poNumber;
    private Integer productId;
    private Integer podAmount;
    private String podUnit;
    private Integer podUnitprice;
    private Double podMoney;
    private String podDescribe;

    public String getPodNumber() {
        return podNumber;
    }

    public void setPodNumber(String podNumber) {
        this.podNumber = podNumber;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPodAmount() {
        return podAmount;
    }

    public void setPodAmount(Integer podAmount) {
        this.podAmount = podAmount;
    }

    public String getPodUnit() {
        return podUnit;
    }

    public void setPodUnit(String podUnit) {
        this.podUnit = podUnit;
    }

    public Integer getPodUnitprice() {
        return podUnitprice;
    }

    public void setPodUnitprice(Integer podUnitprice) {
        this.podUnitprice = podUnitprice;
    }

    public Double getPodMoney() {
        return podMoney;
    }

    public void setPodMoney(Double podMoney) {
        this.podMoney = podMoney;
    }

    public String getPodDescribe() {
        return podDescribe;
    }

    public void setPodDescribe(String podDescribe) {
        this.podDescribe = podDescribe;
    }


}
