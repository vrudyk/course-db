package com.solvd.dao.interfaces;

import com.solvd.model.PositionModel;

import java.util.List;

public interface IPositionsDAO {
    List<PositionModel> getAllPositions();

    List<PositionModel> getAllPosition();
}
