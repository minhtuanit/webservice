package DAOImpl;

import DAO.AuthorizationDAO;
import Entity.EmailEntity;
import Persistence.Email;
import Persistence.Employee;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
@Component
public class AuthorizationDAOImpl implements AuthorizationDAO {
    @Override
    public Employee checkLogin(Email email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        Employee employee = null;
        try{
            transaction = session.beginTransaction();
            String sql = "select B.id,B.name from Email as A inner join A.employee as B where A.emailAddress = :EmailAddress and A.employeePass = :EmployeePass";
            Query query = session.createQuery(sql);
            query.setParameter("EmailAddress",email.getEmailAddress());
            query.setParameter("EmployeePass",email.getEmployeePass());
            List list =  query.list();
            transaction.commit();
            Iterator it = list.iterator();
            while(it.hasNext()){
                employee = new Employee();
                Object[] rows = (Object[]) it.next();
                employee.setEmployeeId((Integer)rows[0]);
                employee.setName((String)rows[1]);
            }
        }catch (HibernateException ex){
            ex.printStackTrace();
            return null;
        }finally {
            session.close();
        }
        return employee;
    }
}
