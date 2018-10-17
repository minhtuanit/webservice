package Entity;

public class LevelEntity {
    private Integer levelId;
    private String name;
    private Integer delFlag;
    private String remark;
    public Integer getLevelId() {
        return levelId;
    }
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
