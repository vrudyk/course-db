package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.dao.interfaces.ILocationsDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.model.LocationModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationsDAO extends AbstractDAO implements ILocationsDAO {
    private ILocationsDAO entityDAO;
    private Class<ILocationsDAO> DAOClass = ILocationsDAO.class;

    @Override
    public List<LocationModel> getAllLocations() {
        List<LocationModel> allLocations = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM location");
            while (resultSet.next()) {
                LocationModel location = new LocationModel();
                location.setId(resultSet.getInt("id"));
                location.setName(resultSet.getString("name"));
                allLocations.add(location);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allLocations;
    }

    @Override
    public List<LocationModel> getAllLocation() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<LocationModel> entities = entityDAO.getAllLocation();
        session.close();
        return entities;
    }
}
