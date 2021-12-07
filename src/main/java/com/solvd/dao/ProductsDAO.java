package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.dao.interfaces.IPositionsDAO;
import com.solvd.dao.interfaces.IProductsDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.model.ProductsModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO extends AbstractDAO implements IProductsDAO {
    private IProductsDAO entityDAO;
    private Class<IProductsDAO> DAOClass = IProductsDAO.class;

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

    @Override
    public List<ProductsModel> getAllProduct() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<ProductsModel> entities = entityDAO.getAllProduct();
        session.close();
        return entities;
    }
}
