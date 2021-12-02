package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IAmmunitionDAO;
import com.solvd.model.AmmunitionModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AmmunitionDAO extends AbstractDAO implements IAmmunitionDAO {
    private static final Logger LOGGER = Logger.getLogger(AmmunitionDAO.class);

    @Override
    public List<AmmunitionModel> getAllAmmunition() {
        List<AmmunitionModel> allAmmunition = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.ammunition;");
            while (resultSet.next()) {
                AmmunitionModel ammunition = new AmmunitionModel();
                ammunition.setIdAmmunition(resultSet.getInt("idAmmunition"));
                ammunition.setNameAmmunition(resultSet.getString("nameAmmunition"));
                ammunition.setQuantityWeapon(resultSet.getInt("quantityWeapon"));
                allAmmunition.add(ammunition);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allAmmunition;
    }
}













