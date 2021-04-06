package cn.gson.jindie.model.pojos.perpojos;


import java.util.List;

public class ErpEmp {
    private int empId;
    private String empName;
    private String password;
    private String phone;
    private Integer statu;
    private List<ErpPermission> permissionList;

    public ErpEmp(int empId, String empName, String password, String phone, Integer statu, List<ErpPermission> permissionList) {
        this.empId = empId;
        this.empName = empName;
        this.password = password;
        this.phone = phone;
        this.statu = statu;
        this.permissionList = permissionList;
    }

    public ErpEmp(){}

    public List<ErpPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<ErpPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }


    @Override
    public String toString() {
        return "ErpEmp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", statu=" + statu +
                '}';
    }
}
