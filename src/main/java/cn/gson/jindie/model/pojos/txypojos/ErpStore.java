package cn.gson.jindie.model.pojos.txypojos;

public class ErpStore {
    private Integer storeId;
    private String storeName;
    private Integer storeState;

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

    @Override
    public String toString() {
        return "ErpStore{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", storeState=" + storeState +
                '}';
    }
}
