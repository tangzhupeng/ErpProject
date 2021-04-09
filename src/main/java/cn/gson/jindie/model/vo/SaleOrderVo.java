package cn.gson.jindie.model.vo;


import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class SaleOrderVo {
    private Integer customerId;//供应商Id 客户
    private Integer storeId;//仓库id
    private Integer empId;//员工Id
    private String bianHao;//采购单编号
    private Double zonJi;//金额总计
    private Double[] salePrice;
    private Timestamp documentDate;//单据日期
    private Timestamp deliveryDate;//交货日期
    private List<ErpOrderDetails> orderDetails;//采购单产品详情


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public Double[] getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double[] salePrice) {
        this.salePrice = salePrice;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getBianHao() {
        return bianHao;
    }

    public void setBianHao(String bianHao) {
        this.bianHao = bianHao;
    }

    public Double getZonJi() {
        return zonJi;
    }

    public void setZonJi(Double zonJi) {
        this.zonJi = zonJi;
    }

    public Timestamp getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(Timestamp documentDate) {
        this.documentDate = documentDate;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<ErpOrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<ErpOrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "SaleOrderVo{" +
                "customerId=" + customerId +
                ", storeId=" + storeId +
                ", empId=" + empId +
                ", bianHao='" + bianHao + '\'' +
                ", zonJi=" + zonJi +
                ", salePrice=" + Arrays.asList(salePrice)  +
                ", documentDate=" + documentDate +
                ", deliveryDate=" + deliveryDate +
                ", orderDetails=" + orderDetails +
                '}';
    }
}
