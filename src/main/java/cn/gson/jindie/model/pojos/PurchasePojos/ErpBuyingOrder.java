package cn.gson.jindie.model.pojos.PurchasePojos;


import java.util.Date;

public class ErpBuyingOrder {
    private String boNumber;
    private Date boDate;
    private String poNumber;

    public String getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(String boNumber) {
        this.boNumber = boNumber;
    }

    public Date getBoDate() {
        return boDate;
    }

    public void setBoDate(Date boDate) {
        this.boDate = boDate;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }


}
