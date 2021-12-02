package com.solvd.model;


public class EmployeeModel {

    private int id;
    private String fName;
    private String lName;
    private String salary;
    private int positions_id;
    private int passport_id;
    private int employeesInfo_id;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String fName, String lName, String salary,
                         int positions_id, int passport_id, int employeesInfo_id) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.positions_id = positions_id;
        this.passport_id = passport_id;
        this.employeesInfo_id = employeesInfo_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getPositions_id() {
        return positions_id;
    }

    public void setPositions_id(int positions_id) {
        this.positions_id = positions_id;
    }

    public int getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(int passport_id) {
        this.passport_id = passport_id;
    }

    public int getEmployeesInfo_id() {
        return employeesInfo_id;
    }

    public void setEmployeesInfo_id(int employeesInfo_id) {
        this.employeesInfo_id = employeesInfo_id;
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary='" + salary + '\'' +
                ", positions_id=" + positions_id +
                ", passport_id=" + passport_id +
                ", employeesInfo_id=" + employeesInfo_id +
                '}';
    }
}
