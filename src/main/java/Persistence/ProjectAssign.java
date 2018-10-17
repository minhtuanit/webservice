package Persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "201tb_projectassign")
public class ProjectAssign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectAssignId;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	@Column(name = "remark")
	private String remark;
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	 @JoinColumn(name = "projectID")
	 private Project project;

	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "employeeID")
	 private Employee employee;

	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "projectRoleID")
	 private ProjectRole projectRole;

	public Integer getProjectAssignId() {
		return projectAssignId;
	}

	public void setProjectAssignId(Integer projectAssignId) {
		this.projectAssignId = projectAssignId;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ProjectRole getProjectRole() {
		return projectRole;
	}

	public void setProjectRole(ProjectRole projectRole) {
		this.projectRole = projectRole;
	}
}
