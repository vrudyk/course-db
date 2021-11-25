package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesInfoDAO;
import com.solvd.model.EmployeesInfoModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesInfoDAO extends AbstractDAO implements IEmployeesInfoDAO {

    @Override
    public List<EmployeesInfoModel> getAllEmployeesInfo() {
        List<EmployeesInfoModel> allEmployeesInfo = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM employeesInfo");
            while (resultSet.next()) {
                EmployeesInfoModel employeesInfo = new EmployeesInfoModel();
                employeesInfo.setId(resultSet.getInt("id"));
                employeesInfo.setBirthDate(resultSet.getDate("birthDate"));
                employeesInfo.setAddress(resultSet.getString("address"));
                employeesInfo.setPhone(resultSet.getString("phone"));
                allEmployeesInfo.add(employeesInfo);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allEmployeesInfo;
    }
}
