package database;

import com.solvd.dao.NavyweaponDAO;
import com.solvd.model.NavyweaponModel;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class SecondTest {
    private static final Logger LOGGER = Logger.getLogger(FirstTest.class);
    NavyweaponDAO navyweaponDAO = new NavyweaponDAO();
    NavyweaponModel navyweaponModel = new NavyweaponModel();

    @BeforeMethod
    public void connectionToDatabase() {
        LOGGER.info("BeforeMethod");
    }

    @Test
    public void selectAllNavyWeapon() {
        List<NavyweaponModel> navyweaponModelList = navyweaponDAO.getAllNavyweapons();
        Assert.assertFalse(navyweaponModelList.isEmpty(), "Table should be not empty");
        LOGGER.info("Table " + navyweaponModelList);
        navyweaponModelList.stream().filter(x -> x.getIdNavyweapon() == 2).forEach(LOGGER::info);
    }

    @Test
    public void addNavyweapon() {
        List<NavyweaponModel> navyweaponModelList = navyweaponDAO.getAllNavyweapons();
        LOGGER.info(navyweaponModelList);
        navyweaponModel.setIdNavyweapon(5);
        navyweaponModel.setNameNavyweapon("space ship");
        navyweaponModel.setQuantityNavyweapon(12);
        navyweaponModel.setWeaponIdnavy(2);
        navyweaponDAO.addNavyweapon(navyweaponModel);
        LOGGER.info(navyweaponModel);
        Assert.assertEquals(navyweaponDAO.getAllNavyweapons().size(), 5, "Size is incorrect");
        navyweaponModelList.stream().filter(x -> x.getIdNavyweapon() == 5).forEach(LOGGER::info);
    }

    @Test
    public void deleteNavyWeapon() {
        navyweaponDAO.getAllNavyweapons();
        Assert.assertEquals(navyweaponDAO.getAllNavyweapons().size(), 5, "Navy weapon is already deleted");
        navyweaponDAO.deleteNavyweapon(5);
        Assert.assertEquals(navyweaponDAO.getAllNavyweapons().size(), 4, " Size is incorrect");
        LOGGER.info(navyweaponModel);
    }

    @Test
    public void updateNavyweapon() {
        navyweaponDAO.getAllNavyweapons().stream().filter(x -> x.getIdNavyweapon() == 4).forEach(LOGGER::info);
        // Assert.assertFalse(navyweaponModel.getIdNavyweapon()==6, "Id already exist");
        navyweaponModel.setIdNavyweapon(4);
        navyweaponModel.setNameNavyweapon("cross weapon");
        navyweaponDAO.updateNavyweapon(navyweaponModel);
        LOGGER.info(navyweaponModel);
        Assert.assertTrue(navyweaponModel.getNameNavyweapon().contains("cross weapon") && navyweaponModel.getIdNavyweapon() == 4, "Id or name of Navy weapon is incorrect");
        navyweaponDAO.getAllNavyweapons().stream().filter(x -> x.getIdNavyweapon() == 4).forEach(LOGGER::info);
    }

    @AfterMethod
    public void closeALL() {
        LOGGER.info("Connection is closed");
    }

}