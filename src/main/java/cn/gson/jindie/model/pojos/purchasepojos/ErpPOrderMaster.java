package cn.gson.jindie.model.pojos.purchasepojos;


import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

public class ErpPOrderMaster {

  private String poNumber;
  private java.sql.Date poDate;
  private String poTos;
  private ErpProvider providerId;
  private double poMoney;
  private ErpEmp empId;
  private ErpStore storeId;
  private long poState;
  private ErpBuyingOrder boNumber;
  private long poEastate;
  private ErpEmp supEmpId;
  private long poStstate;


  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  public java.sql.Date getPoDate() {
    return poDate;
  }

  public void setPoDate(java.sql.Date poDate) {
    this.poDate = poDate;
  }


  public String getPoTos() {
    return poTos;
  }

  public void setPoTos(String poTos) {
    this.poTos = poTos;
  }


  public ErpProvider getProviderId() {
    return providerId;
  }

  public void setProviderId(ErpProvider providerId) {
    this.providerId = providerId;
  }


  public double getPoMoney() {
    return poMoney;
  }

  public void setPoMoney(double poMoney) {
    this.poMoney = poMoney;
  }


  public ErpEmp getEmpId() {
    return empId;
  }

  public void setEmpId(ErpEmp empId) {
    this.empId = empId;
  }


  public ErpStore getStoreId() {
    return storeId;
  }

  public void setStoreId(ErpStore storeId) {
    this.storeId = storeId;
  }


  public long getPoState() {
    return poState;
  }

  public void setPoState(long poState) {
    this.poState = poState;
  }


  public ErpBuyingOrder getBoNumber() {
    return boNumber;
  }

  public void setBoNumber(ErpBuyingOrder boNumber) {
    this.boNumber = boNumber;
  }


  public long getPoEastate() {
    return poEastate;
  }

  public void setPoEastate(long poEastate) {
    this.poEastate = poEastate;
  }


  public ErpEmp getSupEmpId() {
    return supEmpId;
  }

  public void setSupEmpId(ErpEmp supEmpId) {
    this.supEmpId = supEmpId;
  }


  public long getPoStstate() {
    return poStstate;
  }

  public void setPoStstate(long poStstate) {
    this.poStstate = poStstate;
  }

}
