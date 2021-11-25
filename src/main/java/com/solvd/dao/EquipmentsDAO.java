package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEquipmentDAO;
import com.solvd.model.EquipmentModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipmentsDAO extends AbstractDAO implements IEquipmentDAO {

    @Override
    public List<EquipmentModel> getAllEquipment() {
        List<EquipmentModel> allEquipments = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM equipment");
            while (resultSet.next()) {
                EquipmentModel equipment = new EquipmentModel();
                equipment.setId(resultSet.getInt("id"));
                equipment.setName(resultSet.getString("name"));
                equipment.setAmortization(resultSet.getInt("amortization"));
                allEquipments.add(equipment);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allEquipments;
    }
}
