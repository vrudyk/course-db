package com.solvd.dao.interfaces;

import com.solvd.model.EmployeeModel;

import java.util.List;

public interface IEmployeesDAO {
    List<EmployeeModel> getAllEmployees();

    List<EmployeeModel> getAllEmployee();

    void addEmployees(EmployeeModel employeeModel);

    void updateEmployees(EmployeeModel employeeModel);

}
