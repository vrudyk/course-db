package com.solvd.model;

public class Salary {

    private int idSalary;
    private int Salary;

    public int getIdSalary() {
        return idSalary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setIdSalary(int idSalary) {
        this.idSalary = idSalary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "idSalary=" + idSalary +
                ", Salary=" + Salary +
                '}';
    }
}
