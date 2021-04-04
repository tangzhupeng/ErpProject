package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_store", schema = "", catalog = "erp3")
public class ErpStore {
    private Integer storeId;
    private String storeName;
    private Integer storeState;

    @Id
    @Column(name = "store_id")
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "store_name")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Basic
    @Column(name = "store_state")
    public Integer getStoreState() {
        return storeState;
    }

    public void setStoreState(Integer storeState) {
        this.storeState = storeState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpStore erpStore = (ErpStore) o;
        return storeId == erpStore.storeId &&
                Objects.equals(storeName, erpStore.storeName) &&
                Objects.equals(storeState, erpStore.storeState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, storeName, storeState);
    }
}
