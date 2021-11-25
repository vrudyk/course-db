package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ILocationsDAO;
import com.solvd.model.LocationModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LocationsDAO extends AbstractDAO implements ILocationsDAO {

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
}
