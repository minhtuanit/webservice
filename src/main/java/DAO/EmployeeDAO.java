package DAO;

import Persistence.Employee;

import java.util.List;
public interface EmployeeDAO {
    public boolean UpdateEmployee(Employee employee);
    public boolean InsertEmployee(Employee employee);
    public List<Employee> GetListEmployee();
}
