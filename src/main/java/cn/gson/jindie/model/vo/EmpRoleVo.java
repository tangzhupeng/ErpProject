package cn.gson.jindie.model.vo;

import cn.gson.jindie.model.pojos.perpojos.ErpEmp;
import cn.gson.jindie.model.pojos.perpojos.ErpRole;

import java.net.Inet4Address;
import java.util.List;

public class EmpRoleVo {
    private Integer empRoleId;//员工id
    private String empName;//用户名
    private String roleName;//角色名称
    private Integer statu;//状态

//    List<ErpEmp> empList;//员工集合
//    List<ErpRole> roleList;//角色集合


    public EmpRoleVo(Integer empRoleId, String empName, String roleName, Integer statu) {
        this.empRoleId = empRoleId;
        this.empName = empName;
        this.roleName = roleName;
        this.statu = statu;
    }

    public EmpRoleVo(){}

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
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
