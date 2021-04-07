package cn.gson.jindie.model.vo;

public class EmpRoleVos {
    private Integer empRoleId;//员工角色id
    private String empName;//员工名
    private Integer roleId;//角色id
    private Integer statu;//状态

    public EmpRoleVos(Integer empRoleId, String empName, Integer roleId, Integer statu) {
        this.empRoleId = empRoleId;
        this.empName = empName;
        this.roleId = roleId;
        this.statu = statu;
    }
    public EmpRoleVos(){

    }

    public Integer getEmpRoleId() {
        return empRoleId;
    }

    public void setEmpRoleId(Integer empRoleId) {
        this.empRoleId = empRoleId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }
}
