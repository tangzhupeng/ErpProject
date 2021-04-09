package cn.gson.jindie.model.pojos.txypojos;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErpProvider {
    private Integer providerId;
    private String providerName;
    private ErpProviderType gysId;
    private String providerPeople;
    private String providerPhone;
    private String providerLocation;
    private Double providerMoney;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date providerTime;
    private int providerState;
    private String providerDizhi;

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ErpProviderType getGysId() {
        return gysId;
    }

    public void setGysId(ErpProviderType gysId) {
        this.gysId = gysId;
    }

    public String getProviderPeople() {
        return providerPeople;
    }

    public void setProviderPeople(String providerPeople) {
        this.providerPeople = providerPeople;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public String getProviderLocation() {
        return providerLocation;
    }

    public void setProviderLocation(String providerLocation) {
        this.providerLocation = providerLocation;
    }

    public Double getProviderMoney() {
        return providerMoney;
    }

    public void setProviderMoney(Double providerMoney) {
        this.providerMoney = providerMoney;
    }

    public Date getProviderTime() {
        return providerTime;
    }

    public void setProviderTime(Date providerTime) {
        this.providerTime = providerTime;
    }

    public int getProviderState() {
        return providerState;
    }

    public void setProviderState(int providerState) {
        this.providerState = providerState;
    }

    public String getProviderDizhi() {
        return providerDizhi;
    }

    public void setProviderDizhi(String providerDizhi) {
        this.providerDizhi = providerDizhi;
    }
}
