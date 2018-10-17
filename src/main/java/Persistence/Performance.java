package Persistence;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "100tb_performance")
public class Performance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer performanceId;
	@Column(name = "WorkingDate")
	private Date workingDate;
	@Column(name = "WorkingHour")
	private Double workingHour;
	@Column(name = "WorkingName")
	private String workingName;
	@Column(name = "WorkingDetail")
	private String workingDetail;


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeID")
	private Employee employee;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectID")
	private Project project;

	public Integer getPerformanceId() {
		return performanceId;
	}

	public void setPerformanceId(Integer performanceId) {
		this.performanceId = performanceId;
	}


	public Date getWorkingDate() {
		return workingDate;
	}

	public void setWorkingDate(Date workingDate) {
		this.workingDate = workingDate;
	}

	public Double getWorkingHour() {
		return workingHour;
	}

	public void setWorkingHour(Double workingHour) {
		this.workingHour = workingHour;
	}

	public String getWorkingName() {
		return workingName;
	}

	public void setWorkingName(String workingName) {
		this.workingName = workingName;
	}

	public String getWorkingDetail() {
		return workingDetail;
	}

	public void setWorkingDetail(String workingDetail) {
		this.workingDetail = workingDetail;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}