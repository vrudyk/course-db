package dao;

import configuration.AbstractDAO;
import dao.interfaces.ISoldiersDAO;
import model.SoldierModel;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SoldiersDAO extends AbstractDAO implements ISoldiersDAO {

    @Override
    public List<SoldierModel> getAllSoldiers() {
        List<SoldierModel> allSoldiers = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.soldiers WHERE idSoldiers IN (2,4,6)");
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

}

