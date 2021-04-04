package cn.gson.jindie.model.pojos.salespojos;


public class ErpOrder {

  private Integer orderId;
  private String orderNumber;
  private java.sql.Timestamp documentDate;
  private java.sql.Timestamp deliveryDate;
  private double accountReceivable;
  private double paymentReceived;
  private Integer deliveryStatus;
  private String creatorPerson;
  private java.sql.Timestamp createTime;
  private Integer approvalStatus;
  private Integer orderStatus;
  private String deliveryOrderNumber;
  private Integer customerId;
  private Integer empId;
  private Integer storeId;
  private String currentExaminer;


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public java.sql.Timestamp getDocumentDate() {
    return documentDate;
  }

  public void setDocumentDate(java.sql.Timestamp documentDate) {
    this.documentDate = documentDate;
  }


  public java.sql.Timestamp getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(java.sql.Timestamp deliveryDate) {
    this.deliveryDate = deliveryDate;
  }


  public double getAccountReceivable() {
    return accountReceivable;
  }

  public void setAccountReceivable(double accountReceivable) {
    this.accountReceivable = accountReceivable;
  }


  public double getPaymentReceived() {
    return paymentReceived;
  }

  public void setPaymentReceived(double paymentReceived) {
    this.paymentReceived = paymentReceived;
  }


  public Integer getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(Integer deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public String getCreatorPerson() {
    return creatorPerson;
  }

  public void setCreatorPerson(String creatorPerson) {
    this.creatorPerson = creatorPerson;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public Integer getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(Integer approvalStatus) {
    this.approvalStatus = approvalStatus;
  }


  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }


  public String getDeliveryOrderNumber() {
    return deliveryOrderNumber;
  }

  public void setDeliveryOrderNumber(String deliveryOrderNumber) {
    this.deliveryOrderNumber = deliveryOrderNumber;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public Integer getEmpId() {
    return empId;
  }

  public void setEmpId(Integer empId) {
    this.empId = empId;
  }


  public Integer getStoreId() {
    return storeId;
  }

  public void setStoreId(Integer storeId) {
    this.storeId = storeId;
  }


  public String getCurrentExaminer() {
    return currentExaminer;
  }

  public void setCurrentExaminer(String currentExaminer) {
    this.currentExaminer = currentExaminer;
  }

}
