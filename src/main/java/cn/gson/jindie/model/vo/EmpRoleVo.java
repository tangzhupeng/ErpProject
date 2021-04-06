package cn.gson.jindie.model.vo;

public class EmpRoleVo {
    private int empRoleId;//id
    private String empName;//用户名
    private String roleName;//角色名称


    public EmpRoleVo(int empRoleId, String empName, String roleName) {
        this.empRoleId = empRoleId;
        this.empName = empName;
        this.roleName = roleName;
    }

    public EmpRoleVo(){}

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getEmpRoleId() {
        return empRoleId;
    }

    public void setEmpRoleId(int empRoleId) {
        this.empRoleId = empRoleId;
    }

    @Override
    public String toString() {
        return "EmpRoleVo{" +
                "empRoleId=" + empRoleId +
                ", empName='" + empName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
