package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IClientsDAO;
import com.solvd.dao.interfaces.IEmployeesInfoDAO;
import com.solvd.model.ClientModel;
import com.solvd.model.EmployeesInfoModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesInfoDAO extends AbstractDAO implements IEmployeesInfoDAO {
    private IEmployeesInfoDAO entityDAO;
    private Class<IEmployeesInfoDAO> DAOClass = IEmployeesInfoDAO.class;

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

    @Override
    public List<EmployeesInfoModel> getAllEmployeeInfo() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<EmployeesInfoModel> entities = entityDAO.getAllEmployeeInfo();
        session.close();
        return entities;
    }
}
