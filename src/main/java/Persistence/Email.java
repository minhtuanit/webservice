package Persistence;

import javax.persistence.*;

@Entity
@Table(name = "301tb_email")
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emailId;
	@Column(name = "emailAddress")
	private String emailAddress;
	@Column(name = "employeePass")
	private String employeePass;
	@Column(name = "delFlag")
	private Integer delFlag;
	@Column(name = "remark")
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employeeID")
	private Employee employee;


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getEmailId() {
		return emailId;
	}

	public void setEmailId(Integer emailId) {
		this.emailId = emailId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getEmployeePass() {
		return employeePass;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public void setEmployeePass(String employeePass) {
		this.employeePass = employeePass;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
