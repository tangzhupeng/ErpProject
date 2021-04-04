package cn.gson.jindie.model.pojos.storemanagement;


import java.sql.Date;

public class ErpAllot {

  private int allotId;
  private int productId;
  private int storeId;

  public ErpAllot() {
  }

  public ErpAllot(int allotId, int productId, int storeId, String allotName, double allotMoney, int allotNum, Date createDate, String allotApprove, String allotState, Date allotApdate, String allotInAddress, String allotOutAddress, int allotStock, String allotBz) {
    this.allotId = allotId;
    this.productId = productId;
    this.storeId = storeId;
    this.allotName = allotName;
    this.allotMoney = allotMoney;
    this.allotNum = allotNum;
    this.createDate = createDate;
    this.allotApprove = allotApprove;
    this.allotState = allotState;
    this.allotApdate = allotApdate;
    this.allotInAddress = allotInAddress;
    this.allotOutAddress = allotOutAddress;
    this.allotStock = allotStock;
    this.allotBz = allotBz;
  }

  private String allotName;
  private double allotMoney;
  private int allotNum;
  private java.sql.Date createDate;
  private String allotApprove;
  private String allotState;
  private java.sql.Date allotApdate;
  private String allotInAddress;
  private String allotOutAddress;
  private int allotStock;
  private String allotBz;


  public int getAllotId() {
    return allotId;
  }

  public void setAllotId(int allotId) {
    this.allotId = allotId;
  }


  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }


  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }


  public String getAllotName() {
    return allotName;
  }

  public void setAllotName(String allotName) {
    this.allotName = allotName;
  }


  public double getAllotMoney() {
    return allotMoney;
  }

  public void setAllotMoney(double allotMoney) {
    this.allotMoney = allotMoney;
  }


  public int getAllotNum() {
    return allotNum;
  }

  public void setAllotNum(int allotNum) {
    this.allotNum = allotNum;
  }


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }


  public String getAllotApprove() {
    return allotApprove;
  }

  public void setAllotApprove(String allotApprove) {
    this.allotApprove = allotApprove;
  }


  public String getAllotState() {
    return allotState;
  }

  public void setAllotState(String allotState) {
    this.allotState = allotState;
  }


  public java.sql.Date getAllotApdate() {
    return allotApdate;
  }

  public void setAllotApdate(java.sql.Date allotApdate) {
    this.allotApdate = allotApdate;
  }


  public String getAllotInAddress() {
    return allotInAddress;
  }

  public void setAllotInAddress(String allotInAddress) {
    this.allotInAddress = allotInAddress;
  }


  public String getAllotOutAddress() {
    return allotOutAddress;
  }

  public void setAllotOutAddress(String allotOutAddress) {
    this.allotOutAddress = allotOutAddress;
  }


  public int getAllotStock() {
    return allotStock;
  }

  public void setAllotStock(int allotStock) {
    this.allotStock = allotStock;
  }


  public String getAllotBz() {
    return allotBz;
  }

  public void setAllotBz(String allotBz) {
    this.allotBz = allotBz;
  }

}
