package cn.gson.jindie.model.pojos.PurchasePojos;

public class ErpPOrderDetail {

  private String podNumber;
  private String poNumber;
  private long productId;
  private long podAmount;
  private String podUnit;
  private long podUnitprice;
  private double podMoney;
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


  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }


  public long getPodAmount() {
    return podAmount;
  }

  public void setPodAmount(long podAmount) {
    this.podAmount = podAmount;
  }


  public String getPodUnit() {
    return podUnit;
  }

  public void setPodUnit(String podUnit) {
    this.podUnit = podUnit;
  }


  public long getPodUnitprice() {
    return podUnitprice;
  }

  public void setPodUnitprice(long podUnitprice) {
    this.podUnitprice = podUnitprice;
  }


  public double getPodMoney() {
    return podMoney;
  }

  public void setPodMoney(double podMoney) {
    this.podMoney = podMoney;
  }


  public String getPodDescribe() {
    return podDescribe;
  }

  public void setPodDescribe(String podDescribe) {
    this.podDescribe = podDescribe;
  }

}
