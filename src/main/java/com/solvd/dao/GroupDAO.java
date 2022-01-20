package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IGroupDAO;
import com.solvd.model.Group;
import com.solvd.util.OpenSession;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class GroupDAO extends AbstractDAO implements IGroupDAO {
    private IGroupDAO entityDAO;
    private Class<IGroupDAO> DAOClass = IGroupDAO.class;

    @Override
    public List<Group> getAllGroups() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Group> entities = entityDAO.getAllGroups();
        session.close();
        return entities;
    }

    @Override
    public void deleteGroup(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);

        session.commit();entityDAO.deleteGroup(id);
        session.close();
    }

    @Override
    public void insertIntoGroup(Group group) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.insertIntoGroup(group);
        session.commit();
        session.close();
    }

    @Override
    public void updateGroup(Group group) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateGroup(group);
        session.commit();
        session.close();
    }

}
