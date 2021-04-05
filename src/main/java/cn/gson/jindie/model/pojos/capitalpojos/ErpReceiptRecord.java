package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.salespojos.ErpOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;

public class ErpReceiptRecord {
    private int reId;
    private String reWay;
    private String reMark;
    private Double reMoney;
    private String reRemark;

    private ErpReceipt receiptId;
    private ErpAccount accountId; //
    private ErpOrder order; //销售订单


    public int getReId() {
        return reId;
    }

    public void setReId(int reId) {
        this.reId = reId;
    }


    public ErpReceipt getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(ErpReceipt receiptId) {
        this.receiptId = receiptId;
    }

    public ErpAccount getAccountId() {
        return accountId;
    }

    public void setAccountId(ErpAccount accountId) {
        this.accountId = accountId;
    }


    public ErpOrder getOrder() {
        return order;
    }

    public void setOrder(ErpOrder order) {
        this.order = order;
    }

    public String getReWay() {
        return reWay;
    }

    public void setReWay(String reWay) {
        this.reWay = reWay;
    }

    public String getReMark() {
        return reMark;
    }

    public void setReMark(String reMark) {
        this.reMark = reMark;
    }

    public Double getReMoney() {
        return reMoney;
    }

    public void setReMoney(Double reMoney) {
        this.reMoney = reMoney;
    }

    public String getReRemark() {
        return reRemark;
    }

    public void setReRemark(String reRemark) {
        this.reRemark = reRemark;
    }


    @Override
    public String toString() {
        return "ErpReceiptRecord{" +
                "reId=" + reId +
                ", reWay='" + reWay + '\'' +
                ", reMark='" + reMark + '\'' +
                ", reMoney=" + reMoney +
                ", reRemark='" + reRemark + '\'' +
                ", receiptId=" + receiptId +
                ", accountId=" + accountId +
                ", order=" + order +
                '}';
    }
}
