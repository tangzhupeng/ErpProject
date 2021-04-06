package cn.gson.jindie.model.pojos.capitalpojos;


import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.txypojos.ErpCustomer;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;


public class ErpReceipt {
    private String receiptId;
    private String preparedBy;//制单人
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date receiptTime;
    private Double receiptMoney;
    private Double receiptHxMoney;
    private String receiptDiscount;

    private ErpEmp emp; //收款人
    private ErpCustomer customer; //客户
    private ErpReceiptRecord receiptRecords;

    public ErpReceiptRecord getReceiptRecords() {
        return receiptRecords;
    }

    public void setReceiptRecords( ErpReceiptRecord receiptRecords) {
        this.receiptRecords = receiptRecords;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

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


    public ErpCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(ErpCustomer customer) {
        this.customer = customer;
    }



    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Double getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Double receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    public Double getReceiptHxMoney() {
        return receiptHxMoney;
    }

    public void setReceiptHxMoney(Double receiptHxMoney) {
        this.receiptHxMoney = receiptHxMoney;
    }

    public String getReceiptDiscount() {
        return receiptDiscount;
    }

    public void setReceiptDiscount(String receiptDiscount) {
        this.receiptDiscount = receiptDiscount;
    }


    @Override
    public String toString() {
        return "ErpReceipt{" +
                "receiptId='" + receiptId + '\'' +
                ", preparedBy='" + preparedBy + '\'' +
                ", receiptTime=" + receiptTime +
                ", receiptMoney=" + receiptMoney +
                ", receiptHxMoney=" + receiptHxMoney +
                ", receiptDiscount='" + receiptDiscount + '\'' +
                ", emp=" + emp +
                ", customer=" + customer +
                ", receiptRecords=" + receiptRecords +
                '}';
    }
}
