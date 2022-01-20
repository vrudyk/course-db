package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IScheduleDAO;
import com.solvd.model.Schedule;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ScheduleDAO extends AbstractDAO implements IScheduleDAO {
    private IScheduleDAO entityDAO;
    private Class<IScheduleDAO> DAOClass = IScheduleDAO.class;

    @Override
    public List<Schedule> getAllSchedule() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<Schedule> entities = entityDAO.getAllSchedule();
        session.close();
        return entities;
    }
}