package com.solvd.dao.interfaces;

import com.solvd.model.OrdersModel;

import java.util.List;

public interface IOrdersDAO {
    List<OrdersModel> getAllOrders();

    List<OrdersModel> getAllOrder();
}
