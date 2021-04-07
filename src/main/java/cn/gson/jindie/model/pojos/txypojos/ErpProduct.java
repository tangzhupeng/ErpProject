package cn.gson.jindie.model.pojos.txypojos;

public class ErpProduct {
    private Integer productId;
    private String productName;
    private String productPicture;
    /*private Integer protypeId;*/
    private Double productMoney;//成本价
    private Double productPrice;//零售价
    private String productDw;
    /*private Integer storeId;*/
    private Integer productNumber;
    private Integer productState;
    private Double productPf;//批发价
    private Double productVip;//VIP价格

    private ErpStore stores;

    public ErpStore getStores() {
        return stores;
    }

    public void setStores(ErpStore stores) {
        this.stores = stores;
    }

    private ErpProductType protype;

    public ErpProductType getProtype() {
        return protype;
    }

    public void setProtype(ErpProductType protype) {
        this.protype = protype;
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

    public Double getProductPf() {
        return productPf;
    }

    public void setProductPf(Double productPf) {
        this.productPf = productPf;
    }

    public Double getProductVip() {
        return productVip;
    }

    public void setProductVip(Double productVip) {
        this.productVip = productVip;
    }
}
