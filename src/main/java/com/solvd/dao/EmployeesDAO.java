package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.model.EmployeeModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO extends AbstractDAO implements IEmployeesDAO {

    @Override
    public List<EmployeeModel> getAllEmployees() {
        List<EmployeeModel> allEmployees = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM employees");
            while (resultSet.next()) {
                EmployeeModel employee = new EmployeeModel();
                employee.setId(resultSet.getInt("id"));
                employee.setfName(resultSet.getString("fName"));
                employee.setlName(resultSet.getString("lName"));
                employee.setSalary(resultSet.getString("salary"));
                employee.setPositions_id(resultSet.getInt("positions_id"));
                employee.setPassport_id(resultSet.getInt("passport_id"));
                employee.setEmployeesInfo_id(resultSet.getInt("employeesInfo_id"));
                allEmployees.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allEmployees;
    }
}
