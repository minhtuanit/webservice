package Persistence;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "202tb_projectrole")
public class ProjectRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectRoleId;
	@Column(name = "projectRoleName")
	private String projectRoleName;
	@Column(name = "delFlag")
	private Integer delFlag;
	@Column(name = "remark")
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
