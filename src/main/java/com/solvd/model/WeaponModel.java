package com.solvd.model;

public class WeaponModel {
    private int idWeapon;
    private String name;
    private String classs;

    public int getIdWeapon() {
        return idWeapon;
    }

    public void setIdWeapon(int idWeapon) {
        this.idWeapon = idWeapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "WeaponModel{" +
                "idWeapon=" + idWeapon +
                ", name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                '}';
    }
}
