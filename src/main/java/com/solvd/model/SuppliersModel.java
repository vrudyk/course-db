package com.solvd.model;

public class SuppliersModel {
    private int id;
    private String nameOfSuppliers;
    private int onlineShopes_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfSuppliers() {
        return nameOfSuppliers;
    }

    public void setNameOfSuppliers(String nameOfSuppliers) {
        this.nameOfSuppliers = nameOfSuppliers;
    }

    public int getOnlineShopes_id() {
        return onlineShopes_id;
    }

    public void setOnlineShopes_id(int onlineShopes_id) {
        this.onlineShopes_id = onlineShopes_id;
    }

    @Override
    public String toString() {
        return "SuppliersModel{" +
                "id=" + id +
                ", nameOfSuppliers='" + nameOfSuppliers + '\'' +
                ", onlineShopes_id=" + onlineShopes_id +
                '}';
    }
}
