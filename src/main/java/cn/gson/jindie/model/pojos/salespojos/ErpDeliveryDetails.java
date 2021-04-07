package cn.gson.jindie.model.pojos.salespojos;


public class ErpDeliveryDetails{

  private Integer deliveryDetailsId;
  private Integer deliveryOrderId;
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


  public Integer getDeliveryOrderId() {
    return deliveryOrderId;
  }

  public void setDeliveryOrderId(Integer deliveryOrderId) {
    this.deliveryOrderId = deliveryOrderId;
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
