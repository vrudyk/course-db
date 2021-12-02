package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IMilitarybase;
import com.solvd.model.MilitarybaseModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class MilitarybaseDAO extends AbstractDAO implements IMilitarybase {
        private static final Logger LOGGER = Logger.getLogger(com.solvd.dao.AmmunitionDAO.class);

        @Override
        public List<MilitarybaseModel> getAllMilitarybases() {
            List<MilitarybaseModel> allMilitarybases = new ArrayList<>();
            try {
                getResultSet("SELECT * FROM bloshkoarmy.militarybase;");
                while (resultSet.next()) {
                    MilitarybaseModel militarybase = new MilitarybaseModel();
                    militarybase.setIdArmyBase(resultSet.getInt("idAmmunition"));
                    militarybase.setNameBase(resultSet.getString("nameAmmunition"));
                    militarybase.setNumber(resultSet.getInt("quantityWeapon"));
                    militarybase.setLocalAddress(resultSet.getString("nameAmmunition"));
                    allMilitarybases.add(militarybase);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                closeALL();
            }
            return allMilitarybases;
        }

    }



