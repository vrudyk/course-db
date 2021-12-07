package com.solvd.dao.interfaces;

import com.solvd.model.ClientModel;

import java.util.List;

public interface IClientsDAO {
    List<ClientModel> getAllClients();

    List<ClientModel> getAllClient();

    void addClients(ClientModel clientModel);

    void deleteClient(int id);

    void updateClient(ClientModel clientModel);

}
