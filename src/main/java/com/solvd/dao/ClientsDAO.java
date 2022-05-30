package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.model.ClientsModel;
import com.solvd.util.OpenSession;
import org.apache.commons.lang3.RandomUtils;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO extends AbstractDAO implements IClientsDAO {
    private IClientsDAO entityDAO;
    private Class<IClientsDAO> DAOClass = IClientsDAO.class;

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

    @Override
    public List<ClientsModel> getAllClientsMyBatis() {
        SqlSession sqlSession = OpenSession.getOpenSession().openSession();
        entityDAO = sqlSession.getMapper(DAOClass);
        List<ClientsModel> entities = entityDAO.getAllClientsMyBatis();
        sqlSession.close();
        return entities;
    }

    @Override
    public void addClient(ClientsModel clientsModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addClient(clientsModel);
        session.commit();
        session.close();
    }

    @Override
    public void updateName(String firstName) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateName(firstName);
        session.commit();
        session.close();
    }

    @Override
    public void deleteRow(int clientId) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteRow(clientId);
        session.commit();
        session.close();
    }
}
