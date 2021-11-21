package dao;

import configuration.AbstractDAO;
import dao.interfaces.IAmmunitionDAO;
import model.AmmunitionModel;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AmmunitionDAO extends AbstractDAO implements IAmmunitionDAO {
    private static final Logger LOGGER = Logger.getLogger(AmmunitionDAO.class);

    @Override
    public List<AmmunitionModel> getAllAmmunition() {
        List<AmmunitionModel> allAmmunition = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.ammunition\n" +
                    "WHERE quantityWeapon > 20;");
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

    @Override
    public void deleteByid(int id) {
        String deleteByid = "DELETE FROM bloshkoarmy.ammunition WHERE idAmmunition = %s";
        LOGGER.info(id);
    }

}


//        PreparedStatement statement = getСonnection().prepareStatement(String.valueOf(id));
//        statement.setInt(id);
//        int rows = statement.executeUpdate();
//        if (rows>0);
//        LOGGER.info ("User has deleted");











