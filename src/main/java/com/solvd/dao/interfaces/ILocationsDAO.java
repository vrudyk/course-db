package com.solvd.dao.interfaces;

import com.solvd.model.LocationModel;

import java.util.List;

public interface ILocationsDAO {
    List<LocationModel> getAllLocations();

    List<LocationModel> getAllLocation();
}
