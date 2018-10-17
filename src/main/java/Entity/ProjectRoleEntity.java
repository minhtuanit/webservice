package Entity;

public class ProjectRoleEntity {
    private Integer projectRoleId;
    private String projectRoleName;
    private Integer delFlag;
    private String remark;
    public Integer getProjectRoleId() {
        return projectRoleId;
    }
    public void setProjectRoleId(Integer projectRoleId) {
        this.projectRoleId = projectRoleId;
    }
    public String getProjectRoleName() {
        return projectRoleName;
    }
    public void setProjectRoleName(String projectRoleName) {
        this.projectRoleName = projectRoleName;
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
