package com.solvd.model;

public class MilitaryequipmentModel {
    private int idMilitaryequipment;
    private String nameEquipment;
    private int quantityEquipment;
    private String classEquipment;
    private int armyIdarmy;

    public int getIdMilitaryequipment() {
        return idMilitaryequipment;
    }

    public void setIdMilitaryequipment(int idMilitaryequipment) {
        this.idMilitaryequipment = idMilitaryequipment;
    }

    public String getNameEquipment() {
        return nameEquipment;
    }

    public void setNameEquipment(String nameEquipment) {
        this.nameEquipment = nameEquipment;
    }

    public int getQuantityEquipment() {
        return quantityEquipment;
    }

    public void setQuantityEquipment(int quantityEquipment) {
        this.quantityEquipment = quantityEquipment;
    }

    public String getClassEquipment() {
        return classEquipment;
    }

    public void setClassEquipment(String classEquipment) {
        this.classEquipment = classEquipment;
    }

    public int getArmyIdarmy() {
        return armyIdarmy;
    }

    public void setArmyIdarmy(int armyIdarmy) {
        this.armyIdarmy = armyIdarmy;
    }

    @Override
    public String toString() {
        return "MilitaryequipmentModel{" +
                "idMilitaryequipment=" + idMilitaryequipment +
                ", nameEquipment='" + nameEquipment + '\'' +
                ", quantityEquipment=" + quantityEquipment +
                ", classEquipment='" + classEquipment + '\'' +
                ", armyIdarmy=" + armyIdarmy +
                '}';
    }
}
