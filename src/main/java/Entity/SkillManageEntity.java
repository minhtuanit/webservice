package Entity;

import java.util.Date;

public class SkillManageEntity {

    private Integer skillId;
    private Integer employeeId;
    private Integer skillListId;
    private Date startDate;
    private Integer delFlag = 0;
    private String remark;


    public Integer getSkillId() {
        return skillId;
    }
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }
    public Integer getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public Integer getSkillListId() {
        return skillListId;
    }
    public void setSkillListId(Integer skillListId) {
        this.skillListId = skillListId;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
