package com.solvd.model;

import java.util.Date;

public class EmployeesInfoModel {

    private int id;
    private Date birthDate;
    private String address;
    private String phone;

    public EmployeesInfoModel() {
    }

    public EmployeesInfoModel(int id, Date birthDate, String address, String phone) {
        this.id = id;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "EmployeesInfoModel{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
