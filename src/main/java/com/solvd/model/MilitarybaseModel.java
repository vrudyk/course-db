package com.solvd.model;

public class MilitarybaseModel {
    private int idArmyBase;
    private String nameBase;
    private int number;
    private String localAddress;

    public int getIdArmyBase() {
        return idArmyBase;
    }

    public void setIdArmyBase(int idArmyBase) {
        this.idArmyBase = idArmyBase;
    }

    public String getNameBase() {
        return nameBase;
    }

    public void setNameBase(String nameBase) {
        this.nameBase = nameBase;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    @Override
    public String toString() {
        return "MilitarybaseModel{" +
                "idArmyBase=" + idArmyBase +
                ", nameBase='" + nameBase + '\'' +
                ", number=" + number +
                ", localAddress='" + localAddress + '\'' +
                '}';
    }
}
