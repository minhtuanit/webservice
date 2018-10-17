package Controller;

import Model.ModelProjectAssign;
import Persistence.Project;
import Persistence.ProjectAssign;
import Service.ProjectAssignService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectAssignController {
    private ProjectAssignService projectAssignService;

    public ProjectAssignController(){
        this.projectAssignService = new ProjectAssignService();
    }

    @RequestMapping(path = "projectassign/add",method = RequestMethod.PUT)
    public ResponseEntity<Object> AddProjectAssign(@RequestBody ProjectAssign projectAssign){
        boolean check = projectAssignService.InsertProjectAssign(projectAssign);
        if(check){
            return new ResponseEntity<>("Insert Success", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Insert Failed", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "projectassign/update",method = RequestMethod.POST)
    public ResponseEntity<Object> UpdateProjectAssign(@RequestBody ProjectAssign projectAssign){
        boolean check = projectAssignService.UpdateProjectAssign(projectAssign);
        if(check){
            return new ResponseEntity<>("Update Success", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("Insert Failed", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "projectassign/getlistprojectassign/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> UpdateProjectAssign(@PathVariable Integer id){
        List<ModelProjectAssign> projectAssignList = projectAssignService.GetListProjectAssignByIDProject(id);
        if( projectAssignList != null){
            return new ResponseEntity<>(projectAssignList, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "projectassign/getlistproject",method = RequestMethod.GET)
    public ResponseEntity<Object> GetListProject(){
        List<Project> projectList = projectAssignService.GetListProject();
        if( projectList != null){
            return new ResponseEntity<>(projectList, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }
}
