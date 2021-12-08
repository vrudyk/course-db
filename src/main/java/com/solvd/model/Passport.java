package com.solvd.model;

import java.util.GregorianCalendar;

public class Passport {

    private int Passport_number;
    private int Identification_Code;
    private int Authority;
    private String Seria;
    private String Sex;
    private GregorianCalendar Date_of_birth;

    public int getPassport_number() {
        return Passport_number;
    }

    public int getIdentification_Code() {
        return Identification_Code;
    }

    public int getAuthority() {
        return Authority;
    }

    public String getSeria() {
        return Seria;
    }

    public String getSex() {
        return Sex;
    }

    public GregorianCalendar getDate_of_birth() {
        return Date_of_birth;
    }

    public void setPassport_number(int passport_number) {
        Passport_number = passport_number;
    }

    public void setIdentification_Code(int identification_Code) {
        Identification_Code = identification_Code;
    }

    public void setAuthority(int authority) {
        Authority = authority;
    }

    public void setSeria(String seria) {
        Seria = seria;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setDate_of_birth(GregorianCalendar date_of_birth) {
        Date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "Passport_number=" + Passport_number +
                ", Identification_Code=" + Identification_Code +
                ", Authority=" + Authority +
                ", Seria='" + Seria + '\'' +
                ", Sex='" + Sex + '\'' +
                ", Date_of_birth=" + Date_of_birth +
                '}';
    }
}
