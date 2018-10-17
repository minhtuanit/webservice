package Persistence;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "000tb_priority")
public class Priority {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer priorityId;
	@Column(name = "PriorityName")
	private String priorityName;
	@Column(name = "PriorityCode")
	private Integer priorityCode;
	@Column(name = "Remark")
	private String remark;


	public Integer getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public Integer getPriorityCode() {
		return priorityCode;
	}

	public void setPriorityCode(Integer priorityCode) {
		this.priorityCode = priorityCode;
	}


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
