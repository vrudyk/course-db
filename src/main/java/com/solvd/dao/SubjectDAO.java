package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ISubjectDAO;
import com.solvd.model.Subject;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SubjectDAO extends AbstractDAO implements ISubjectDAO {
    private ISubjectDAO entityDAO;
    private Class<ISubjectDAO> DAOClass = ISubjectDAO.class;

    @Override
    public List<Subject> getAllSubjects() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Subject> entities = entityDAO.getAllSubjects();
        session.close();
        return entities;
    }
}