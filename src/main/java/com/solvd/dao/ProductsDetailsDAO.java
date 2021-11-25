package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IProductsDetailsDAO;
import com.solvd.model.ProductsDetailsModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDetailsDAO extends AbstractDAO implements IProductsDetailsDAO {

    @Override
    public List<ProductsDetailsModel> getAllProductsDetails() {
        List<ProductsDetailsModel> allProductsDetails = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM productsDetails");
            while (resultSet.next()) {
                ProductsDetailsModel productsDetails = new ProductsDetailsModel();
                productsDetails.setId(resultSet.getInt("id"));
                productsDetails.setDescription(resultSet.getString("description"));
                allProductsDetails.add(productsDetails);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allProductsDetails;
    }
}
