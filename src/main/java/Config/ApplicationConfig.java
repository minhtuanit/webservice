package Config;

import DAO.*;
import DAOImpl.*;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan
public class ApplicationConfig {
    @Bean
    public AuthorizationDAO getAuthorizationDAO(){
        return new AuthorizationDAOImpl();
    }

    @Bean
    public EmployeeDAO getEmployeeDAO(){
        return new EmployeeDAOImpl();
    }

    @Bean
    public MainDAO getMainDAO(){
        return new MainImpl();
    }

    @Bean
    public ProjectAssignDAO getProjectAssignDAO(){
        return new ProjectAssignDAOImpl();
    }

    @Bean
    public ProjectDAO getProjectDAO(){
        return new ProjectDAOImpl();
    }

    @Bean
    public WorkingReportDAO getWorkingReportDAO(){
        return new WorkingReportDAOImpl();
    }

}
