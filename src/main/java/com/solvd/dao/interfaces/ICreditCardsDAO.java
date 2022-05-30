package com.solvd.dao.interfaces;

import com.solvd.model.CreditCardsModel;

import java.util.List;

public interface ICreditCardsDAO {
    public List<CreditCardsModel> getAllCreditCards();

    public List<CreditCardsModel> getAllCreditCardsMyBatis();

    public void addCreditCard(CreditCardsModel creditCardsModel);

    public void updateCreditCard(int id);

    public void deleteRow(int clientId);
}
