package DAO;

import Model.ModelProjectAssign;
import Persistence.Project;
import Persistence.ProjectAssign;

import java.util.List;

public interface ProjectAssignDAO {
    public boolean UpdateProjectAssign(ProjectAssign projectAssign);
    public boolean InsertProjectAssign(ProjectAssign projectAssign);
    public List<Project> GetListProject();
    public List<ModelProjectAssign> GetListProjectAssignByProjectId(int id);
}
