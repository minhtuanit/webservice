package Entity;

public class EmailEntity {

    private Integer emailId;
    private String emailAddress;
    private Integer employeeId;
    private String employeePass;
    private Integer delFlag;
    private String remark;

    public Integer getEmailId() {
        return emailId;
    }
    public void setEmailId(Integer email) {
        this.emailId = email;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeePass() {
        return employeePass;
    }
    public void setEmployeePass(String employeePass) {
        this.employeePass = employeePass;
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

