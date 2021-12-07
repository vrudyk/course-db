package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IEmployeesInfoDAO;
import com.solvd.dao.interfaces.IEquipmentDAO;
import com.solvd.model.EmployeesInfoModel;
import com.solvd.model.EquipmentModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipmentsDAO extends AbstractDAO implements IEquipmentDAO {
    private IEquipmentDAO entityDAO;
    private Class<IEquipmentDAO> DAOClass = IEquipmentDAO.class;

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

    @Override
    public List<EquipmentModel> getAllEquipments() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<EquipmentModel> entities = entityDAO.getAllEquipments();
        session.close();
        return entities;
    }

    @Override
    public void deleteEquipment(int id) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteEquipment(id);
        session.commit();
        session.close();
    }
}
