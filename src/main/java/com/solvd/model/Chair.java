package com.solvd.model;

public class Chair {
    private int id;
    private String name;
    private int faculty_id;

    public Chair() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFaculty_id() {
        return faculty_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty_id(int faculty_id) {
        this.faculty_id = faculty_id;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty_id=" + faculty_id +
                '}';
    }
}
