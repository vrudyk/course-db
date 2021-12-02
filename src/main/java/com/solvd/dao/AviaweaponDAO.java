package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IAviaweaponDAO;
import com.solvd.model.AviaweaponModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class AviaweaponDAO extends AbstractDAO implements IAviaweaponDAO {
        private static final Logger LOGGER = Logger.getLogger(com.solvd.dao.AviaweaponDAO.class);

        @Override
        public List<AviaweaponModel> getAllAviaweapon() {
            List<AviaweaponModel> allAviaweapon = new ArrayList<>();
            try {
                getResultSet("SELECT * FROM bloshkoarmy.aviaweapon;");
                while (resultSet.next()) {
                    AviaweaponModel aviaweapon = new AviaweaponModel();
                    aviaweapon.setIdAviaweapon(resultSet.getInt("idAviaweapon"));
                    aviaweapon.setName(resultSet.getString("name"));
                    aviaweapon.setQuantity(resultSet.getInt("quantity"));
                    aviaweapon.setWeaponIdavia(resultSet.getInt("weaponIdavia"));
                    allAviaweapon.add(aviaweapon);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                closeALL();
            }
            return allAviaweapon;
        }

    }

