package com.solvd.dao.interfaces;

import com.solvd.model.EmployeesModel;

import java.util.List;

public interface IEmployeesDAO {
    public List<EmployeesModel> getAllEmployees();

    public List<EmployeesModel> getAllEmployeesMyBatis();
}
