package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IGradeBookDAO;
import com.solvd.model.GradeBook;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GradeBookDAO extends AbstractDAO implements IGradeBookDAO {
    private IGradeBookDAO entityDAO;
    private Class<IGradeBookDAO> DAOClass = IGradeBookDAO.class;


    @Override
    public List<GradeBook> getAllGradeBooks() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<GradeBook> entities = entityDAO.getAllGradeBooks();
        session.close();
        return entities;
    }
}
