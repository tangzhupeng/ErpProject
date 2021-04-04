package cn.gson.jindie.model.pojos.purchasepojos;

import java.util.Date;

public class ErpPOrderMaster {
    private String poNumber;
    private Date poDate;
    private String poTos;
    private Integer providerId;
    private Double poMoney;
    private Integer empId;
    private Integer storeId;
    private Integer poState;
    private String boNumber;
    private Integer poEastate;
    private Integer supEmpId;
    private Integer poStstate;

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public String getPoTos() {
        return poTos;
    }

    public void setPoTos(String poTos) {
        this.poTos = poTos;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public Double getPoMoney() {
        return poMoney;
    }

    public void setPoMoney(Double poMoney) {
        this.poMoney = poMoney;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getPoState() {
        return poState;
    }

    public void setPoState(Integer poState) {
        this.poState = poState;
    }

    public String getBoNumber() {
        return boNumber;
    }

    public void setBoNumber(String boNumber) {
        this.boNumber = boNumber;
    }

    public Integer getPoEastate() {
        return poEastate;
    }

    public void setPoEastate(Integer poEastate) {
        this.poEastate = poEastate;
    }

    public Integer getSupEmpId() {
        return supEmpId;
    }

    public void setSupEmpId(Integer supEmpId) {
        this.supEmpId = supEmpId;
    }

    public Integer getPoStstate() {
        return poStstate;
    }

    public void setPoStstate(Integer poStstate) {
        this.poStstate = poStstate;
    }


}
