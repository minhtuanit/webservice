package Entity;

import java.util.Date;

public class ProjectAssignEntity {
    private Integer projectAssignId;
    private Integer projectId;
    private Integer employeeId;
    private Integer projectRoleId;
    private Date startDate;
    private Date endDate;
    private String remark;

    //added variable for business
    private String employeeName;
    private String projectRoleName;
    public Integer getProjectAssignId() {
        return projectAssignId;
    }
    public void setProjectAssignId(Integer projectAssignId) {
        this.projectAssignId = projectAssignId;
    }
    public Integer getProjectId() {
        return projectId;
    }
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getProjectRoleId() {
        return projectRoleId;
    }
    public void setProjectRoleId(Integer projectRoleId) {
        this.projectRoleId = projectRoleId;
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
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getProjectRoleName() {
        return projectRoleName;
    }
    public void setProjectRoleName(String projectRoleName) {
        this.projectRoleName = projectRoleName;
    }
}
