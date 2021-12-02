package com.solvd.dao;

import com.solvd.Main;
import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ISoldiersDAO;
import com.solvd.model.SoldierModel;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SoldiersDAO extends AbstractDAO implements ISoldiersDAO {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    @Override
    public List<SoldierModel> getAllSoldiers() {
        List<SoldierModel> allSoldiers = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.soldiers;");
            while (resultSet.next()) {
                SoldierModel soldier = new SoldierModel();
                soldier.setIdSoldiers(resultSet.getInt("idSoldiers"));
                soldier.setFirstName(resultSet.getString("firstName"));
                soldier.setLastName(resultSet.getString("lastName"));
                soldier.setAge(resultSet.getInt("age"));
                soldier.setRankk(resultSet.getString("rankk"));
                soldier.setGender(resultSet.getString("gender"));

                allSoldiers.add(soldier);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allSoldiers;
    }

    @Override
    public void insertSoldier()  {
        try {
            getResult("INSERT INTO bloshkoarmy.soldiers (idSoldiers, firstName, lastName, age, rankk, gender, officerShipid)"
                    + " VALUES (3, 'Antonio', 'Banderas', 18, 'senior soldier', 'male', 4)");
            //LOGGER.info("Soldier has successfully created");
        }
         catch(SQLException throwables){
            throwables.printStackTrace();
        } finally{
            closeALL();
        }

    }
    public void deleteId(int id) {
        try {
            getResult("DELETE FROM bloshkoarmy.soldiers WHERE idSoldiers = 23;");
            //LOGGER.info("Soldier with id "+ id +  " has successfully deleted");
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        } finally{
            closeALL();
        }

    }

    public void updateName(int id) {
        try {
            getResult("UPDATE bloshkoarmy.soldiers"  + " SET firstName ='Taras' WHERE idSoldiers = 5;");
        //LOGGER.info("Soldier with id "+ id +  " has successfully updated");
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        } finally{
            closeALL();
        }

    }
}





