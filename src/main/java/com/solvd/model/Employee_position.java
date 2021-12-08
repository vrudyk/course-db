package com.solvd.model;

public class Employee_position {

    private int idEmployee;
    private String Employee_position;

    public int getIdEmployee() {
        return idEmployee;
    }

    public String getEmployee_position() {
        return Employee_position;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public void setEmployee_position(String employee_position) {
        Employee_position = employee_position;
    }

    @Override
    public String toString() {
        return "Employee_position{" +
                "idEmployee=" + idEmployee +
                ", Employee_position=" + Employee_position +
                '}';
    }
}
