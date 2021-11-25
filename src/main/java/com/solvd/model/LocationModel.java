package com.solvd.model;

public class LocationModel {

    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "LocationModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
