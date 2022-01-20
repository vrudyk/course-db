package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IStudentDAO;
import com.solvd.model.Student;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDAO extends AbstractDAO implements IStudentDAO {
    private IStudentDAO entityDAO;
    private Class<IStudentDAO> DAOClass = IStudentDAO.class;
    
    @Override
    public List<Student> getAllStudents() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Student> entities = entityDAO.getAllStudents();
        session.close();
        return entities;
    }

    @Override
    public void deleteStudent(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteStudent(id);
        session.commit();
        session.close();
    }

    @Override
    public void insertIntoStudent(Student student) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoStudent(student);
        session.commit();
        session.close();
    }

    @Override
    public void updateStudent(Student student) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateStudent(student);
        session.commit();
        session.close();
    }
}
