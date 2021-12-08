package com.solvd.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IBanksDAO;
import com.solvd.model.BankModel;

public class BankDAO extends AbstractDAO implements IBanksDAO {

    @Override
    public List<BankModel> getAllBanks() {
        List<BankModel> allBanks = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM Bank");
            while (resultSet.next()) {
                BankModel bank = new BankModel();
                bank.setIdBank(resultSet.getInt("idBank"));
                bank.setName(resultSet.getString("Name"));
                allBanks.add(bank);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allBanks;
    }
}




















