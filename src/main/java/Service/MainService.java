package Service;

import DAO.MainDAO;
import DAOImpl.MainImpl;
import Model.ModelSearchInput;
import Model.ModelSearchOutput;

import java.util.List;

public class MainService {
    private MainDAO mainDAO;

    public MainService(){
        mainDAO = new MainImpl();
    }

    public List<ModelSearchOutput> Search(ModelSearchInput modelSearchInput){
        return mainDAO.SearchInputForm(modelSearchInput);
    }


}
