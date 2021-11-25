package com.solvd.model;

import java.util.Date;

public class OrdersModel {

    private int id;
    private Date orderDate;
    private int quantity;
    private int price;
    private int equipment_id;
    private int clients_id;
    private int location_id;
    private int employees_id;
    private int products_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(int equipment_id) {
        this.equipment_id = equipment_id;
    }

    public int getClients_id() {
        return clients_id;
    }

    public void setClients_id(int clients_id) {
        this.clients_id = clients_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public int getEmployees_id() {
        return employees_id;
    }

    public void setEmployees_id(int employees_id) {
        this.employees_id = employees_id;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    @Override
    public String toString() {
        return "OrdersModel{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", quantity=" + quantity +
                ", price=" + price +
                ", equipment_id=" + equipment_id +
                ", clients_id=" + clients_id +
                ", location_id=" + location_id +
                ", employees_id=" + employees_id +
                ", products_id=" + products_id +
                '}';
    }
}
