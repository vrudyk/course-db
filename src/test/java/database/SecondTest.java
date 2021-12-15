package database;

import com.solvd.dao.NavyweaponDAO;
import com.solvd.dao.interfaces.INavyweaponDAO;
import com.solvd.model.NavyweaponModel;
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

public class SecondTest extends NavyweaponDAO implements IConstants, INavyweaponDAO {
    private static final Logger LOGGER = Logger.getLogger(FirstTest.class);
    private INavyweaponDAO WeaponDAO;
    private Class<INavyweaponDAO> DAOClass = INavyweaponDAO.class;
    private List<NavyweaponModel> navyweaponDAOList;

    @BeforeMethod
    public void connectionToDatabase() {
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
    public void selectAllNavyWeapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        navyweaponDAOList = WeaponDAO.getAllNavyweapons();
        Assert.assertFalse(navyweaponDAOList.isEmpty(), "Table should be not empty");
        Assert.assertTrue(navyweaponDAOList.size() > 0, "Table should be full with valid data");
        session.close();
        LOGGER.info("Table " + navyweaponDAOList);

    }

    @Test
    public void getById() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        List<NavyweaponModel> navyWeapon1 = WeaponDAO.getById(3);
        Assert.assertFalse(WeaponDAO.getById(3).isEmpty());
        Assert.assertNotNull(navyWeapon1, "Column has not 'null' values");
        Assert.assertEquals("null", "null", "Columns should have 'null' values");
        LOGGER.info(navyWeapon1);
    }

    @Test
    public void addNavyweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        navyweaponDAOList = WeaponDAO.getAllNavyweapons();
        Assert.assertEquals("Total 4", "Total 4", "Total should be " + 4);
        List<NavyweaponModel> navyWeapon1 = WeaponDAO.getById(5);
        LOGGER.info(navyWeapon1);
        Assert.assertTrue(WeaponDAO.getById(5).isEmpty(), "Navy weapon with this id already exist");
        WeaponDAO.addNavyweapon(5, "mina", 7, 2);
        List<NavyweaponModel> navyWeapon2 = WeaponDAO.getById(5);
        LOGGER.info(navyWeapon2);
        navyweaponDAOList = WeaponDAO.getAllNavyweapons();
        LOGGER.info(navyweaponDAOList);
        Assert.assertTrue(true, "New navy weapon is not added");
        Assert.assertEquals("Total 5", "Total 5", "Total should be " + 5);
        session.commit();
        session.close();

    }

    @Test
    public void deleteNavyWeapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        navyweaponDAOList = WeaponDAO.getAllNavyweapons();
        LOGGER.info(navyweaponDAOList);
        WeaponDAO.deleteNavyweapon(5);
        Assert.assertTrue(WeaponDAO.getById(5).isEmpty(), "Navy weapon has successfully deleted");
        navyweaponDAOList = WeaponDAO.getAllNavyweapons();
        Assert.assertEquals("Total 5", "Total 5", "Total should be " + 5);
        Assert.assertEquals("IdLandweapon " + 5 + " is remove ", "IdLandweapon " + 5 + " is remove ", "Deleted id should be " + 5);
        Assert.assertEquals("Total 4", "Total 4", "Total should be " + 4);
        Assert.assertTrue(true, "Total should be less than '1' Land weapon");
        session.commit();
        session.close();
    }

    @Test
    public void updateNavyweapon() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        WeaponDAO = session.getMapper(DAOClass);
        List<NavyweaponModel> navyWeapon1 = WeaponDAO.getById(4);
        LOGGER.info(navyWeapon1);
        Assert.assertFalse(WeaponDAO.getById(4).isEmpty(), "Column should have values");
        Assert.assertNotNull(navyWeapon1, "Column has not NULL values");
        WeaponDAO.updateNavyweapon(4, "explore bomb");
        LOGGER.info(navyWeapon1);
        Assert.assertNotNull(navyWeapon1, "Updated values should be not NULL");
        Assert.assertEquals("explore bomb", "explore bomb", "Navy weapon name should be 'explore bomb'");
        LOGGER.info("Name of navy weapon is updated ");
        session.commit();
        session.close();
    }

    @AfterMethod
    public void closeALL() {
        LOGGER.info("Connection is closed");
    }

}