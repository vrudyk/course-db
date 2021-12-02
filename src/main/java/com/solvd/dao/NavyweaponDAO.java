package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.INavyweaponDAO;
import com.solvd.model.NavyweaponModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NavyweaponDAO extends AbstractDAO implements INavyweaponDAO {
    private static final Logger LOGGER = Logger.getLogger(NavyweaponDAO.class);

    @Override
    public List<NavyweaponModel> getAllNavyweapons() {
        List<NavyweaponModel> allNavyweapons = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.navyweapon;");
            while (resultSet.next()) {
                NavyweaponModel navyweapon = new NavyweaponModel();
                navyweapon.setIdNavyweapon(resultSet.getInt("idNavyweapon"));
                navyweapon.setNameNavyweapon(resultSet.getString("nameNavyweapon"));
                navyweapon.setQuantityNavyweapon(resultSet.getInt("quantityNavyweapon"));
                navyweapon.setWeaponIdnavy(resultSet.getInt("weaponIdnavy"));
                allNavyweapons.add(navyweapon);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allNavyweapons;
    }

}

