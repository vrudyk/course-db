package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ILandweaponDAO;
import com.solvd.model.LandweaponModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LandweaponDAO extends AbstractDAO implements ILandweaponDAO {
    private static final Logger LOGGER = Logger.getLogger(com.solvd.dao.LandweaponDAO.class);
    private ILandweaponDAO entityDAO;
    private Class<ILandweaponDAO> DAOClass = ILandweaponDAO.class;

    @Override
    public List<LandweaponModel> getAllLandweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<LandweaponModel> entities = entityDAO.getAllLandweapon();
        session.close();
        return entities;
    }

    @Override
    public void addLandweapon(LandweaponModel landweaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addLandweapon(landweaponModel);
        session.commit();
        session.close();
    }

    @Override
    public void updateLandweapon(LandweaponModel landweaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateLandweapon(landweaponModel);
        session.commit();
        session.close();
    }

    public void deleteLandweapon(int idLandweapon) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteLandweapon(idLandweapon);
        session.commit();
        session.close();
    }


    @Override
    public void getAllLandweapons() {
        List<LandweaponModel> allLandweapon = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.landweapon;");
            while (resultSet.next()) {
                LandweaponModel landweapon = new LandweaponModel();
                landweapon.setIdLandweapon(resultSet.getInt("idLandweapon"));
                landweapon.setNameLandweapon(resultSet.getString("namelandweapon"));
                landweapon.setQuantityLandweapon(resultSet.getInt("quantityLandweapon"));
                landweapon.setWeaponIdland(resultSet.getInt("weaponIdland"));
                allLandweapon.add(landweapon);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
    }


    @Override
    public void addLandweapon(int idLandweapon, String nameLandweapon, int quantityLandweapon, int weaponIdland) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addLandweapon(6, "TT", 12, 3);
        session.commit();
        session.close();
    }

    @Override
    public void updateLandweapon(@Param("idLandweapon") int idLandweapon, @Param("nameLandweapon") String nameLandweapon) {

    }

    @Override
    public List<LandweaponModel> getById(int idLandweapon) {

        return null;
    }
}

