package cn.gson.jindie.model.vo;

public class EmpPerVo {
    private Integer empId;//用户id
    private String empName;//用户名
    private String password;//密码
    private String roles;//权限名

    public EmpPerVo(Integer empId, String empName, String password, String roles) {
        this.empId = empId;
        this.empName = empName;
        this.password = password;
        this.roles = roles;
    }

    public EmpPerVo(){}

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
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

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "EmpPerVo{" +
                "empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
}
