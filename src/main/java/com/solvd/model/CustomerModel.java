package com.solvd.model;

public class CustomerModel {

    private  int id;
    private String firstName;
    private String lastName;
    private int sudscriptionId;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSudscriptionId() {
        return sudscriptionId;
    }

    public void setSudscriptionId(int sudscriptionId) {
        this.sudscriptionId = sudscriptionId;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sudscriptionId=" + sudscriptionId +
                '}';
    }
}
