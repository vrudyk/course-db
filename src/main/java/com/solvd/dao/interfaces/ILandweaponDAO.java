package com.solvd.dao.interfaces;

import com.solvd.model.LandweaponModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ILandweaponDAO {
    List<LandweaponModel> getAllLandweapon();

    void addLandweapon(LandweaponModel landweaponModel);

    void updateLandweapon(LandweaponModel landweaponModel);

    void deleteLandweapon(int idLandweapon);

    //* *TestNG
    void getAllLandweapons();

    //*TestNG (methods)
    void addLandweapon(@Param("idLandweapon") int idLandweapon, @Param("nameLandweapon") String nameLandweapon, @Param("quantityLandweapon") int quantityLandweapon, @Param("weaponIdland") int weaponIdland);

    void updateLandweapon(@Param("idLandweapon") int idLandweapon, @Param("nameLandweapon") String nameLandweapon);

    List<LandweaponModel> getById(@Param("idLandweapon") int idLandweapon);

}
