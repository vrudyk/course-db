package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IWeaponDAO;
import com.solvd.model.WeaponModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WeaponDAO extends AbstractDAO implements IWeaponDAO {
    private static final Logger LOGGER = Logger.getLogger(WeaponDAO.class);
    private IWeaponDAO entityDAO;
    private Class<IWeaponDAO> DAOClass = IWeaponDAO.class;

    @Override
    public List<WeaponModel> getAllweapons() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<WeaponModel> entities = entityDAO.getAllweapons();
        session.close();
        return entities;
    }

    @Override
    public void addWeapon(WeaponModel weaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.addWeapon(weaponModel);
        session.commit();
        session.close();
    }

    @Override
    public void updateWeapon(WeaponModel weaponModel) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.updateWeapon(weaponModel);
        session.commit();
        session.close();
    }

    @Override
    public void deleteWeapon(int idWeapon) {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        entityDAO.deleteWeapon(idWeapon);
        session.commit();
        session.close();
    }


    public List<WeaponModel> getAllWeapons() {
        List<WeaponModel> allWeapon = new ArrayList<>();
        try {
            getResultSet(" SELECT * FROM bloshkoarmy.weapon\n" +
                    "        WHERE name = 'firearm' OR classs = 'longcombat'\n" +
                    "        order by name;");
            while (resultSet.next()) {
                WeaponModel weapon = new WeaponModel();
                weapon.setIdWeapon(resultSet.getInt("idWeapon"));
                weapon.setName(resultSet.getString("name"));
                weapon.setClasss(resultSet.getString("classs"));
                allWeapon.add(weapon);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeALL();
        }
        return allWeapon;

    }

}
