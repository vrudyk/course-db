package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IArmyDAO;
import com.solvd.model.ArmyModel;
import org.apache.log4j.Logger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArmyDAO extends AbstractDAO implements IArmyDAO {
    private static final Logger LOGGER = Logger.getLogger(ArmyDAO.class);


    @Override
    public List<ArmyModel> getAllArmy() {
        List<ArmyModel> allArmy = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.army;");
            while (resultSet.next()) {
                ArmyModel army = new ArmyModel();
                army.setIdArmy(resultSet.getInt("idArmy"));
                army.setClassArmy(resultSet.getString("classArmy"));
                army.setQuantityArmy(resultSet.getInt("quantityArmy"));
                army.setMilitaryBaseidArmybase(resultSet.getInt("militaryBaseidArmybase"));
                allArmy.add(army);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allArmy;
    }

}


