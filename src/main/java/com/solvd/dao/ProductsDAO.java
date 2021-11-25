package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IProductsDAO;
import com.solvd.model.ProductsModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO extends AbstractDAO implements IProductsDAO {

    @Override
    public List<ProductsModel> getAllProducts() {
        List<ProductsModel> allProducts = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM products");
            while (resultSet.next()) {
                ProductsModel product = new ProductsModel();
                product.setId(resultSet.getInt("id"));
                product.setName(resultSet.getString("name"));
                product.setProductsDetails_id(resultSet.getInt("productsDetails_id"));
                allProducts.add(product);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allProducts;
    }
}
