package cn.gson.jindie.model.pojos.perpojos;

import java.util.List;

public class ErpEmpRole {
    private Integer empRoleId;
    private Integer empId;
    private Integer roleId;

    List<ErpEmp> empList;
    List<ErpRole> roleList;

    public ErpEmpRole(Integer empRoleId, Integer empId, Integer roleId, List<ErpEmp> empList, List<ErpRole> roleList) {
        this.empRoleId = empRoleId;
        this.empId = empId;
        this.roleId = roleId;
        this.empList = empList;
        this.roleList = roleList;
    }

    public ErpEmpRole(){}

    public Integer getEmpRoleId() {
        return empRoleId;
    }

    public void setEmpRoleId(Integer empRoleId) {
        this.empRoleId = empRoleId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<ErpEmp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<ErpEmp> empList) {
        this.empList = empList;
    }

    public List<ErpRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<ErpRole> roleList) {
        this.roleList = roleList;
    }
}
