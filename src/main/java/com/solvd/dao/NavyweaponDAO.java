package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.INavyweaponDAO;
import com.solvd.model.LandweaponModel;
import com.solvd.model.NavyweaponModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NavyweaponDAO extends AbstractDAO implements INavyweaponDAO {
    private static final Logger LOGGER = Logger.getLogger(NavyweaponDAO.class);
    private INavyweaponDAO entityDAO;
    private Class<INavyweaponDAO> DAOClass = INavyweaponDAO.class;

    @Override
    public List<NavyweaponModel> getAllNavyweapons() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<NavyweaponModel> entities = entityDAO.getAllNavyweapons();
        session.close();
        return entities;

    }

    @Override
    public void addNavyweapon(NavyweaponModel navyweaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addNavyweapon(navyweaponModel);
        session.commit();
        session.close();
    }

    @Override
    public void updateNavyweapon(NavyweaponModel navyweaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateNavyweapon(navyweaponModel);
        session.commit();
        session.close();
    }

    public void deleteNavyweapon(int idNavyweapon) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteNavyweapon(idNavyweapon);
        session.commit();
        session.close();
    }

    @Override
    public List<NavyweaponModel> getAllnavyWeapon() {
        List<NavyweaponModel> allNavyweapons = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM bloshkoarmy.navyweapon;");
            while (resultSet.next()) {
                NavyweaponModel navyweapon = new NavyweaponModel();
                navyweapon.setIdNavyweapon(resultSet.getInt("idNavyweapon"));
                navyweapon.setNameNavyweapon(resultSet.getString("nameNavyweapon"));
                navyweapon.setQuantityNavyweapon(resultSet.getInt("quantityNavyweapon"));
                navyweapon.setWeaponIdnavy(resultSet.getInt("weaponIdnavy"));
                allNavyweapons.add(navyweapon);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allNavyweapons;
    }

    @Override
    public void addNavyweapon(int idNavyweapon, String nameNavyweapon, int quantityNavyweapon, int weaponIdnavy) {

    }

    @Override
    public void updateNavyweapon(int idNavyweapon, String nameNavyweapon) {

    }

    @Override
    public List<NavyweaponModel> getById(int idNavyweapon) {
        return null;
    }
}

