package com.solvd.model;

public class AviaweaponModel {
    private int idAviaweapon;
    private String name;
    private int quantity;
    private int weaponIdavia;

    public int getIdAviaweapon() {
        return idAviaweapon;
    }

    public void setIdAviaweapon(int idAviaweapon) {
        this.idAviaweapon = idAviaweapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeaponIdavia() {
        return weaponIdavia;
    }

    public void setWeaponIdavia(int weaponIdavia) {
        this.weaponIdavia = weaponIdavia;
    }

    @Override
    public String toString() {
        return "AviaweaponModel{" +
                "idAviaweapon=" + idAviaweapon +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weaponIdavia=" + weaponIdavia +
                '}';
    }
}
