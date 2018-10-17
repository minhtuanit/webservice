package DAOImpl;

import DAO.WorkingReportDAO;
import Persistence.Performance;
import Persistence.Project;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class WorkingReportDAOImpl implements WorkingReportDAO {
    private Logger LOG = Logger.getLogger(WorkingReportDAOImpl.class);

    /**
     *
     * @param performance
     *
     * @return
     */
    @Override
    public boolean InsertPerformance(Performance performance) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.save(performance);
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

    /**
     *
     * @return
     */
    public List<Project> GetListProject(){
        List<Project> projects = new ArrayList<>();
        Project project;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            Query query = session.createQuery("select B.projectName,A.id from ProjectAssign as A left join A.project as B");
            List list = query.list();
            ts.commit();
            Iterator it = list.iterator();
            while(it.hasNext()){
                Object[] rows = (Object[]) it.next();
                LOG.debug(rows.length);
                project = new Project();
                if( rows.length == 2 ){
                    project.setProjectName((String)rows[0]);
                    project.setProjectId((Integer)rows[1]);
                }
                else{
                    project.setProjectName((String)rows[0]);
                }
                projects.add(project);
            }
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return projects;
    }
}
