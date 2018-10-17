package Model;

import java.util.Date;

public class ModelSearchOutput {
    private String projectName;
    private String employeeName;
    private Date workingTime;
    private Double workingHour;
    private String remark;

    public ModelSearchOutput(String projectName, String employeeName, Date workingTime, Double workingHour, String remark) {
        this.projectName = projectName;
        this.employeeName = employeeName;
        this.workingTime = workingTime;
        this.workingHour = workingHour;
        this.remark = remark;
    }

    public ModelSearchOutput(){

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(Date workingTime) {
        this.workingTime = workingTime;
    }

    public Double getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(Double workingHour) {
        this.workingHour = workingHour;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
