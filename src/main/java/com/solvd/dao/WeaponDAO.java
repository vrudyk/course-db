package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IWeaponDAO;
import com.solvd.model.WeaponModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WeaponDAO extends AbstractDAO implements IWeaponDAO {
    private static final Logger LOGGER = Logger.getLogger(WeaponDAO.class);

    @Override
    public List<WeaponModel> getAllweapons() {
        List<WeaponModel> allWeapon = new ArrayList<>();
        try {
            getResultSet(" SELECT * FROM bloshkoarmy.weapon\n" +
                    "        WHERE name = 'firearm' OR classs = 'longcombat'\n" +
                    "        order by name;");
            while (resultSet.next()) {
                WeaponModel weapon = new WeaponModel();
                weapon.setIdWeapon(resultSet.getInt("idWeapon"));
                weapon.setName(resultSet.getString("name"));
                weapon.setClasss(resultSet.getString("classs"));
                allWeapon.add(weapon);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allWeapon;

    }
}

