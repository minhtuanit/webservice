package Controller;

import Persistence.Performance;
import Persistence.Project;
import Service.WorkingReportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkingReportController {
    private WorkingReportService workingReportService;

    public WorkingReportController(){
        workingReportService = new WorkingReportService();
    }

    @RequestMapping( path = "/workingreport/getallproject",method = RequestMethod.GET)
    public ResponseEntity<List<Project>> GetAllProject(){
        List<Project> projectList = workingReportService.GetListProject();
        if( projectList != null ){
            return new ResponseEntity<List<Project>>(projectList, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<List<Project>>(HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping( path = "/workingreport/addperformance",method = RequestMethod.PUT)
    public ResponseEntity<Object> AddPerfomance(@RequestBody Performance performance){
        boolean check = workingReportService.InsertPerformance(performance);
        return check?new ResponseEntity<>(HttpStatus.OK):new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
