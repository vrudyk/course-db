package com.solvd.dao.interfaces;

import com.solvd.model.SoldierModel;
import java.sql.SQLException;
import java.util.List;

public interface ISoldiersDAO {
    List<SoldierModel> getAllSoldiers();
    List<SoldierModel> getAllsoldiers();
    void insertSoldier() throws SQLException;
    void deleteId(int id) throws SQLException;
    void updateName(int id) throws SQLException;

}

