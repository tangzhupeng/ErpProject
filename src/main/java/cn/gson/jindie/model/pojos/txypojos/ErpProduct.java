package cn.gson.jindie.model.pojos.txypojos;

import cn.gson.jindie.model.pojos.storempojos.ErpAllot;
import cn.gson.jindie.model.pojos.storempojos.ErpCheck;

public class ErpProduct {
    private Integer productId;
    private String productName;
    private String productPicture;
    private ErpProductType protype;
    private Double productMoney;//成本价
    private Double productPrice;//零售价
    private String productDw;
    private Double productVip;//VIP价格
    private ErpCheck erpCheck;
    private ErpAllot erpAllot;
    private ErpStore stores;
    private Integer productNumber;
    private Integer productState;
    private double productPf;

    public double getProductPf() {
        return productPf;
    }

    public void setProductPf(double productPf) {
        this.productPf = productPf;
    }

    public ErpProductType getProtype() {
        return protype;
    }

    public void setProtype(ErpProductType protype) {
        this.protype = protype;
    }

    public ErpCheck getErpCheck() {
        return erpCheck;
    }

    public void setErpCheck(ErpCheck erpCheck) {
        this.erpCheck = erpCheck;
    }

    public ErpAllot getErpAllot() {
        return erpAllot;
    }

    public void setErpAllot(ErpAllot erpAllot) {
        this.erpAllot = erpAllot;
    }

    public ErpStore getStores() {
        return stores;
    }

    public void setStores(ErpStore stores) {
        this.stores = stores;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public Double getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(Double productMoney) {
        this.productMoney = productMoney;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDw() {
        return productDw;
    }

    public void setProductDw(String productDw) {
        this.productDw = productDw;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getProductState() {
        return productState;
    }

    public void setProductState(Integer productState) {
        this.productState = productState;
    }

    public Double getProductVip() {
        return productVip;
    }

    public void setProductVip(Double productVip) {
        this.productVip = productVip;
    }
}
