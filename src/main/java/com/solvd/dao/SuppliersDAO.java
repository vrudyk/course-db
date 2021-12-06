package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ISuppliersDAO;
import com.solvd.model.OnlineShopesModel;
import com.solvd.model.SuppliersModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuppliersDAO extends AbstractDAO implements ISuppliersDAO {
    @Override
    public List<SuppliersModel> getAllSuppliers() {
        List<SuppliersModel> allSuppliers = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM suppliers");
            while(resultSet.next()){
                SuppliersModel suppliersModel = new SuppliersModel();
                suppliersModel.setId(resultSet.getInt("id"));
                suppliersModel.setNameOfSuppliers(resultSet.getString("NameOfSuppliers"));
                suppliersModel.setOnlineShopes_id(resultSet.getInt("OnlineShopes_id"));
                allSuppliers.add(suppliersModel);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allSuppliers;
    }
}
