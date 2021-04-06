package cn.gson.jindie.model.pojos.perpojos;

public class ErpEmpPer {
    private int id;
    private int empId;
    private int perId;
    private ErpEmp emp;
    private ErpPermission permission;


    public ErpEmpPer(int id, int empId, int perId, ErpEmp emp, ErpPermission permission) {
        this.id = id;
        this.empId = empId;
        this.perId = perId;
        this.emp = emp;
        this.permission = permission;
    }

    public ErpEmpPer(int empId, int perId, ErpEmp emp, ErpPermission permission) {
        this.empId = empId;
        this.perId = perId;
        this.emp = emp;
        this.permission = permission;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ErpEmpPer(){}

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    public ErpEmp getEmp() {
        return emp;
    }

    public void setEmp(ErpEmp emp) {
        this.emp = emp;
    }

    public ErpPermission getPermission() {
        return permission;
    }

    public void setPermission(ErpPermission permission) {
        this.permission = permission;
    }

}
