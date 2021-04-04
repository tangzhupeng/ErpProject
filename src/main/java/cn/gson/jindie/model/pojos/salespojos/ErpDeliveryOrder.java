package cn.gson.jindie.model.pojos.salespojos;


import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

public class ErpDeliveryOrder {

  private Integer deliveryOrderId;
  private String deliveryOrderNumber;
  private java.sql.Timestamp deliveryTime;
  private double receivables;
  private Integer deliveryStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private Integer approvalStatus;
  private String orderNumber;
  private String salesReturnsNumber;
  private ErpCustomer erpCustomer;
  private ErpEmp erpEmp;
  private ErpStore erpStore;
  private double unverifiedAmount;
  private double cancelledAmount;
  private String currentExaminer;


  public Integer getDeliveryOrderId() {
    return deliveryOrderId;
  }

  public void setDeliveryOrderId(Integer deliveryOrderId) {
    this.deliveryOrderId = deliveryOrderId;
  }


  public String getDeliveryOrderNumber() {
    return deliveryOrderNumber;
  }

  public void setDeliveryOrderNumber(String deliveryOrderNumber) {
    this.deliveryOrderNumber = deliveryOrderNumber;
  }


  public java.sql.Timestamp getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(java.sql.Timestamp deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public double getReceivables() {
    return receivables;
  }

  public void setReceivables(double receivables) {
    this.receivables = receivables;
  }


  public Integer getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(Integer deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public Integer getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(Integer approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public String getSalesReturnsNumber() {
    return salesReturnsNumber;
  }

  public void setSalesReturnsNumber(String salesReturnsNumber) {
    this.salesReturnsNumber = salesReturnsNumber;
  }


  public ErpCustomer getErpCustomer() {
    return erpCustomer;
  }

  public void setErpCustomer(ErpCustomer erpCustomer) {
    this.erpCustomer = erpCustomer;
  }

  public ErpEmp getErpEmp() {
    return erpEmp;
  }

  public void setErpEmp(ErpEmp erpEmp) {
    this.erpEmp = erpEmp;
  }

  public ErpStore getErpStore() {
    return erpStore;
  }

  public void setErpStore(ErpStore erpStore) {
    this.erpStore = erpStore;
  }

  public double getUnverifiedAmount() {
    return unverifiedAmount;
  }

  public void setUnverifiedAmount(double unverifiedAmount) {
    this.unverifiedAmount = unverifiedAmount;
  }


  public double getCancelledAmount() {
    return cancelledAmount;
  }

  public void setCancelledAmount(double cancelledAmount) {
    this.cancelledAmount = cancelledAmount;
  }


  public String getCurrentExaminer() {
    return currentExaminer;
  }

  public void setCurrentExaminer(String currentExaminer) {
    this.currentExaminer = currentExaminer;
  }

}
