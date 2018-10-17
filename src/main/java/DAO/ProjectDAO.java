package DAO;

import Persistence.Project;

public interface ProjectDAO {
    public Project GetProjectById(Integer id);
    public boolean UpdateProject(Project project);
    public boolean InsertProject(Project project);
}
