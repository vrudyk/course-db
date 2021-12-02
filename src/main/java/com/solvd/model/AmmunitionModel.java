package com.solvd.model;

public class AmmunitionModel {
    private int idAmmunition;
    private String nameAmmunition;
    private int quantityWeapon;


    public int getIdAmmunition() {
        return idAmmunition;
    }

    public void setIdAmmunition(int idAmmunition) {
        this.idAmmunition = idAmmunition;
    }

    public String getNameAmmunition() {
        return nameAmmunition;
    }

    public void setNameAmmunition(String nameAmmunition) {
        this.nameAmmunition = nameAmmunition;
    }

    public int getQuantityWeapon() {
        return quantityWeapon;
    }

    public void setQuantityWeapon(int quantityWeapon) {
        this.quantityWeapon = quantityWeapon;
    }

    @Override
    public String toString() {
        return "AmmunitionModel{" +
                "idAmmunition=" + idAmmunition +
                ", nameAmmunition='" + nameAmmunition + '\'' +
                ", quantityWeapon=" + quantityWeapon +
                '}';
    }
}
