package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IChairDAO;
import com.solvd.model.Chair;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ChairDAO extends AbstractDAO implements IChairDAO {
    private IChairDAO entityDAO;
    private Class<IChairDAO> DAOClass = IChairDAO.class;

    @Override
    public List<Chair> getAllChairs() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Chair> entities = entityDAO.getAllChairs();
        session.close();
        return entities;
    }
}
