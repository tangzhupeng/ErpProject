package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "erp_provider", schema = "", catalog = "erp3")
public class ErpProvider {
    private Integer providerId;
    private String providerName;
    private Integer gysId;
    private String providerPeople;
    private String providerPhone;
    private String providerLocation;
    private String providerMoney;
    private Date providerTime;
    private String providerState;

    @Id
    @Column(name = "provider_id")
    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    @Basic
    @Column(name = "provider_name")
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Basic
    @Column(name = "gys_id")
    public Integer getGysId() {
        return gysId;
    }

    public void setGysId(Integer gysId) {
        this.gysId = gysId;
    }

    @Basic
    @Column(name = "provider_people")
    public String getProviderPeople() {
        return providerPeople;
    }

    public void setProviderPeople(String providerPeople) {
        this.providerPeople = providerPeople;
    }

    @Basic
    @Column(name = "provider_phone")
    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    @Basic
    @Column(name = "provider_location")
    public String getProviderLocation() {
        return providerLocation;
    }

    public void setProviderLocation(String providerLocation) {
        this.providerLocation = providerLocation;
    }

    @Basic
    @Column(name = "provider_money")
    public String getProviderMoney() {
        return providerMoney;
    }

    public void setProviderMoney(String providerMoney) {
        this.providerMoney = providerMoney;
    }


    @Basic
    @Column(name = "provider_time")
    public Date getProviderTime() {
        return providerTime;
    }

    public void setProviderTime(Date providerTime) {
        this.providerTime = providerTime;
    }

    @Basic
    @Column(name = "provider_state")
    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpProvider that = (ErpProvider) o;
        return providerId == that.providerId &&
                Objects.equals(providerName, that.providerName) &&
                Objects.equals(gysId, that.gysId) &&
                Objects.equals(providerPeople, that.providerPeople) &&
                Objects.equals(providerPhone, that.providerPhone) &&
                Objects.equals(providerLocation, that.providerLocation) &&
                Objects.equals(providerMoney, that.providerMoney) &&
                Objects.equals(providerTime, that.providerTime) &&
                Objects.equals(providerState, that.providerState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, providerName, gysId, providerPeople, providerPhone, providerLocation, providerMoney, providerTime, providerState);
    }
}
