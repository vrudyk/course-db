package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.dao.interfaces.IPassportsDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.model.PassportModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PassportsDAO extends AbstractDAO implements IPassportsDAO {
    private IPassportsDAO entityDAO;
    private Class<IPassportsDAO> DAOClass = IPassportsDAO.class;

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

    @Override
    public List<PassportModel> getAllPassport() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<PassportModel> entities = entityDAO.getAllPassport();
        session.close();
        return entities;
    }
}
