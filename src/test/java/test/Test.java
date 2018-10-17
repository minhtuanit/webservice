package test;

import DAO.EmployeeDAO;
import DAO.ProjectDAO;
import DAOImpl.*;
import Model.ModelProjectAssign;
import Model.ModelSearchInput;
import Model.ModelSearchOutput;
import Persistence.Employee;
import Persistence.Project;
import Service.EmployeeService;
import Utils.TimeviewUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.log4testng.Logger;

import java.util.Date;
import java.util.List;

public class Test {
    private Logger LOG = Logger.getLogger(Test.class);
    @Autowired
    private EmployeeDAO employeeDAO ;

    public Test(){

    }

    private Logger logger = Logger.getLogger(Test.class);
    @org.testng.annotations.Test
    public void test(){
        MainImpl main = new MainImpl();
    }
    @org.testng.annotations.Test
    public void test2(){
        ProjectDAO projectDAO = new ProjectDAOImpl();
        Project project = new Project();
        project.setProjectId(1);
        projectDAO.UpdateProject(project);
    }
    @org.testng.annotations.Test
    public void testInputForm(){
       EmployeeService employeeService = new EmployeeService();
       List<Employee> employeeList = employeeService.GetListEmployee();
       LOG.debug(employeeList.size());
    }
}
