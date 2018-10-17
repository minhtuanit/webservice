package Entity;

public class SkillListEntity {
    private Integer skillListId;
    private String skillName;
    private String skillType;
    private Integer delFlag;
    private String remark;

    public Integer getSkillListId() {
        return skillListId;
    }

    public void setSkillListId(Integer skillListId) {
        this.skillListId = skillListId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillType() {
        return skillType;
    }

    public void setSkillType(String skillType) {
        this.skillType = skillType;
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
