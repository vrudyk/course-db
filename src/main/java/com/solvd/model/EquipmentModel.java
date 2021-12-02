package com.solvd.model;

public class EquipmentModel {

    private int id;
    private String name;
    private int amortization;

    public EquipmentModel() {
    }

    public EquipmentModel(int id, String name, int amortization) {
        this.id = id;
        this.name = name;
        this.amortization = amortization;
    }

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
