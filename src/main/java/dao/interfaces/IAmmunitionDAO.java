package dao.interfaces;

import model.AmmunitionModel;

import java.sql.SQLException;
import java.util.List;

public interface IAmmunitionDAO {
    List<AmmunitionModel> getAllAmmunition();

    void deleteByid(int id);


}
