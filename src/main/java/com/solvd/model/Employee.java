package com.solvd.model;

public class Employee {

    private int idEmploee;
    private String Name;
    private int age;
    private int Departmens_idDepartmens;
    private int Employee_position_idEmployee;
    private int Salary_idSalary;
    private int Passport_Passport_number;
    private int Passport_Identification_Code;

    public int getIdEmploee() {
        return idEmploee;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getDepartmens_idDepartmens() {
        return Departmens_idDepartmens;
    }

    public int getEmployee_position_idEmployee() {
        return Employee_position_idEmployee;
    }

    public int getSalary_idSalary() {
        return Salary_idSalary;
    }

    public int getPassport_Passport_number() {
        return Passport_Passport_number;
    }

    public int getPassport_Identification_Code() {
        return Passport_Identification_Code;
    }

    public void setIdEmploee(int idEmploee) {
        this.idEmploee = idEmploee;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartmens_idDepartmens(int departmens_idDepartmens) {
        Departmens_idDepartmens = departmens_idDepartmens;
    }

    public void setEmployee_position_idEmployee(int employee_position_idEmployee) {
        Employee_position_idEmployee = employee_position_idEmployee;
    }

    public void setSalary_idSalary(int salary_idSalary) {
        Salary_idSalary = salary_idSalary;
    }

    public void setPassport_Passport_number(int passport_Passport_number) {
        Passport_Passport_number = passport_Passport_number;
    }

    public void setPassport_Identification_Code(int passport_Identification_Code) {
        Passport_Identification_Code = passport_Identification_Code;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmploee=" + idEmploee +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", Departmens_idDepartmens=" + Departmens_idDepartmens +
                ", Employee_position_idEmployee=" + Employee_position_idEmployee +
                ", Salary_idSalary=" + Salary_idSalary +
                ", Passport_Passport_number=" + Passport_Passport_number +
                ", Passport_Identification_Code=" + Passport_Identification_Code +
                '}';
    }
}
