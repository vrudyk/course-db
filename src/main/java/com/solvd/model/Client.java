package com.solvd.model;

public class Client {

   private int idClient;
   private String Name;
   private int Age;
   private int Passport_Passport_number;
   private int Passport_Identification_Code;

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPassport_Passport_number(int passport_Passport_number) {
        Passport_Passport_number = passport_Passport_number;
    }

    public void setPassport_Identification_Code(int passport_Identification_Code) {
        Passport_Identification_Code = passport_Identification_Code;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getPassport_Passport_number() {
        return Passport_Passport_number;
    }

    public int getPassport_Identification_Code() {
        return Passport_Identification_Code;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Passport_Passport_number=" + Passport_Passport_number +
                ", Passport_Identification_Code=" + Passport_Identification_Code +
                '}';
    }
}
