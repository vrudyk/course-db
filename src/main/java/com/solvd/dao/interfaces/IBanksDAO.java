package com.solvd.dao.interfaces;

import java.util.List;

import com.solvd.model.BankModel;

public interface IBanksDAO {

    List<BankModel> getAllBanks();

    void deleteBankById(int idBank);

    void insertIntoBank(int idBank, String Name);
}
