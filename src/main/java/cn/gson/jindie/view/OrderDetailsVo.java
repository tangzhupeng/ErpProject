package cn.gson.jindie.view;

import cn.gson.jindie.model.pojos.salespojos.ErpOrderDetails;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.List;

public class OrderDetailsVo {
    private int orderId;
    private String empName;
    private String customerName;
    private String storeName;
    private String customerPhone;
    private String customerLocation;
    private String orderNumber;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp documentDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp deliveryDate;
    private Double accountReceivable;
//    private Double paymentReceived;
//    private Integer deliveryStatus;
//    private String creatorPerson;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp createTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Timestamp updateTime;
    private Integer approvalStatus;
    private Integer orderStatus;
    private String currentExaminer;
//    private String deliveryOrderNumber;
    private List<ErpOrderDetails>  erpOrderDetails;

    public OrderDetailsVo() {
    }

    public OrderDetailsVo(int orderId, String empName, String customerName, String storeName, String customerPhone, String customerLocation, String orderNumber, Timestamp documentDate, Timestamp deliveryDate, Double accountReceivable, Timestamp createTime, Timestamp updateTime, Integer approvalStatus, Integer orderStatus, String currentExaminer, List<ErpOrderDetails> erpOrderDetails) {
        this.orderId = orderId;
        this.empName = empName;
        this.customerName = customerName;
        this.storeName = storeName;
        this.customerPhone = customerPhone;
        this.customerLocation = customerLocation;
        this.orderNumber = orderNumber;
        this.documentDate = documentDate;
        this.deliveryDate = deliveryDate;
        this.accountReceivable = accountReceivable;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.approvalStatus = approvalStatus;
        this.orderStatus = orderStatus;
        this.currentExaminer = currentExaminer;
        this.erpOrderDetails = erpOrderDetails;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public Double getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Double accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCurrentExaminer() {
        return currentExaminer;
    }

    public void setCurrentExaminer(String currentExaminer) {
        this.currentExaminer = currentExaminer;
    }

    public List<ErpOrderDetails> getErpOrderDetails() {
        return erpOrderDetails;
    }

    public void setErpOrderDetails(List<ErpOrderDetails> erpOrderDetails) {
        this.erpOrderDetails = erpOrderDetails;
    }

    @Override
    public String toString() {
        return "OrderDetailsVo{" +
                "orderId=" + orderId +
                ", empName='" + empName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerLocation='" + customerLocation + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", documentDate=" + documentDate +
                ", deliveryDate=" + deliveryDate +
                ", accountReceivable=" + accountReceivable +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", approvalStatus=" + approvalStatus +
                ", orderStatus=" + orderStatus +
                ", currentExaminer='" + currentExaminer + '\'' +
                ", erpOrderDetails=" + erpOrderDetails +
                '}';
    }
}
