package DAOImpl;

import DAO.ProjectDAO;
import Persistence.Project;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public class ProjectDAOImpl implements ProjectDAO {
    @Override
    public Project GetProjectById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        Project project = null;
        try{
            ts = session.beginTransaction();
            project = session.get(Project.class,id);
            ts.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return project;
    }

    @Override
    public boolean UpdateProject(Project project) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.update(project);
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
    public boolean InsertProject(Project project) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.saveOrUpdate(project);
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
}
