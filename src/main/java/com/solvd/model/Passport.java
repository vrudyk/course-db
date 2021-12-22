package com.solvd.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.solvd.util.parsers.handlers.DateHandler;

import java.util.Date;

public class Passport {

    private int passport_number;
    private int identification_Code;
    private int authority;
    private String seria;
    private String sex;
    @JsonDeserialize(using = DateHandler.class)
    private Date date_of_birth;

    public Passport() {}

    public Passport(int passport_number, int identification_Code, int authority, String seria,
                    String sex, Date date_of_birth) {
        this.passport_number = passport_number;
        this.identification_Code = identification_Code;
        this.authority = authority;
        this.seria = seria;
        this.sex = sex;
        this.date_of_birth = date_of_birth;
    }

    public int getPassport_number() {
        return passport_number;
    }

    public int getIdentification_Code() {
        return identification_Code;
    }

    public int getAuthority() {
        return authority;
    }

    public String getSeria() {
        return seria;
    }

    public String getSex() {
        return sex;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setPassport_number(int passport_number) {
        this.passport_number = passport_number;
    }

    public void setIdentification_Code(int identification_Code) {
        this.identification_Code = identification_Code;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passport_number=" + passport_number +
                ", identification_Code=" + identification_Code +
                ", authority=" + authority +
                ", seria='" + seria + '\'' +
                ", sex='" + sex + '\'' +
                ", date_of_birth=" + date_of_birth +
                '}';
    }
}
