package com.solvd.dao.interfaces;

import com.solvd.model.WeaponModel;
import java.util.List;

public interface IWeaponDAO {
    List<WeaponModel> getAllweapons();
    void addWeapon(WeaponModel weaponModel);
    void updateWeapon(WeaponModel weaponModel);
    void deleteWeapon(int idWeapon);
    List<WeaponModel> getAllWeapons();
}


