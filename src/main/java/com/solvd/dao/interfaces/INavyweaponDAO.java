package com.solvd.dao.interfaces;

import com.solvd.model.LandweaponModel;
import com.solvd.model.NavyweaponModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface INavyweaponDAO {
    List<NavyweaponModel> getAllNavyweapons();

    void addNavyweapon(NavyweaponModel navyweaponModel);

    void updateNavyweapon(NavyweaponModel navyweaponModel);

    void deleteNavyweapon(int idNavyweapon);

    //* *TestNG
    List<NavyweaponModel> getAllnavyWeapon();

    //*TestNG (methods)
    void addNavyweapon(@Param("idNavyweapon") int idNavyweapon, @Param("nameNavyweapon") String nameNavyweapon, @Param("quantityNavyweapon") int quantityNavyweapon, @Param("weaponIdnavy") int weaponIdnavy);

    void updateNavyweapon(@Param("idNavyweapon") int idNavyweapon, @Param("nameNavyweapon") String nameNavyweapon);

    List<NavyweaponModel> getById(@Param("idNavyweapon") int idNavyweapon);
}

