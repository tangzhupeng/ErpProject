package cn.gson.jindie.model.pojos.storempojos;

import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

import java.sql.Date;
import java.util.List;

public class ErpCheck {

  private int checkId;

  private List<ErpStore> erpStore;
  private List<ErpProduct> erpProduct;
   private   int  checkStock;
  private String checkNumber;
  private Date checkDate;
  private String checkStore;
  private String checkUnit;
  private int checkQuantity;

  public int getCheckId() {
    return checkId;
  }

  public void setCheckId(int checkId) {
    this.checkId = checkId;
  }

  public List<ErpStore> getErpStore() {
    return erpStore;
  }

  public void setErpStore(List<ErpStore> erpStore) {
    this.erpStore = erpStore;
  }

  public List<ErpProduct> getErpProduct() {
    return erpProduct;
  }

  public void setErpProduct(List<ErpProduct> erpProduct) {
    this.erpProduct = erpProduct;
  }

  public int getCheckStock() {
    return checkStock;
  }

  public void setCheckStock(int checkStock) {
    this.checkStock = checkStock;
  }

  public String getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }

  public Date getCheckDate() {
    return checkDate;
  }

  public void setCheckDate(Date checkDate) {
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

  private double checkProfitloss;
  private String checkName;
  private String checkState;

  public ErpCheck() {
  }

  private String checkBz;

  public ErpCheck(int checkId, List<ErpStore> erpStore, List<ErpProduct> erpProduct, int checkStock, String checkNumber, Date checkDate, String checkStore, String checkUnit, int checkQuantity, double checkProfitloss, String checkName, String checkState, String checkBz) {
    this.checkId = checkId;
    this.erpStore = erpStore;
    this.erpProduct = erpProduct;
    this.checkStock = checkStock;
    this.checkNumber = checkNumber;
    this.checkDate = checkDate;
    this.checkStore = checkStore;
    this.checkUnit = checkUnit;
    this.checkQuantity = checkQuantity;
    this.checkProfitloss = checkProfitloss;
    this.checkName = checkName;
    this.checkState = checkState;
    this.checkBz = checkBz;
  }
}
