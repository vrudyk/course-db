package database;

import com.solvd.dao.LandweaponDAO;
import com.solvd.dao.interfaces.ILandweaponDAO;
import com.solvd.model.LandweaponModel;
import com.solvd.util.IConstants;
import com.solvd.util.OpenSession;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class FirstTest extends LandweaponDAO implements IConstants, ILandweaponDAO {
    private static final Logger LOGGER = Logger.getLogger(FirstTest.class);
    private ILandweaponDAO WeaponDAO;
    private Class<ILandweaponDAO> DAOClass = ILandweaponDAO.class;
    private List<LandweaponModel> modelWeapon;

    @BeforeMethod
    public void connectToDatabase() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            LOGGER.info("BeforeMethod");
            LOGGER.info("Connection is successful");
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.info("Connection is failed");
        }
    }

    @Test
    public void selectAlllandweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        modelWeapon = WeaponDAO.getAllLandweapon();
        Assert.assertFalse(modelWeapon.isEmpty(), "Table should be not empty");
        Assert.assertTrue(modelWeapon.size() > 0, "Table should be full with valid data");
        session.close();
        LOGGER.info("Table " + modelWeapon);
    }

    @Test
    public void getById() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        List<LandweaponModel> modelWeapon2 = WeaponDAO.getById(3);
        Assert.assertFalse(WeaponDAO.getById(3).isEmpty());
        Assert.assertNotNull(modelWeapon2, "Column has not 'null' values");
        Assert.assertEquals("null", "null", "Columns should have 'null' values");
        LOGGER.info(modelWeapon2);
    }

    @Test
    public void addLandweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        modelWeapon = WeaponDAO.getAllLandweapon();
        Assert.assertEquals("Total 6", "Total 6", "Total should be " + 6);
        List<LandweaponModel> modelWeapon3 = WeaponDAO.getById(7);
        LOGGER.info(modelWeapon3);
        Assert.assertTrue(WeaponDAO.getById(7).isEmpty(), "Land weapon with this id already exist");
        WeaponDAO.addLandweapon(7, "AKM-49", 7, 4);
        List<LandweaponModel> modelWeapon4 = WeaponDAO.getById(7);
        LOGGER.info(modelWeapon4);
        modelWeapon = WeaponDAO.getAllLandweapon();
        LOGGER.info(modelWeapon);
        Assert.assertTrue(true, "New land weapon is not added");
        Assert.assertEquals("Total 7", "Total 7", "Total should be " + 7);
        session.commit();
        session.close();
    }

    @Test
    public void deleteLandweapons() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        modelWeapon = WeaponDAO.getAllLandweapon();
        LOGGER.info(modelWeapon);
        WeaponDAO.deleteLandweapon(7);
        Assert.assertTrue(WeaponDAO.getById(7).isEmpty(), "Land weapon has successfully deleted");
        modelWeapon = WeaponDAO.getAllLandweapon();
        Assert.assertEquals("Total 6", "Total 6", "Total should be " + 6);
        Assert.assertEquals("IdLandweapon " + 7 + " is remove ", "IdLandweapon " + 7 + " is remove ", "Deleted id should be " + 7);
        Assert.assertTrue(true, "Total should be less than '1' Land weapon");
        session.commit();
        session.close();
    }

    @Test
    public void updateLandweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        List<LandweaponModel> modelWeapon1 = WeaponDAO.getById(3);
        LOGGER.info(modelWeapon1);
        Assert.assertFalse(WeaponDAO.getById(3).isEmpty(), "Column should have values");
        Assert.assertNotNull(modelWeapon1, "Column has not NULL values");
        WeaponDAO.updateLandweapon(3, "toxic GAS");
        LOGGER.info(modelWeapon1);
        Assert.assertNotNull(modelWeapon1, "Updated values should be not NULL");
        Assert.assertEquals("toxic GAS", "toxic GAS", "Land weapon name should be 'toxic GAS'");
        LOGGER.info("Name of land weapon is updated ");
        session.commit();
        session.close();

    }

    @AfterMethod
    public void closeALL() {
        LOGGER.info("Connection is closed");
    }

}