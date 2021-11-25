package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IPassportsDAO;
import com.solvd.model.PassportModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassportsDAO extends AbstractDAO implements IPassportsDAO {

    @Override
    public List<PassportModel> getAllPassports() {
        List<PassportModel> allPassports = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM passport");
            while (resultSet.next()) {
                PassportModel passport = new PassportModel();
                passport.setId(resultSet.getInt("id"));
                passport.setSeria(resultSet.getString("seria"));
                passport.setCode(resultSet.getInt("code"));
                allPassports.add(passport);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allPassports;
    }
}
