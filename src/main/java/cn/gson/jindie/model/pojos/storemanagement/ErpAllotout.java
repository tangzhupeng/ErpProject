package cn.gson.jindie.model.pojos.storemanagement;

public class ErpAllotout {

  private int outId;
  private int productId;
  private int storeId;
  private int allotoutNum;
  private double allotoutCost;

  public ErpAllotout() {
  }

  public ErpAllotout(int outId, int productId, int storeId, int allotoutNum, double allotoutCost) {
    this.outId = outId;
    this.productId = productId;
    this.storeId = storeId;
    this.allotoutNum = allotoutNum;
    this.allotoutCost = allotoutCost;
  }

  public int getOutId() {
    return outId;
  }

  public void setOutId(int outId) {
    this.outId = outId;
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


  public int getAllotoutNum() {
    return allotoutNum;
  }

  public void setAllotoutNum(int allotoutNum) {
    this.allotoutNum = allotoutNum;
  }


  public double getAllotoutCost() {
    return allotoutCost;
  }

  public void setAllotoutCost(double allotoutCost) {
    this.allotoutCost = allotoutCost;
  }

}
