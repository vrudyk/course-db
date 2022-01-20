package com.solvd.model;

import com.solvd.util.enums.Acreditation;

import java.util.Objects;

public class UniversityModel {
    private int id;
    private String name;
    private Acreditation acreditation;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Acreditation getAcreditation() {
        return acreditation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcreditation(String acreditation) {
        try {
            switch (acreditation) {
                case "1":
                    this.acreditation = Acreditation.FIRST;
                    break;
                case "2":
                    this.acreditation = Acreditation.SECOND;
                    break;
                case "3":
                    this.acreditation = Acreditation.THIRD;
                    break;
                case "4":
                    this.acreditation = Acreditation.FOURTH;
                    break;
            }
        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityModel)) return false;
        UniversityModel that = (UniversityModel) o;
        return getId() == that.getId() &&
                Objects.equals(getName(), that.getName()) &&
                getAcreditation() == that.getAcreditation();
    }

    @Override
    public String toString() {
        return "UniversityModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", acreditation=" + acreditation.getValue() +
                '}';
    }
}
