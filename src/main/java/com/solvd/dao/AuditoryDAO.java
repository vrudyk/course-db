package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IAuditoryDAO;
import com.solvd.model.Auditory;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AuditoryDAO extends AbstractDAO implements IAuditoryDAO {
    private IAuditoryDAO entityDAO;
    private Class<IAuditoryDAO> DAOClass = IAuditoryDAO.class;

    @Override
    public List<Auditory> getAllAuditories() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Auditory> entities = entityDAO.getAllAuditories();
        session.close();
        return entities;
    }
}
