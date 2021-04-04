package cn.gson.jindie.model.pojos.storemanagement;

public class ErpDetailedlist {

  private int dlistId;
  private int storeId;
  private int productId;
  private int dlistTotal;
  private int dlistExpectedTotal;
  private double dlistCost;


  public int getDlistId() {
    return dlistId;
  }

  public void setDlistId(int dlistId) {
    this.dlistId = dlistId;
  }


  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }


  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }


  public int getDlistTotal() {
    return dlistTotal;
  }

  public ErpDetailedlist() {
  }

  public ErpDetailedlist(int dlistId, int storeId, int productId, int dlistTotal, int dlistExpectedTotal, double dlistCost) {
    this.dlistId = dlistId;
    this.storeId = storeId;
    this.productId = productId;
    this.dlistTotal = dlistTotal;
    this.dlistExpectedTotal = dlistExpectedTotal;
    this.dlistCost = dlistCost;
  }

  public void setDlistTotal(int dlistTotal) {
    this.dlistTotal = dlistTotal;
  }


  public int getDlistExpectedTotal() {
    return dlistExpectedTotal;
  }

  public void setDlistExpectedTotal(int dlistExpectedTotal) {
    this.dlistExpectedTotal = dlistExpectedTotal;
  }


  public double getDlistCost() {
    return dlistCost;
  }

  public void setDlistCost(double dlistCost) {
    this.dlistCost = dlistCost;
  }

}
