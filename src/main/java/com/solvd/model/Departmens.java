package com.solvd.model;

public class Departmens {

    private int idDepartmens;
    private int Bank_idBank;
    private String Name_Departmen;

    public int getIdDepartmens() {
        return idDepartmens;
    }

    public int getBank_idBank() {
        return Bank_idBank;
    }

    public String getName_Departmen() {
        return Name_Departmen;
    }

    public void setIdDepartmens(int idDepartmens) {
        this.idDepartmens = idDepartmens;
    }

    public void setBank_idBank(int bank_idBank) {
        Bank_idBank = bank_idBank;
    }

    public void setName_Departmen(String name_Departmen) {
        Name_Departmen = name_Departmen;
    }

    @Override
    public String toString() {
        return "Departmens{" +
                "idDepartmens=" + idDepartmens +
                ", Bank_idBank=" + Bank_idBank +
                ", Name_Departmen='" + Name_Departmen + '\'' +
                '}';
    }
}
