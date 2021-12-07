package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.dao.interfaces.IOrdersDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.model.OrdersModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersDAO extends AbstractDAO implements IOrdersDAO {
    private IOrdersDAO entityDAO;
    private Class<IOrdersDAO> DAOClass = IOrdersDAO.class;

    @Override
    public List<OrdersModel> getAllOrders() {
        List<OrdersModel> allOrders = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM orders");
            while (resultSet.next()) {
                OrdersModel order = new OrdersModel();
                order.setId(resultSet.getInt("id"));
                order.setOrderDate(resultSet.getDate("orderDate"));
                order.setQuantity(resultSet.getInt("quantity"));
                order.setPrice(resultSet.getInt("price"));
                order.setEquipment_id(resultSet.getInt("equipment_id"));
                order.setClients_id(resultSet.getInt("clients_id"));
                order.setLocation_id(resultSet.getInt("location_id"));
                order.setEmployees_id(resultSet.getInt("employees_id"));
                order.setProducts_id(resultSet.getInt("products_id"));
                allOrders.add(order);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allOrders;
    }

    @Override
    public List<OrdersModel> getAllOrder() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<OrdersModel> entities = entityDAO.getAllOrder();
        session.close();
        return entities;
    }
}
