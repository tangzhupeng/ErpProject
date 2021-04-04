package cn.gson.jindie.model.pojos.storemanagement;


public class ErpProductcollect {

  private int procId;
  private int productId;
  private int storeId;
  private String poNumber;
  private int inAid;
  private int deliveryOrderId;
  private int salesReturnsId;
  private int outAid;
  private int outCnum;
  private int inNum;
  private double inMoney;

  public ErpProductcollect(int procId, int productId, int storeId, String poNumber, int inAid, int deliveryOrderId, int salesReturnsId, int outAid, int outCnum, int inNum, double inMoney) {
    this.procId = procId;
    this.productId = productId;
    this.storeId = storeId;
    this.poNumber = poNumber;
    this.inAid = inAid;
    this.deliveryOrderId = deliveryOrderId;
    this.salesReturnsId = salesReturnsId;
    this.outAid = outAid;
    this.outCnum = outCnum;
    this.inNum = inNum;
    this.inMoney = inMoney;
  }

  public ErpProductcollect() {
  }

  public int getProcId() {
    return procId;
  }

  public void setProcId(int procId) {
    this.procId = procId;
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


  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }


  public int getInAid() {
    return inAid;
  }

  public void setInAid(int inAid) {
    this.inAid = inAid;
  }


  public int getDeliveryOrderId() {
    return deliveryOrderId;
  }

  public void setDeliveryOrderId(int deliveryOrderId) {
    this.deliveryOrderId = deliveryOrderId;
  }


  public int getSalesReturnsId() {
    return salesReturnsId;
  }

  public void setSalesReturnsId(int salesReturnsId) {
    this.salesReturnsId = salesReturnsId;
  }


  public int getOutAid() {
    return outAid;
  }

  public void setOutAid(int outAid) {
    this.outAid = outAid;
  }


  public int getOutCnum() {
    return outCnum;
  }

  public void setOutCnum(int outCnum) {
    this.outCnum = outCnum;
  }


  public int getInNum() {
    return inNum;
  }

  public void setInNum(int inNum) {
    this.inNum = inNum;
  }


  public double getInMoney() {
    return inMoney;
  }

  public void setInMoney(double inMoney) {
    this.inMoney = inMoney;
  }

}
