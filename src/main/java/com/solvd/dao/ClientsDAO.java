package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientsModel;
import org.apache.commons.lang3.RandomUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO extends AbstractDAO implements IClientsDAO {
    @Override
    public List<ClientsModel> getAllClients() {
        List<ClientsModel> allClients = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM clients");
            while(resultSet.next()){
                ClientsModel client = new ClientsModel();
                client.setId(resultSet.getInt("id"));
                client.setFirstName(resultSet.getString("First Name"));
                client.setSecondName(resultSet.getString("Second Name"));
                client.seteMail(resultSet.getString("E-mail"));
                client.setNumberOfPhone(resultSet.getString("NumberOfPhone"));
                client.setOnlineShopesId(resultSet.getInt("OnlineShopes_id"));
                allClients.add(client);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allClients;
    }

    @Override
    public ClientsModel getRandomClient() {
        List<ClientsModel> clientsModel = new ArrayList<>();
        try{
            getResultSet("SELECT * FROM clients");
            while(resultSet.next()){
                ClientsModel client = new ClientsModel();
                client.setId(resultSet.getInt("id"));
                client.setFirstName(resultSet.getString("First Name"));
                client.setSecondName(resultSet.getString("Second Name"));
                client.seteMail(resultSet.getString("E-mail"));
                client.setNumberOfPhone(resultSet.getString("NumberOfPhone"));
                client.setOnlineShopesId(resultSet.getInt("OnlineShopes_id"));
                clientsModel.add(client);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return clientsModel.get(RandomUtils.nextInt(0,clientsModel.size()));
    }
}
