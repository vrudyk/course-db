package com.solvd.model;

public class ClientsModel {
    private int id;
    private String firstName;
    private String secondName;
    private String eMail;
    private String numberOfPhone;
    private int onlineShopesId;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public int getOnlineShopesId() {
        return onlineShopesId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public void setOnlineShopesId(int onlineShopesId) {
        this.onlineShopesId = onlineShopesId;
    }

    @Override
    public String toString() {
        return "ClientsModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", onlineShopesId=" + onlineShopesId +
                '}';
    }
}
