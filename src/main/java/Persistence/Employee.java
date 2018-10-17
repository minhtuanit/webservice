package Persistence;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "300tb_employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	@Column(name = "Name")
	private String name;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "StartDate")
	private Date startDate;
	@Column(name = "EndDate")
	private Date endDate;
	@Column(name = "EmailPrivate")
	private String emailPrivate;
	@Column(name = "Mobile")
	private String mobile;
	@Column(name = "Address")
	private String address;
	@Column(name = "BirthDay")
	private Date birthDay;
	@Column(name = "Desire")
	private String desire;
	@Column(name = "DelFlag")
	private Integer delFlag;
	@Column(name = "Remark")
	private String remark;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "projectID")
	private Set<Project> projectList;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "levelID")
	private Level level;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "positionID")
	private Position position;

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "employeeID")
	 private Set<SkillManage> skillManageList;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getDesire() {
		return desire;
	}

	public void setDesire(String desire) {
		this.desire = desire;
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


	public Set<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(Set<Project> projectList) {
		this.projectList = projectList;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Set<SkillManage> getSkillManageList() {
		return skillManageList;
	}

	public void setSkillManageList(Set<SkillManage> skillManageList) {
		this.skillManageList = skillManageList;
	}

	public String getEmailPrivate() {
		return emailPrivate;
	}

	public void setEmailPrivate(String emailPrivate) {
		this.emailPrivate = emailPrivate;
	}
}