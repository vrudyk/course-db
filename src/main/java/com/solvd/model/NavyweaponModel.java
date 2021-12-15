package com.solvd.model;

public class NavyweaponModel {

    private int idNavyweapon;
    private String nameNavyweapon;
    private int quantityNavyweapon;
    private int weaponIdnavy;

    public NavyweaponModel() {
    }

    public NavyweaponModel(int idNavyweapon, String nameNavyweapon, int quantityNavyweapon, int weaponIdnavy) {
        this.idNavyweapon = idNavyweapon;
        this.nameNavyweapon = nameNavyweapon;
        this.quantityNavyweapon = quantityNavyweapon;
        this.weaponIdnavy = weaponIdnavy;
    }

    public int getIdNavyweapon() {
        return idNavyweapon;
    }

    public void setIdNavyweapon(int idNavyweapon) {
        this.idNavyweapon = idNavyweapon;
    }

    public String getNameNavyweapon() {
        return nameNavyweapon;
    }

    public void setNameNavyweapon(String nameNavyweapon) {
        this.nameNavyweapon = nameNavyweapon;
    }

    public int getQuantityNavyweapon() {
        return quantityNavyweapon;
    }

    public void setQuantityNavyweapon(int quantityNavyweapon) {
        this.quantityNavyweapon = quantityNavyweapon;
    }

    public int getWeaponIdnavy() {
        return weaponIdnavy;
    }

    public void setWeaponIdnavy(int weaponIdnavy) {
        this.weaponIdnavy = weaponIdnavy;
    }

    @Override
    public String toString() {
        return "NavyweaponModel{" +
                "idNavyweapon=" + idNavyweapon +
                ", nameNavyweapon='" + nameNavyweapon + '\'' +
                ", quantityNavyweapon=" + quantityNavyweapon +
                ", weaponIdnavy=" + weaponIdnavy +
                '}';
    }
}
