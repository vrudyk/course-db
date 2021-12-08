package com.solvd.dao.interfaces;

import com.solvd.model.LandweaponModel;
import java.util.List;

public interface ILandweaponDAO {
    List<LandweaponModel> getAllLandweapon();
    void addLandweapon(LandweaponModel landweaponModel);
    void updateLandweapon(LandweaponModel landweaponModel);
    void deleteLandweapon(int idLandweapon);
    List<LandweaponModel> getAllLandweapons();
}
