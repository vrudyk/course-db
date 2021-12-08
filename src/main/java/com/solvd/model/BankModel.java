package com.solvd.model;

public class BankModel {

    private int idBank;
    private String Name;

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getIdBank() {
        return idBank;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "BankModel{" +
                "idBank=" + idBank +
                ", Name='" + Name + '\'' +
                '}';
    }
}
