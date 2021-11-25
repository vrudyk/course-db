package com.solvd.model;

public class ProductsModel {

    private int id;
    private String name;
    private int productsDetails_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductsDetails_id() {
        return productsDetails_id;
    }

    public void setProductsDetails_id(int productsDetails_id) {
        this.productsDetails_id = productsDetails_id;
    }

    @Override
    public String toString() {
        return "ProductsModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productsDetails_id=" + productsDetails_id +
                '}';
    }
}
