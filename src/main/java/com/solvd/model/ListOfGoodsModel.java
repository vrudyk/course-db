package com.solvd.model;

public class ListOfGoodsModel {
    private int idThing;
    private String nameOfThing;
    private int price;
    private int inStock;
    private String warranty;
    private int onlineShopes_id;

    public int getIdThing() {
        return idThing;
    }

    public void setIdThing(int idThing) {
        this.idThing = idThing;
    }

    public String getNameOfThing() {
        return nameOfThing;
    }

    public void setNameOfThing(String nameOfThing) {
        this.nameOfThing = nameOfThing;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public int getOnlineShopes_id() {
        return onlineShopes_id;
    }

    public void setOnlineShopes_id(int onlineShopes_id) {
        this.onlineShopes_id = onlineShopes_id;
    }

    @Override
    public String toString() {
        return "ListOfGoodsModel{" +
                "idThing=" + idThing +
                ", nameOfThing='" + nameOfThing + '\'' +
                ", price=" + price +
                ", inStock=" + inStock +
                ", warranty='" + warranty + '\'' +
                ", onlineShopes_id=" + onlineShopes_id +
                '}';
    }
}
