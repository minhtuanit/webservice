package Persistence;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "303tb_position")
public class Position {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer positionId;
	@Column(name = "PositionName")
	private String positionName;
	@Column(name = "PositionType")
	private Integer positionType;
	@Column(name = "DelFlag")
	private Integer delFlag;
	@Column(name = "Remark")
	private String remark;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "priorityID")
	private Priority priority;

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public Integer getPositionType() {
		return positionType;
	}

	public void setPositionType(Integer positionType) {
		this.positionType = positionType;
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


	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}
}
