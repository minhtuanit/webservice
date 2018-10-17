package Entity;

import java.util.Date;

public class PerformanceEntity {

    private Integer performanceId;
    private Integer employeeId;
    private Integer projectId;
    private Date workingDate;
    private Double workingHour;
    private String workingName;
    private String workingDetail;

    public Integer getPerformanceId() {
        return performanceId;
    }
    public void setPerformanceId(Integer performanceId) {
        this.performanceId = performanceId;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getProjectId() {
        return projectId;
    }
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
    public Date getWorkingDate() {
        return workingDate;
    }
    public void setWorkingDate(Date workingDate) {
        this.workingDate = workingDate;
    }
    public Double getWorkingHour() {
        return workingHour;
    }
    public void setWorkingHour(Double workingHour) {
        this.workingHour = workingHour;
    }
    public String getWorkingName() {
        return workingName;
    }
    public void setWorkingName(String workingName) {
        this.workingName = workingName;
    }
    public String getWorkingDetail() {
        return workingDetail;
    }
    public void setWorkingDetail(String workingDetail) {
        this.workingDetail = workingDetail;
    }
}
