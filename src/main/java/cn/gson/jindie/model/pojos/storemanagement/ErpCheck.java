package cn.gson.jindie.model.pojos.storemanagement;

import java.sql.Date;

public class ErpCheck {

  private int checkId;
  private int productId;
  private int storeId;
  private String checkNumber;
  private java.sql.Date checkDate;
  private String checkStore;

  public ErpCheck() {
  }

  public ErpCheck(int checkId, int productId, int storeId, String checkNumber, Date checkDate, String checkStore, String checkUnit, int checkStock, int checkQuantity, double checkProfitloss, String checkName, String checkState, String checkBz) {
    this.checkId = checkId;
    this.productId = productId;
    this.storeId = storeId;
    this.checkNumber = checkNumber;
    this.checkDate = checkDate;
    this.checkStore = checkStore;
    this.checkUnit = checkUnit;
    this.checkStock = checkStock;
    this.checkQuantity = checkQuantity;
    this.checkProfitloss = checkProfitloss;
    this.checkName = checkName;
    this.checkState = checkState;
    this.checkBz = checkBz;
  }

  private String checkUnit;
  private int checkStock;
  private int checkQuantity;
  private double checkProfitloss;
  private String checkName;
  private String checkState;
  private String checkBz;


  public int getCheckId() {
    return checkId;
  }

  public void setCheckId(int checkId) {
    this.checkId = checkId;
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


  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public java.sql.Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(java.sql.Date checkDate) {
    this.checkDate = checkDate;
  }


  public String getCheckStore() {
    return checkStore;
  }

  public void setCheckStore(String checkStore) {
    this.checkStore = checkStore;
  }


  public String getCheckUnit() {
    return checkUnit;
  }

  public void setCheckUnit(String checkUnit) {
    this.checkUnit = checkUnit;
  }


  public int getCheckStock() {
    return checkStock;
  }

  public void setCheckStock(int checkStock) {
    this.checkStock = checkStock;
  }


  public int getCheckQuantity() {
    return checkQuantity;
  }

  public void setCheckQuantity(int checkQuantity) {
    this.checkQuantity = checkQuantity;
  }


  public double getCheckProfitloss() {
    return checkProfitloss;
  }

  public void setCheckProfitloss(double checkProfitloss) {
    this.checkProfitloss = checkProfitloss;
  }


  public String getCheckName() {
    return checkName;
  }

  public void setCheckName(String checkName) {
    this.checkName = checkName;
  }


  public String getCheckState() {
    return checkState;
  }

  public void setCheckState(String checkState) {
    this.checkState = checkState;
  }


  public String getCheckBz() {
    return checkBz;
  }

  public void setCheckBz(String checkBz) {
    this.checkBz = checkBz;
  }

}
