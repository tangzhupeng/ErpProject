package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.salespojos.ErpDeliveryOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;

public class ErpReceiptRecord {
    private int reId;
    private String reWay;
    private String reMark;
    private Double reMoney;
    private String reRemark;
    private int empState;//审核状态

    private ErpEmp erpEmp;//审核人
    private ErpReceipt receipt;//收款单
    private ErpAccount account;//收款账号
    private ErpDeliveryOrder deliveryOrder; //销售订单


    public int getEmpState() {
        return empState;
    }

    public void setEmpState(int empState) {
        this.empState = empState;
    }

    public ErpEmp getErpEmp() {
        return erpEmp;
    }

    public void setErpEmp(ErpEmp erpEmp) {
        this.erpEmp = erpEmp;
    }

    public int getReId() {
        return reId;
    }

    public void setReId(int reId) {
        this.reId = reId;
    }

    public ErpReceipt getReceipt() {
        return receipt;
    }

    public void setReceipt(ErpReceipt receipt) {
        this.receipt = receipt;
    }

    public ErpAccount getAccount() {
        return account;
    }

    public void setAccount(ErpAccount account) {
        this.account = account;
    }

    public ErpDeliveryOrder getDeliveryOrder() {
        return deliveryOrder;
    }

    public void setDeliveryOrder(ErpDeliveryOrder deliveryOrder) {
        this.deliveryOrder = deliveryOrder;
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
                ", receipt=" + receipt +
                ", account=" + account +
                ", deliveryOrder=" + deliveryOrder +
                '}';
    }
}
