package DAO;

import Model.ModelSearchInput;
import Model.ModelSearchOutput;

import java.util.List;

public interface MainDAO {
    public List<ModelSearchOutput> SearchInputForm(ModelSearchInput modelSearchInput);
}
