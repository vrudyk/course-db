package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IOfficershipDAO;
import com.solvd.model.OfficershipModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class OfficershipDAO extends AbstractDAO implements IOfficershipDAO {

        @Override
        public List<OfficershipModel> getAllOfficerships() {
            List<OfficershipModel> allOfficerships = new ArrayList<>();
            try {
                getResultSet("SELECT * FROM bloshkoarmy.officership;");
                while (resultSet.next()) {
                    OfficershipModel officership = new OfficershipModel();
                    officership.setIdOfficership(resultSet.getInt("idOfficerShip"));
                    officership.setFirstName(resultSet.getString("firstName"));
                    officership.setLastName(resultSet.getString("lastName"));
                    officership.setAge(resultSet.getInt("age"));
                    officership.setRankk(resultSet.getString("rankk"));
                    officership.setGender(resultSet.getString("gender"));
                    officership.setMilitaryBaseid(resultSet.getInt("militaryBaseid"));

                    allOfficerships.add(officership);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                closeALL();
            }
            return allOfficerships;

        }
    }
