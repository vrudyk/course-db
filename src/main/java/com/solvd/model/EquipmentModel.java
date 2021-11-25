package com.solvd.model;

public class EquipmentModel {

    private int id;
    private String name;
    private int amortization;

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

    public int getAmortization() {
        return amortization;
    }

    public void setAmortization(int amortization) {
        this.amortization = amortization;
    }

    @Override
    public String toString() {
        return "EquipmentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amortization=" + amortization +
                '}';
    }
}
