package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IFacultyDAO;
import com.solvd.model.Faculty;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FacultyDAO extends AbstractDAO implements IFacultyDAO {
    private IFacultyDAO entityDAO;
    private Class<IFacultyDAO> DAOClass = IFacultyDAO.class;


    @Override
    public List<Faculty> getAllFaculties() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Faculty> entities = entityDAO.getAllFaculties();
        session.close();
        return entities;
    }
}
