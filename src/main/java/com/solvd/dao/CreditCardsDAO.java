package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ICreditCardsDAO;
import com.solvd.model.CreditCardsModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardsDAO extends AbstractDAO implements ICreditCardsDAO {

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
}
