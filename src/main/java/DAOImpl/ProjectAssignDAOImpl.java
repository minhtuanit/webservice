package DAOImpl;

import DAO.ProjectAssignDAO;
import Model.ModelProjectAssign;
import Persistence.Project;
import Persistence.ProjectAssign;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class ProjectAssignDAOImpl  implements ProjectAssignDAO {
    @Override
    public boolean UpdateProjectAssign(ProjectAssign projectAssign) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.update(projectAssign);
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
    public boolean InsertProjectAssign(ProjectAssign projectAssign) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            session.saveOrUpdate(projectAssign);
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
    public List<Project> GetListProject() {
        String query = "select A.projectId,A.projectName from Project as A";
        List<Project> projectAssignList = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            projectAssignList = session.createQuery(query).list();
            ts.commit();
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return projectAssignList;
    }

    @Override
    public List<ModelProjectAssign> GetListProjectAssignByProjectId(int id) {
        List<ModelProjectAssign> modelList;
        String query = "select B.name,D.projectRoleName,A.startDate,A.endDate,A.remark from ProjectAssign as A " +
                "inner join A.project as C  left join A.employee as B left join A.projectRole as D where A.project.projectId = :projectId";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            List list = session.createQuery(query).setParameter("projectId",id).list();
            ts.commit();
            Iterator it = list.iterator();
            modelList = new ArrayList<>();
            while(it.hasNext()){
                Object[] rows = (Object[]) it.next();
                ModelProjectAssign modelPA = new ModelProjectAssign();
                modelPA.setEmployeeName((String)rows[0]);
                modelPA.setProjectRoleName((String)rows[1]);
                modelPA.setStartDate((Date) rows[2]);
                modelPA.setEndDate((Date)rows[3]);
                modelPA.setRemark((String)rows[4]);
                modelList.add(modelPA);
            }
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return modelList;
    }
}
