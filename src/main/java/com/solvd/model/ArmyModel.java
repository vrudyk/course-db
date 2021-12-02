package com.solvd.model;

public class ArmyModel {
    private int idArmy;
    private String nameArmy;
    private String classArmy;
    private int quantityArmy;
    private int militaryBaseidArmybase;

    public ArmyModel(int idArmy, String nameArmy, String classArmy, int quantityArmy, int militaryBaseidArmybase) {
        this.idArmy = idArmy;
        this.nameArmy = nameArmy;
        this.classArmy = classArmy;
        this.quantityArmy = quantityArmy;
        this.militaryBaseidArmybase = militaryBaseidArmybase;
    }

    public ArmyModel() {

    }

    public int getIdArmy() {
        return idArmy;
    }

    public void setIdArmy(int idArmy) {
        this.idArmy = idArmy;
    }

    public String getNameArmy() {
        return nameArmy;
    }

    public void setNameArmy(String nameArmy) {
        this.nameArmy = nameArmy;
    }

    public String getClassArmy() {
        return classArmy;
    }

    public void setClassArmy(String classArmy) {
        this.classArmy = classArmy;
    }

    public int getQuantityArmy() {
        return quantityArmy;
    }

    public void setQuantityArmy(int quantityArmy) {
        this.quantityArmy = quantityArmy;
    }

    public int getMilitaryBaseidArmybase() {
        return militaryBaseidArmybase;
    }

    public void setMilitaryBaseidArmybase(int militaryBaseidArmybase) {
        this.militaryBaseidArmybase = militaryBaseidArmybase;
    }

    @Override
    public String toString() {
        return "ArmyModel{" +
                "idArmy=" + idArmy +
                ", nameArmy='" + nameArmy + '\'' +
                ", classArmy='" + classArmy + '\'' +
                ", quantityArmy=" + quantityArmy +
                ", militaryBaseidArmybase=" + militaryBaseidArmybase +
                '}';
    }
}
