package Service;

import DAO.AuthorizationDAO;
import DAOImpl.AuthorizationDAOImpl;
import Entity.EmailEntity;
import Persistence.Email;
import Persistence.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AuthorizationService {
    private AuthorizationDAO authorizationDAO;

    public AuthorizationService(){
        authorizationDAO = new AuthorizationDAOImpl();
    }

    public Employee checkLogin(Email email){
        return authorizationDAO.checkLogin(email);
    }
}
