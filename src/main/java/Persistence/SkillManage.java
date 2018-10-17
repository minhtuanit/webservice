package Persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "500tb_skillmanage")
public class SkillManage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillId;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "delFlag")
	private Integer delFlag;
	@Column(name = "remark")
	private String remark;
	@OneToOne
	@JoinColumn(name = "employeeID")
	private Employee employee;

	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
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


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
