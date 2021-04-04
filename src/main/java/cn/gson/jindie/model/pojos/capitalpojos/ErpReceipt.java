package cn.gson.jindie.model.pojos.capitalpojos;

import cn.gson.jindie.model.pojos.PerPojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;

import java.sql.Timestamp;

public class ErpReceipt {
    private String receiptId;
    private Timestamp receiptTime;
    private Double receiptMoney;
    private Double receiptHxmoney;
    private Double receiptYsmoney;
    private String receiptDiscount;
    private String receiptRemark;

    private ErpEmp emp; //收款人
    private ErpEmp empAudit; //审批人
    private ErpCustomer customer; //客户


    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }


    public ErpEmp getEmp() {
        return emp;
    }

    public void setEmp(ErpEmp emp) {
        this.emp = emp;
    }



    public ErpEmp getEmpAudit() {
        return empAudit;
    }

    public void setEmpAudit(ErpEmp empAudit) {
        this.empAudit = empAudit;
    }

    public ErpCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ErpCustomer customer) {
        this.customer = customer;
    }



    public Timestamp getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Timestamp receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Double getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Double receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    public Double getReceiptHxmoney() {
        return receiptHxmoney;
    }

    public void setReceiptHxmoney(Double receiptHxmoney) {
        this.receiptHxmoney = receiptHxmoney;
    }

    public Double getReceiptYsmoney() {
        return receiptYsmoney;
    }

    public void setReceiptYsmoney(Double receiptYsmoney) {
        this.receiptYsmoney = receiptYsmoney;
    }

    public String getReceiptDiscount() {
        return receiptDiscount;
    }

    public void setReceiptDiscount(String receiptDiscount) {
        this.receiptDiscount = receiptDiscount;
    }

    public String getReceiptRemark() {
        return receiptRemark;
    }

    public void setReceiptRemark(String receiptRemark) {
        this.receiptRemark = receiptRemark;
    }



    @Override
    public String toString() {
        return "ErpReceipt{" +
                "receiptId='" + receiptId + '\'' +
                ", receiptTime=" + receiptTime +
                ", receiptMoney=" + receiptMoney +
                ", receiptHxmoney=" + receiptHxmoney +
                ", receiptYsmoney=" + receiptYsmoney +
                ", receiptDiscount='" + receiptDiscount + '\'' +
                ", receiptRemark='" + receiptRemark + '\'' +
                ", emp=" + emp +
                ", empAudit=" + empAudit +
                ", customer=" + customer +
                '}';
    }
}
