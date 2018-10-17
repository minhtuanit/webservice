package Controller;

import Persistence.Project;
import Service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    private ProjectService projectService;
    public ProjectController(){
        projectService = new ProjectService();
    }

    @RequestMapping( path = "/project/getproject/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> GetProject(@PathVariable Integer id){
        Project project = projectService.GetProjectById(id);
        if( project != null ){
            return new ResponseEntity<>(project, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping( path = "/project/addproject",method = RequestMethod.PUT)
    public ResponseEntity<Object> AddProject(@PathVariable Project project){
        boolean check = projectService.InsertProject(project);
        return check ? new ResponseEntity<>(null, HttpStatus.OK):
                new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    @RequestMapping( path = "/project/addproject",method = RequestMethod.POST)
    public ResponseEntity<Object> UpdateProject(@PathVariable Project project){
        boolean check = projectService.UpdateProject(project);
        return check ? new ResponseEntity<>(null, HttpStatus.OK):
                new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
