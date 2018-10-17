package Persistence;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "501tb_skilllist")
public class SkillList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillListId;
	@Column(name = "skillName")
	private String skillName;
	@Column(name = "skillType")
	private String skillType;
	@Column(name = "delFlag")
	private Integer delFlag;
	@Column(name = "remark")
	private String remark;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SkillListId")
	private Set<SkillManage> skillManageList;

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

	public Set<SkillManage> getSkillManageList() {
		return skillManageList;
	}

	public void setSkillManageList(Set<SkillManage> skillManageList) {
		this.skillManageList = skillManageList;
	}
}
