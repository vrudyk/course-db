package com.solvd.model;

public class LandweaponModel {
    private int idLandweapon;
    private String nameLandweapon;
    private int quantityLandweapon;
    private int weaponIdland;

    public LandweaponModel() {
    }

    public LandweaponModel(int idLandweapon, String nameLandweapon, int quantityLandweapon, int weaponIdland) {
        this.idLandweapon = idLandweapon;
        this.nameLandweapon = nameLandweapon;
        this.quantityLandweapon = quantityLandweapon;
        this.weaponIdland = weaponIdland;
    }

    public int getIdLandweapon() {
        return idLandweapon;
    }

    public void setIdLandweapon(int idLandweapon) {
        this.idLandweapon = idLandweapon;
    }

    public String getNameLandweapon() {
        return nameLandweapon;
    }

    public void setNameLandweapon(String nameLandweapon) {
        this.nameLandweapon = nameLandweapon;
    }

    public int getQuantityLandweapon() {
        return quantityLandweapon;
    }

    public void setQuantityLandweapon(int quantityLandweapon) {
        this.quantityLandweapon = quantityLandweapon;
    }

    public int getWeaponIdland() {
        return weaponIdland;
    }

    public void setWeaponIdland(int weaponIdland) {
        this.weaponIdland = weaponIdland;
    }

    @Override
    public String toString() {
        return "LandweaponModel{" +
                "idLandweapon=" + idLandweapon +
                ", nameLandweapon='" + nameLandweapon + '\'' +
                ", quantityLandweapon=" + quantityLandweapon +
                ", weaponIdland=" + weaponIdland +
                '}';
    }
}
