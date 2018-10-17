package Persistence;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "302tb_level")
public class Level {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer levelId;
	@Column(name = "Name")
	private String name;
	@Column(name = "DelFlag")
	private Integer delFlag;
	@Column(name = "Remark")
	private String remark;

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
