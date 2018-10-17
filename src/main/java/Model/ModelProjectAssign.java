package Model;

import java.util.Date;

public class ModelProjectAssign {
    private String employeeName;
    private Integer projectAssignId;
    private String projectRoleName;
    private Date startDate;
    private Date endDate;
    private String remark;

    public Integer getProjectAssignId() {
        return projectAssignId;
    }

    public void setProjectAssignId(Integer projectAssignId) {
        this.projectAssignId = projectAssignId;
    }

    public String getProjectRoleName() {
        return projectRoleName;
    }

    public void setProjectRoleName(String projectRoleName) {
        this.projectRoleName = projectRoleName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
