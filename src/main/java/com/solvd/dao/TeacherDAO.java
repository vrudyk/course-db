package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ITeacherDAO;
import com.solvd.model.Teacher;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TeacherDAO extends AbstractDAO implements ITeacherDAO {
    private ITeacherDAO entityDAO;
    private Class<ITeacherDAO> DAOClass = ITeacherDAO.class;

    @Override
    public List<Teacher> getAllTeachers() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Teacher> entities = entityDAO.getAllTeachers();
        session.close();
        return entities;
    }
}