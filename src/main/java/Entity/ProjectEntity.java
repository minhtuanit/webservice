package Entity;

import java.util.Date;

public class ProjectEntity {
    private Integer projectId;
    private String projectName;
    private String projectInfo;
    private String customerName;
    private String customerInfo;
    private Date startDate;
    private Date endDate;
    private Integer delFlag;
    private String remark;

    public ProjectEntity() {
        this.setDelFlag(0);
    }

    public ProjectEntity(Integer projectID, String projectName, String projectInfo, String customerName,
                         String customerInfo, Date startDate, Date endDate, Integer delFlag, String remark) {
        super();
        this.projectId = projectID;
        this.projectName = projectName;
        this.projectInfo = projectInfo;
        this.customerName = customerName;
        this.customerInfo = customerInfo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.delFlag = delFlag;
        this.remark = remark;
    }


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectInfo() {
        return projectInfo;
    }
    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerInfo() {
        return customerInfo;
    }
    public void setCustomerInfo(String customerInfo) {
        this.customerInfo = customerInfo;
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
    public Integer getDelFlag() {
        return delFlag;
    }
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
}
