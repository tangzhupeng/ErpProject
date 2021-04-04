package cn.gson.jindie.model.pojos.salespojos;

public class ErpOrderDetails {

  private Integer orderDetailsId;
  private Integer orderId;
  private String productName;
  private Integer number;
  private double productPrice;
  private double productMoney;
  private String orderDetailsRemarks;


  public Integer getOrderDetailsId() {
    return orderDetailsId;
  }

  public void setOrderDetailsId(Integer orderDetailsId) {
    this.orderDetailsId = orderDetailsId;
  }


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
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
