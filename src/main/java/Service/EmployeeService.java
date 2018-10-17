package Service;

import DAO.EmployeeDAO;
import DAOImpl.EmployeeDAOImpl;
import Persistence.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(){
        employeeDAO = new EmployeeDAOImpl();
    }

    public List<Employee> GetListEmployee(){
        return employeeDAO.GetListEmployee();
    }

    public boolean InsertEmployee(Employee employee){
        return employeeDAO.InsertEmployee(employee);
    }

    public boolean UpdateEmployee(Employee employee){
        return employeeDAO.UpdateEmployee(employee);
    }
}
