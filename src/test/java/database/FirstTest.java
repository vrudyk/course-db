package database;

import com.solvd.dao.LandweaponDAO;
import com.solvd.model.LandweaponModel;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class FirstTest {
    private static final Logger LOGGER = Logger.getLogger(FirstTest.class);
    LandweaponDAO landweaponDAO = new LandweaponDAO();
    LandweaponModel landweaponModel = new LandweaponModel();

    @BeforeMethod
    public void connectToDatabase() {
        LOGGER.info("BeforeMethod");
    }

    @Test
    public void selectAlllandweapon() {
        List<LandweaponModel> weaponList = landweaponDAO.getAllLandweapon();
        Assert.assertFalse(weaponList.isEmpty(), "Table should be not empty");
        LOGGER.info("Table " + weaponList);
        weaponList.stream().filter(x -> x.getIdLandweapon() == 2).forEach(LOGGER::info);
    }

    @Test
    public void addLandweapon() {
        List<LandweaponModel> weaponList = landweaponDAO.getAllLandweapon();
        LOGGER.info(weaponList);
        landweaponModel.setIdLandweapon(5);
        landweaponModel.setNameLandweapon("rocket space");
        landweaponModel.setQuantityLandweapon(10);
        landweaponModel.setWeaponIdland(2);
        landweaponDAO.addLandweapon(landweaponModel);
        LOGGER.info(landweaponModel);
        Assert.assertEquals(landweaponDAO.getAllLandweapon().size(), 5, "Size is incorrect");
        weaponList.stream().filter(x -> x.getIdLandweapon() == 5).forEach(LOGGER::info);
    }

    @Test
    public void deleteLandweapons() {
        landweaponDAO.getAllLandweapon();
        Assert.assertEquals(landweaponDAO.getAllLandweapon().size(), 5, "Navy weapon is already deleted");
        landweaponDAO.deleteLandweapon(5);
        Assert.assertEquals(landweaponDAO.getAllLandweapon().size(), 4, " Size is incorrect");
        LOGGER.info(landweaponModel);
    }

    @Test
    public void updateLandweapon() {
        landweaponDAO.getAllLandweapon().stream().filter(x -> x.getIdLandweapon() == 4).forEach(LOGGER::info);
        landweaponModel.setIdLandweapon(4);
        landweaponModel.setNameLandweapon("balistic rocket");
        landweaponDAO.updateLandweapon(landweaponModel);
        LOGGER.info(landweaponModel);
        Assert.assertTrue(landweaponModel.getNameLandweapon().contains("balistic rocket") && landweaponModel.getIdLandweapon() == 4, "Id or name of Navy weapon is incorrect");
        landweaponDAO.getAllLandweapon().stream().filter(x -> x.getIdLandweapon() == 4).forEach(LOGGER::info);
    }

    @AfterMethod
    public void closeALL() {
        LOGGER.info("AfterMethod");
    }

}