package com.solvd.model;

public class PassportModel {

    private int id;
    private String seria;
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "PassportModel{" +
                "id=" + id +
                ", seria='" + seria + '\'' +
                ", code=" + code +
                '}';
    }
}
