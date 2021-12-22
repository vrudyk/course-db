package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO extends AbstractDAO implements IClientsDAO {
    private IClientsDAO entityDAO;
    private Class<IClientsDAO> DAOClass = IClientsDAO.class;

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

    @Override
    public List<ClientModel> getAllClient() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ClientModel> entities = entityDAO.getAllClient();
        session.close();
        return entities;
    }

    @Override
    public void addClients(ClientModel clientModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addClients(clientModel);
        session.commit();
        session.close();
    }

    @Override
    public void deleteClient(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteClient(id);
        session.commit();
        session.close();
    }

    @Override
    public void updateClient(ClientModel clientModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateClient(clientModel);
        session.commit();
        session.close();
    }
}

