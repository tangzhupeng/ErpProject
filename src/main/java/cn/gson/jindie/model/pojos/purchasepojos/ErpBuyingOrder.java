
package cn.gson.jindie.model.pojos.purchasepojos;

import java.sql.Date;

public class ErpBuyingOrder {

  private String boNumber;
  private java.sql.Date boDate;
  private ErpPOrderMaster poNumber;
  private Double consumed;
  private Double notconsumed;

  public ErpBuyingOrder() {
  }

  public ErpBuyingOrder(String boNumber, Date boDate, ErpPOrderMaster poNumber, Double consumed, Double notconsumed) {
    this.boNumber = boNumber;
    this.boDate = boDate;
    this.poNumber = poNumber;
    this.consumed = consumed;
    this.notconsumed = notconsumed;
  }

  public Double getConsumed() {
    return consumed;
  }

  public void setConsumed(Double consumed) {
    this.consumed = consumed;
  }

  public Double getNotconsumed() {
    return notconsumed;
  }

  public void setNotconsumed(Double notconsumed) {
    this.notconsumed = notconsumed;
  }

  public String getBoNumber() {
    return boNumber;
  }

  public void setBoNumber(String boNumber) {
    this.boNumber = boNumber;
  }


  public java.sql.Date getBoDate() {
    return boDate;
  }

  public void setBoDate(java.sql.Date boDate) {
    this.boDate = boDate;
  }


  public ErpPOrderMaster getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(ErpPOrderMaster poNumber) {
    this.poNumber = poNumber;
  }

}
