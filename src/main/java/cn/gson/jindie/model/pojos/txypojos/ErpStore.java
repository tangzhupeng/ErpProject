package cn.gson.jindie.model.pojos.txypojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ErpStore {
    private Integer storeId;
    private String storeName;
    private Integer storeState;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date storeTime;

    public ErpStore(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Integer getStoreState() {
        return storeState;
    }

    public void setStoreState(Integer storeState) {
        this.storeState = storeState;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(Date storeTime) {
        this.storeTime = storeTime;
    }

    @Override
    public String toString() {
        return "ErpStore{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeState=" + storeState +
                ", storeTime=" + storeTime +
                '}';
    }

    public ErpStore() {
    }
}
