package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ILandweaponDAO;
import com.solvd.model.LandweaponModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class LandweaponDAO extends AbstractDAO implements ILandweaponDAO {
        private static final Logger LOGGER = Logger.getLogger(com.solvd.dao.LandweaponDAO.class);

        @Override
        public List<LandweaponModel> getAllLandweapon() {
            List<LandweaponModel> allLandweapon = new ArrayList<>();
            try {
                getResultSet("SELECT * FROM bloshkoarmy.landweapon;");
                while (resultSet.next()) {
                    LandweaponModel landweapon = new LandweaponModel();
                    landweapon.setIdLandweapon(resultSet.getInt("idLandweapon"));
                    landweapon.setNameLandweapon(resultSet.getString("namelandweapon"));
                    landweapon.setQuantityLandweapon(resultSet.getInt("quantityLandweapon"));
                    landweapon.setWeaponIdland(resultSet.getInt("weaponIdland"));
                    allLandweapon.add(landweapon);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                closeALL();
            }
            return allLandweapon;
        }

    }

