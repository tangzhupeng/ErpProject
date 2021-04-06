package cn.gson.jindie.view;

public class ParameterVo {
    private Integer id;
    private String startTime;
    private String endTime;
    private String empNameOrStoreNameOrNumber;
    private Integer status;
    private Integer pageNum;
    private Integer pageSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEmpNameOrStoreNameOrNumber() {
        return empNameOrStoreNameOrNumber;
    }

    public void setEmpNameOrStoreNameOrNumber(String empNameOrStoreNameOrNumber) {
        this.empNameOrStoreNameOrNumber = empNameOrStoreNameOrNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "ParameterVo{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", empNameOrStoreNameOrNumber='" + empNameOrStoreNameOrNumber + '\'' +
                ", status=" + status +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }
}
