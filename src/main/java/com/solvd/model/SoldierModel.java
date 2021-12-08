package com.solvd.model;

public class SoldierModel {

    private int idSoldiers;
    private String firstName;
    private String lastName;
    private int age;
    private String rankk;
    private String gender;
    private int officerShipid;

    public SoldierModel() {
    }

    public int getIdSoldiers() {
        return idSoldiers;
    }

    public void setIdSoldiers(int idSoldiers) {
        this.idSoldiers = idSoldiers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRankk() {
        return rankk;
    }

    public void setRankk(String rankk) {
        this.rankk = rankk;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getOfficerShipid() {
        return officerShipid;
    }

    public void setOfficerShipid(int officerShipid) {
        this.officerShipid = officerShipid;
    }

    @Override
    public String toString() {
        return "SoldierModel{" +
                "idSoldiers=" + idSoldiers +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rankk='" + rankk + '\'' +
                ", gender='" + gender + '\'' +
                ", officerShipid=" + officerShipid +
                '}';
    }
}
