package com.solvd.dao.interfaces;
import com.solvd.dao.ClientsDAO;
import com.solvd.model.ClientsModel;
import java.util.List;

public interface IClientsDAO {
    public List<ClientsModel> getAllClients();

    public ClientsModel getRandomClient();

    public List<ClientsModel> getAllClientsMyBatis();

    public void addClient(ClientsModel clientsModel);

    public void updateName(String firstName);

    public void deleteRow(int id);
}
