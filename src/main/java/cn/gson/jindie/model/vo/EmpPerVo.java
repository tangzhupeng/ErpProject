package cn.gson.jindie.model.vo;

public class EmpPerVo {
    private String empName;//用户名
    private String password;//密码
    private String roles;//权限名

    public EmpPerVo(String empName, String password, String roles) {
        this.empName = empName;
        this.password = password;
        this.roles = roles;
    }
    public EmpPerVo(){}

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
