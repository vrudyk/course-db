package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.dao.interfaces.ICreditCardsDAO;
import com.solvd.model.ClientsModel;
import com.solvd.model.CreditCardsModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardsDAO extends AbstractDAO implements ICreditCardsDAO {
    private ICreditCardsDAO entityDAO;
    private Class<ICreditCardsDAO> DAOClass = ICreditCardsDAO.class;
    @Override
    public List<CreditCardsModel> getAllCreditCards() {
        List<CreditCardsModel> allCreditCardsModel = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM `credit cards`");
            while(resultSet.next()){
                CreditCardsModel creditCards = new CreditCardsModel();
                creditCards.setId(resultSet.getInt("id"));
                creditCards.setCardNumber(resultSet.getString("CardNumber"));
                creditCards.setCvv(resultSet.getString("CVV"));
                creditCards.setValidityPeriod(resultSet.getString("ValidityPeriod"));
                creditCards.setClients_id(resultSet.getInt("Clients_id"));
                allCreditCardsModel.add(creditCards);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allCreditCardsModel;
    }

    @Override
    public List<CreditCardsModel> getAllCreditCardsMyBatis() {
        SqlSession sqlSession = OpenSession.getOpenSession().openSession();
        entityDAO = sqlSession.getMapper(DAOClass);
        List<CreditCardsModel> entities = entityDAO.getAllCreditCardsMyBatis();
        sqlSession.close();
        return entities;
    }

    @Override
    public void addCreditCard(CreditCardsModel creditCardsModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addCreditCard(creditCardsModel);
        session.commit();
        session.close();
    }

    @Override
    public void updateCreditCard(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateCreditCard(id);
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
