package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.dao.interfaces.IPositionsDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.model.PositionModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionsDAO extends AbstractDAO implements IPositionsDAO {
    private IPositionsDAO entityDAO;
    private Class<IPositionsDAO> DAOClass = IPositionsDAO.class;

    @Override
    public List<PositionModel> getAllPositions() {
        List<PositionModel> allPositions = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM positions");
            while (resultSet.next()) {
                PositionModel position = new PositionModel();
                position.setId(resultSet.getInt("id"));
                position.setName(resultSet.getString("name"));
                allPositions.add(position);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allPositions;
    }

    @Override
    public List<PositionModel> getAllPosition() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<PositionModel> entities = entityDAO.getAllPosition();
        session.close();
        return entities;
    }
}
