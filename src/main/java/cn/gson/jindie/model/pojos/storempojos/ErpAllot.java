package cn.gson.jindie.model.pojos.storempojos;


import cn.gson.jindie.model.pojos.txypojos.ErpProduct;
import cn.gson.jindie.model.pojos.txypojos.ErpStore;

import java.sql.Date;
import java.util.List;

public class ErpAllot {
    private int allotId;
    private String allotName;
    private double allotMoney;
    private int allotNum;
    private Date createDate;
    private String allotApprove;
    private String allotState;
    private Date allotApdate;
    private String allotInAddress;
    private String allotOutAddress;
    private List<ErpStore> erpStore;
    private List<ErpProduct> erpProduct;
    private int allotStock;
    private String allotBz;
    public ErpAllot() {
    }

    public ErpAllot(int allotId, String allotName, double allotMoney, int allotNum, Date createDate, String allotApprove, String allotState, Date allotApdate, String allotInAddress, String allotOutAddress, List<ErpStore> erpStore, List<ErpProduct> erpProduct, int allotStock, String allotBz) {
        this.allotId = allotId;
        this.allotName = allotName;
        this.allotMoney = allotMoney;
        this.allotNum = allotNum;
        this.createDate = createDate;
        this.allotApprove = allotApprove;
        this.allotState = allotState;
        this.allotApdate = allotApdate;
        this.allotInAddress = allotInAddress;
        this.allotOutAddress = allotOutAddress;
        this.erpStore = erpStore;
        this.erpProduct = erpProduct;
        this.allotStock = allotStock;
        this.allotBz = allotBz;
    }

    public int getAllotId() {
        return allotId;
    }

    public void setAllotId(int allotId) {
        this.allotId = allotId;
    }

    public String getAllotName() {
        return allotName;
    }

    public void setAllotName(String allotName) {
        this.allotName = allotName;
    }

    public double getAllotMoney() {
        return allotMoney;
    }

    public void setAllotMoney(double allotMoney) {
        this.allotMoney = allotMoney;
    }

    public int getAllotNum() {
        return allotNum;
    }

    public void setAllotNum(int allotNum) {
        this.allotNum = allotNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAllotApprove() {
        return allotApprove;
    }

    public void setAllotApprove(String allotApprove) {
        this.allotApprove = allotApprove;
    }

    public String getAllotState() {
        return allotState;
    }

    public void setAllotState(String allotState) {
        this.allotState = allotState;
    }

    public Date getAllotApdate() {
        return allotApdate;
    }

    public void setAllotApdate(Date allotApdate) {
        this.allotApdate = allotApdate;
    }

    public String getAllotInAddress() {
        return allotInAddress;
    }

    public void setAllotInAddress(String allotInAddress) {
        this.allotInAddress = allotInAddress;
    }

    public String getAllotOutAddress() {
        return allotOutAddress;
    }

    public void setAllotOutAddress(String allotOutAddress) {
        this.allotOutAddress = allotOutAddress;
    }

    public List<ErpStore> getErpStore() {
        return erpStore;
    }

    public void setErpStore(List<ErpStore> erpStore) {
        this.erpStore = erpStore;
    }

    public List<ErpProduct> getErpProduct() {
        return erpProduct;
    }

    public void setErpProduct(List<ErpProduct> erpProduct) {
        this.erpProduct = erpProduct;
    }

    public int getAllotStock() {
        return allotStock;
    }

    public void setAllotStock(int allotStock) {
        this.allotStock = allotStock;
    }

    public String getAllotBz() {
        return allotBz;
    }

    public void setAllotBz(String allotBz) {
        this.allotBz = allotBz;
    }
}
