package com.solvd.dao.interfaces;
import com.solvd.dao.ClientsDAO;
import com.solvd.model.ClientsModel;
import java.util.List;

public interface IClientsDAO {
    public List<ClientsModel> getAllClients();

    public ClientsModel getRandomClient();
}
