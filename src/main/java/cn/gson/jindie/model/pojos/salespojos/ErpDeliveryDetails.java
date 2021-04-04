package cn.gson.jindie.model.pojos.salespojos;


public class ErpDeliveryDetails{

  private Integer deliveryDetailsId;
  private ErpDeliveryOrder erpDeliveryOrder;
  private String productName;
  private Integer number;
  private double productPrice;
  private double productMoney;
  private String orderDetailsRemarks;


  public Integer getDeliveryDetailsId() {
    return deliveryDetailsId;
  }

  public void setDeliveryDetailsId(Integer deliveryDetailsId) {
    this.deliveryDetailsId = deliveryDetailsId;
  }


  public ErpDeliveryOrder getErpDeliveryOrder() {
    return erpDeliveryOrder;
  }

  public void setErpDeliveryOrder(ErpDeliveryOrder erpDeliveryOrder) {
    this.erpDeliveryOrder = erpDeliveryOrder;
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


  public String getOrderDetailsRemarks() {
    return orderDetailsRemarks;
  }

  public void setOrderDetailsRemarks(String orderDetailsRemarks) {
    this.orderDetailsRemarks = orderDetailsRemarks;
  }

}
