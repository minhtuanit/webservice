package DAO;

import Persistence.Email;
import Persistence.Employee;

public interface AuthorizationDAO {
    public Employee checkLogin(Email email);
}
