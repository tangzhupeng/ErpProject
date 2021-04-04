package cn.gson.jindie.model.pojos.storemanagement;

public class ErpAllotin {

  private int inId;
  private int productId;
  private int storeId;
  private int allotinNum;

  public ErpAllotin() {
  }

  public ErpAllotin(int inId, int productId, int storeId, int allotinNum, double allotinCost) {
    this.inId = inId;
    this.productId = productId;
    this.storeId = storeId;
    this.allotinNum = allotinNum;
    this.allotinCost = allotinCost;
  }

  private double allotinCost;


  public int getInId() {
    return inId;
  }

  public void setInId(int inId) {
    this.inId = inId;
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


  public int getAllotinNum() {
    return allotinNum;
  }

  public void setAllotinNum(int allotinNum) {
    this.allotinNum = allotinNum;
  }


  public double getAllotinCost() {
    return allotinCost;
  }

  public void setAllotinCost(double allotinCost) {
    this.allotinCost = allotinCost;
  }

}
