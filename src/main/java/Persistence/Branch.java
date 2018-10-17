package Persistence;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "400tb_branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer branchId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Location")
    private String location;
    @Column(name = "Address")
    private String address;
    @Column(name = "StartDate")
    private Date startDate;
    @Column(name = "EndDate")
    private Date endDate;
    @Column(name = "DelFlag")
    private Integer delFlag;
    @Column(name = "Remark")
    private String remark;
    public Integer getBranchId() {
        return branchId;
    }
    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
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
