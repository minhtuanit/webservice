package Entity;

public class PositionEntity {

    private Byte positionId;
    private String positionName;
    private Byte positionType;
    private Integer priorityId;
    private Integer delFlag;
    private String remark;

    public Byte getPositionId() {
        return positionId;
    }
    public void setPositionId(Byte positionId) {
        this.positionId = positionId;
    }
    public String getPositionName() {
        return positionName;
    }
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
    public Byte getPositionType() {
        return positionType;
    }
    public void setPositionType(Byte positionType) {
        this.positionType = positionType;
    }
    public Integer getPriorityId() {
        return priorityId;
    }
    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
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

