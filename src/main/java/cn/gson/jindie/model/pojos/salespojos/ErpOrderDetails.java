package cn.gson.jindie.model.pojos.salespojos;

public class ErpOrderDetails {

  private Integer orderDetailsId;
  private ErpOrder erpOrder;
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


  public ErpOrder getErpOrder() {
    return erpOrder;
  }

  public void setErpOrder(ErpOrder erpOrder) {
    this.erpOrder = erpOrder;
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

  @Override
  public String toString() {
    return "ErpOrderDetails{" +
            "orderDetailsId=" + orderDetailsId +
            ", erpOrder=" + erpOrder +
            ", productName='" + productName + '\'' +
            ", number=" + number +
            ", productPrice=" + productPrice +
            ", productMoney=" + productMoney +
            ", orderDetailsRemarks='" + orderDetailsRemarks + '\'' +
            '}';
  }
}
