package com.solvd.dao.interfaces;

import com.solvd.model.LandweaponModel;
import com.solvd.model.NavyweaponModel;
import java.util.List;

public interface INavyweaponDAO {
    List<NavyweaponModel> getAllNavyweapons();
    void addNavyweapon(NavyweaponModel navyweaponModel);
    void updateNavyweapon(NavyweaponModel navyweaponModel);
    void deleteNavyweapon(int idNavyweapon);
    List<NavyweaponModel> getAllnavyWeapons();
}
