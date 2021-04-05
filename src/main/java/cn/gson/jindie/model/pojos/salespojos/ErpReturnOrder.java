package cn.gson.jindie.model.pojos.salespojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

public class ErpReturnOrder {

  private Integer salesReturnsId;
  private String salesReturnsNumber;
  private java.sql.Timestamp warehousingTime;
  private double receivables;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private Integer approvalStatus;
  private String deliveryOrderNumber;
  private ErpCustomer erpCustomer;
  private ErpEmp erpEmp;
  private ErpStore erpStore;
  private String currentExaminer;


  public Integer getSalesReturnsId() {
    return salesReturnsId;
  }

  public void setSalesReturnsId(Integer salesReturnsId) {
    this.salesReturnsId = salesReturnsId;
  }


  public String getSalesReturnsNumber() {
    return salesReturnsNumber;
  }

  public void setSalesReturnsNumber(String salesReturnsNumber) {
    this.salesReturnsNumber = salesReturnsNumber;
  }


  public java.sql.Timestamp getWarehousingTime() {
    return warehousingTime;
  }

  public void setWarehousingTime(java.sql.Timestamp warehousingTime) {
    this.warehousingTime = warehousingTime;
  }


  public double getReceivables() {
    return receivables;
  }

  public void setReceivables(double receivables) {
    this.receivables = receivables;
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


  public String getDeliveryOrderNumber() {
    return deliveryOrderNumber;
  }

  public void setDeliveryOrderNumber(String deliveryOrderNumber) {
    this.deliveryOrderNumber = deliveryOrderNumber;
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

  public String getCurrentExaminer() {
    return currentExaminer;
  }

  public void setCurrentExaminer(String currentExaminer) {
    this.currentExaminer = currentExaminer;
  }

}
