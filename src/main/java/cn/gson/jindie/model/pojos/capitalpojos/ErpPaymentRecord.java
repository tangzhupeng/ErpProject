package cn.gson.jindie.model.pojos.capitalpojos;


import cn.gson.jindie.model.pojos.purchasepojos.ErpBuyingOrder;
import cn.gson.jindie.model.pojos.txypojos.ErpAccount;

import javax.persistence.*;
import java.util.Objects;


public class ErpPaymentRecord {
    private int recordId;
    private String recordWay;
    private Double recordMoney;
    private String recordRemark;
    private int empState;//审核状态
    private String empName;//审核人
    private String recordMark;

    private ErpPayment payment; //付款单
    private ErpAccount account; //结算账号
    private ErpBuyingOrder boNumber; //购货单


    @Override
    public String toString() {
        return "ErpPaymentRecord{" +
                "recordId=" + recordId +
                ", recordWay='" + recordWay + '\'' +
                ", recordMoney=" + recordMoney +
                ", recordRemark='" + recordRemark + '\'' +
                ", empState=" + empState +
                ", empName='" + empName + '\'' +
                ", recordMark='" + recordMark + '\'' +
                ", payment=" + payment +
                ", account=" + account +
                ", boNumber=" + boNumber +
                '}';
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getRecordWay() {
        return recordWay;
    }

    public void setRecordWay(String recordWay) {
        this.recordWay = recordWay;
    }

    public Double getRecordMoney() {
        return recordMoney;
    }

    public void setRecordMoney(Double recordMoney) {
        this.recordMoney = recordMoney;
    }

    public String getRecordRemark() {
        return recordRemark;
    }

    public void setRecordRemark(String recordRemark) {
        this.recordRemark = recordRemark;
    }

    public int getEmpState() {
        return empState;
    }

    public void setEmpState(int empState) {
        this.empState = empState;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRecordMark() {
        return recordMark;
    }

    public void setRecordMark(String recordMark) {
        this.recordMark = recordMark;
    }

    public ErpPayment getPayment() {
        return payment;
    }

    public void setPayment(ErpPayment payment) {
        this.payment = payment;
    }

    public ErpAccount getAccount() {
        return account;
    }

    public void setAccount(ErpAccount account) {
        this.account = account;
    }

    public ErpBuyingOrder getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(ErpBuyingOrder boNumber) {
        this.boNumber = boNumber;
    }
}
