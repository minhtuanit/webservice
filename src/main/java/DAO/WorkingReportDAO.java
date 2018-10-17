package DAO;

import Persistence.Performance;
import Persistence.Project;

import java.util.List;

public interface WorkingReportDAO {
    public boolean InsertPerformance(Performance performance);
    public List<Project> GetListProject();
}
