package cn.gson.jindie.model.pojos.salespojos;


public class ErpReturnDetails {

  private Integer returnDetailsId;
  private ErpReturnOrder erpReturnOrder;
  private String productName;
  private Integer number;
  private double productPrice;
  private double productMoney;
  private String returnDetailsRemarks;


  public Integer getReturnDetailsId() {
    return returnDetailsId;
  }

  public void setReturnDetailsId(Integer returnDetailsId) {
    this.returnDetailsId = returnDetailsId;
  }

  public ErpReturnOrder getErpReturnOrder() {
    return erpReturnOrder;
  }

  public void setErpReturnOrder(ErpReturnOrder erpReturnOrder) {
    this.erpReturnOrder = erpReturnOrder;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public double getProductMoney() {
    return productMoney;
  }

  public void setProductMoney(double productMoney) {
    this.productMoney = productMoney;
  }


  public String getReturnDetailsRemarks() {
    return returnDetailsRemarks;
  }

  public void setReturnDetailsRemarks(String returnDetailsRemarks) {
    this.returnDetailsRemarks = returnDetailsRemarks;
  }

}
