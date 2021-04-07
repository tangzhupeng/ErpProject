package cn.gson.jindie.model.pojos.purchasepojos;



import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpProvider;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

import java.sql.Date;
import java.util.List;


public class ErpPOrderMaster {

  private String poNumber;
  private Date poDate;
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
  private String startingTime;
  private String endTime;
  private List<ErpPOrderDetail> detail;

  public ErpPOrderMaster(String poNumber, Date poDate, String poTos, ErpProvider providerId, double poMoney, ErpEmp empId, ErpStore storeId, long poState, ErpBuyingOrder boNumber, long poEastate, ErpEmp supEmpId, long poStstate, String startingTime, String endTime) {
    this.poNumber = poNumber;
    this.poDate = poDate;
    this.poTos = poTos;
    this.providerId = providerId;
    this.poMoney = poMoney;
    this.empId = empId;
    this.storeId = storeId;
    this.poState = poState;
    this.boNumber = boNumber;
    this.poEastate = poEastate;
    this.supEmpId = supEmpId;
    this.poStstate = poStstate;
    this.startingTime = startingTime;
    this.endTime = endTime;
  }

  public List<ErpPOrderDetail> getDetail() {
    return detail;
  }

  public void setDetail(List<ErpPOrderDetail> detail) {
    this.detail = detail;
  }

  public String getStartingTime() {
    return startingTime;
  }

  public void setStartingTime(String startingTime) {
    this.startingTime = startingTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public ErpPOrderMaster() {
  }

  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  public Date getPoDate() {
    return poDate;
  }

  public void setPoDate(Date poDate) {
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

  @Override
  public String toString() {
    return "ErpPOrderMaster{" +
            "poNumber='" + poNumber + '\'' +
            ", poDate=" + poDate +
            ", poTos='" + poTos + '\'' +
            ", providerId=" + providerId +
            ", poMoney=" + poMoney +
            ", empId=" + empId +
            ", storeId=" + storeId +
            ", poState=" + poState +
            ", boNumber=" + boNumber +
            ", poEastate=" + poEastate +
            ", supEmpId=" + supEmpId +
            ", poStstate=" + poStstate +
            ", startingTime=" + startingTime +
            ", endTime=" + endTime +
            '}';
  }
}
