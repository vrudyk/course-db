package com.solvd.dao.interfaces;

import java.util.List;

import com.solvd.model.BankModel;

public interface IBanksDAO {

    List<BankModel> getAllBanks();

    List<BankModel> getAllBankss();

    void deleteBankById(int idBank);

    void insertIntoBank(int idBank, String Name);

    void addBank(BankModel bankModel);
}
