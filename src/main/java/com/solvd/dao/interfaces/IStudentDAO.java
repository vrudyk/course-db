package com.solvd.dao.interfaces;

import com.solvd.model.Student;

import java.util.List;

public interface IStudentDAO {

    List<Student> getAllStudents();

    void deleteStudent(int id);

    void insertIntoStudent(Student student);

    void updateStudent(Student student);
}
