package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IPositionsDAO;
import com.solvd.model.PositionModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionsDAO extends AbstractDAO implements IPositionsDAO {

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
}
