package DAOImpl;

import DAO.MainDAO;
import Model.ModelSearchInput;
import Model.ModelSearchOutput;
import Utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.testng.log4testng.Logger;

import java.util.ArrayList;
import java.util.List;

@Component
public class MainImpl implements MainDAO {

    /**
     *
     * @param modelSearchInput
     * //using to search for modelSearchInput
     * @return
     * //Return list ModelSearchOutput
     */
    @Override
    public List<ModelSearchOutput> SearchInputForm(ModelSearchInput modelSearchInput) {
        Logger LOG = Logger.getLogger(MainImpl.class);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = null;
        List<ModelSearchOutput> list = new ArrayList<>();
        try{
            ts = session.beginTransaction();
            String strQuery = "select C.project.projectName,C.employee.name,C.workingDate,C.workingHour,C.workingDetail " +
                    "from Performance as C  where C.project.projectId = :projectId and C.workingDate >= :workingDate and " +
                    " C.project.startDate >= :startDate and C.project.endDate <= :endDate";
            Query query = session.createQuery(strQuery);
            query.setParameter("projectId",modelSearchInput.getProjectId());
            query.setParameter("workingDate",modelSearchInput.getTimeview());
            query.setParameter("startDate",modelSearchInput.getFromDate());
            query.setParameter("endDate",modelSearchInput.getToDate());
            List list1 = query.list();
            ts.commit();
            list = new ArrayList<>(list1);
        }catch (HibernateException ex){
            ex.printStackTrace();
            ts.rollback();
            return null;
        }finally {
            session.close();
        }
        return list;
    }
}
