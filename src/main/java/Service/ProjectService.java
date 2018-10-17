package Service;

import DAO.ProjectDAO;
import DAOImpl.ProjectDAOImpl;
import Persistence.Project;

public class ProjectService {
    private ProjectDAO projectDAO;

    public ProjectService(){
        this.projectDAO = new ProjectDAOImpl();
    }

    public Project GetProjectById(int id){
        return projectDAO.GetProjectById(id);
    }

    public boolean InsertProject(Project project){
        return projectDAO.InsertProject(project);
    }

    public boolean UpdateProject(Project project){
        return projectDAO.UpdateProject(project);
    }

}
