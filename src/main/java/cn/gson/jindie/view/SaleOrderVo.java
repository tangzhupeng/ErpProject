package cn.gson.jindie.view;


import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import cn.gson.jindie.model.pojos.txypojos.ErpProduct;

import java.sql.Timestamp;
import java.util.List;

public class SaleOrderVo {
    private Integer customerId;//供应商Id
    private Integer storeId;//仓库id
    private Integer empId;//员工Id
    private String orderNumber;//采购单编号
    private Double accountReceivable;//金额总计
    private Timestamp documentDate;//单据日期
    private Timestamp deliveryDate;//交货日期
    private List<ErpOrderDetails> orderDetails;//采购单产品详情

    public SaleOrderVo() {
    }

    public SaleOrderVo(Integer customerId) {
        this.customerId = customerId;
    }

    public SaleOrderVo(Integer customerId, Integer storeId, Integer empId, String orderNumber, Double accountReceivable, Timestamp documentDate, Timestamp deliveryDate, List<ErpOrderDetails> orderDetails) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.empId = empId;
        this.orderNumber = orderNumber;
        this.accountReceivable = accountReceivable;
        this.documentDate = documentDate;
        this.deliveryDate = deliveryDate;
        this.orderDetails = orderDetails;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getStoreId() {
        return storeId;
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

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Double accountReceivable) {
        this.accountReceivable = accountReceivable;
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
}
