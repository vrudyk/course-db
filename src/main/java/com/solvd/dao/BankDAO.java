package com.solvd.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.solvd.Main;
import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IBanksDAO;
import com.solvd.model.BankModel;
import com.solvd.util.OpenSesion;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

public class BankDAO extends AbstractDAO implements IBanksDAO {

    private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(BankDAO.class);

    private IBanksDAO entityDAO;
    private Class<IBanksDAO> DAOClass = IBanksDAO.class;

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



    @Override
    public void deleteBankById(int idBank) {

        String delete = "DELETE FROM bank WHERE idBank = %s";
        String sqlDelete = String.format(delete, idBank);
        String massage = String.format("Removed Bank with idBank = %s", idBank);

        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlDelete);
            LOGGER.info(massage);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    @Override
    public void insertIntoBank(int idBank, String Name) {

        String insert = "INSERT INTO bank  VALUE (%s, '%s')";
        String sqlInsertIntoBank = String.format(insert, idBank, Name);
        String massage = String.format("Added new Bank with idBank = %s, Name = '%s'", idBank, Name);

        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsertIntoBank);
            LOGGER.info(massage);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }
    @Override
    public List<BankModel> getAllBankss() {

        SqlSession session = OpenSesion.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<BankModel> entities = entityDAO.getAllBankss();
        session.close();
        return entities;
    }

    @Override
    public void addBank(BankModel bankModel) {

        SqlSession session = OpenSesion.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addBank(bankModel);
        session.commit();
        session.close();
    }
}




















