package DAOImpl;

import DAO.EmployeeDAO;
import Persistence.Employee;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public boolean UpdateEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.saveOrUpdate(employee);
            ts.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return false;
        }finally {
            session.close();
        }
        return true;
    }

    @Override
    public boolean InsertEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.save(employee);
            ts.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return false;
        }finally {
            session.close();
        }
        return true;
    }

    @Override
    public List<Employee> GetListEmployee() {
        List<Employee> employeeList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            List list = session.createQuery("from Employee ").list();
            ts.commit();
            employeeList = new ArrayList<>(list);
            for(Employee employee : employeeList){
                employee.setSkillManageList(null);
                employee.setProjectList(null);
            }
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return employeeList;
    }
}
