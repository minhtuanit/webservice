package Model;

import Utils.TimeviewUtil;

import java.util.Date;

public class ModelSearchInput {
    private Integer projectId;
    private Integer timeview;
    private Date fromDate;
    private Date toDate;

    public ModelSearchInput(Integer projectId, Integer timeview, Date fromDate, Date toDate) {
        this.projectId = projectId;
        this.timeview = timeview;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Date getTimeview() {
        return TimeviewUtil.GetDateByTimeView(timeview);
    }

    public void setTimeview(Integer timeview) {
        this.timeview = timeview;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}
