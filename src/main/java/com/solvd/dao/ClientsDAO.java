package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO extends AbstractDAO implements IClientsDAO {

    @Override
    public List<ClientModel> getAllClients() {
        List<ClientModel> allClients = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM clients");
            while (resultSet.next()) {
                ClientModel client = new ClientModel();
                client.setId(resultSet.getInt("id"));
                client.setfName(resultSet.getString("fName"));
                client.setlName(resultSet.getString("lName"));
                client.setPhone(resultSet.getString("phone"));
                allClients.add(client);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allClients;
    }
}
