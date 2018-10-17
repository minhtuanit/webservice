package Service;

import DAO.ProjectAssignDAO;
import DAOImpl.ProjectAssignDAOImpl;
import Model.ModelProjectAssign;
import Persistence.Project;
import Persistence.ProjectAssign;

import java.util.List;

public class ProjectAssignService{
    private ProjectAssignDAO projectAssignDAO;

    public ProjectAssignService(){
        this.projectAssignDAO = new ProjectAssignDAOImpl();
    }

    public boolean InsertProjectAssign(ProjectAssign projectAssign){
        return projectAssignDAO.InsertProjectAssign(projectAssign);
    }

    public boolean UpdateProjectAssign(ProjectAssign projectAssign){
        return projectAssignDAO.UpdateProjectAssign(projectAssign);
    }

    public List<Project> GetListProject(){
        return projectAssignDAO.GetListProject();
    }

    public List<ModelProjectAssign> GetListProjectAssignByIDProject(int id){
        return projectAssignDAO.GetListProjectAssignByProjectId(id);
    }
}
