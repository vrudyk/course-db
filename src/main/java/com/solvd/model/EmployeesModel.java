package com.solvd.model;

public class EmployeesModel {
    private int id;
    private String firstName;
    private String secondName;
    private String position;
    private int onlineShopesId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOnlineShopesId() {
        return onlineShopesId;
    }

    public void setOnlineShopesId(int onlineShopesId) {
        this.onlineShopesId = onlineShopesId;
    }

    @Override
    public String toString() {
        return "EmployeesModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", position='" + position + '\'' +
                ", onlineShopesId=" + onlineShopesId +
                '}';
    }
}
