package Persistence;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Table(name = "200tb_project")
public class Project {
	@Id
	@Column(name = "projectId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectId;
	@Column(name = "projectName")
	private String projectName;
	@Column(name = "projectInfo")
	private String projectInfo;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerInfo")
	private String customerInfo;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	@Column(name = "delFlag")
	private Integer delFlag;
	@Column(name = "remark")
	private String remark;

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
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