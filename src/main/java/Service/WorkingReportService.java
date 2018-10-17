package Service;

import DAO.WorkingReportDAO;
import DAOImpl.WorkingReportDAOImpl;
import Persistence.Performance;
import Persistence.Project;

import java.util.List;

public class WorkingReportService {
    private WorkingReportDAO workingReportDAO;

    public WorkingReportService(){
        this.workingReportDAO = new WorkingReportDAOImpl();
    }

    public List<Project> GetListProject(){
        return workingReportDAO.GetListProject();
    }

    public boolean InsertPerformance(Performance performance){
        return workingReportDAO.InsertPerformance(performance);
    }


}
