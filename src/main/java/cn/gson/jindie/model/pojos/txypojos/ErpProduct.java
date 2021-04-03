package cn.gson.jindie.model.pojos.txypojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "erp_product", schema = "", catalog = "erp3")
public class ErpProduct {
    private int productId;
    private String productName;
    private String productPicture;
    private Integer protypeId;
    private Double productMoney;
    private Double productPrice;
    private String productDw;
    private Integer storeId;
    private Integer productNumber;
    private Integer productState;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_picture")
    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    @Basic
    @Column(name = "protype_id")
    public Integer getProtypeId() {
        return protypeId;
    }

    public void setProtypeId(Integer protypeId) {
        this.protypeId = protypeId;
    }

    @Basic
    @Column(name = "product_money")
    public Double getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(Double productMoney) {
        this.productMoney = productMoney;
    }

    @Basic
    @Column(name = "product_price")
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "product_dw")
    public String getProductDw() {
        return productDw;
    }

    public void setProductDw(String productDw) {
        this.productDw = productDw;
    }

    @Basic
    @Column(name = "store_id")
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "product_number")
    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    @Basic
    @Column(name = "product_state")
    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErpProduct that = (ErpProduct) o;
        return productId == that.productId &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(productPicture, that.productPicture) &&
                Objects.equals(protypeId, that.protypeId) &&
                Objects.equals(productMoney, that.productMoney) &&
                Objects.equals(productPrice, that.productPrice) &&
                Objects.equals(productDw, that.productDw) &&
                Objects.equals(storeId, that.storeId) &&
                Objects.equals(productNumber, that.productNumber) &&
                Objects.equals(productState, that.productState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productPicture, protypeId, productMoney, productPrice, productDw, storeId, productNumber, productState);
    }
}
