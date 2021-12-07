package com.solvd.dao.interfaces;

import com.solvd.model.EquipmentModel;

import java.util.List;

public interface IEquipmentDAO {
    List<EquipmentModel> getAllEquipment();

    List<EquipmentModel> getAllEquipments();

    void deleteEquipment(int id);
}
