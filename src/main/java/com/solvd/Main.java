package com.solvd;

import com.solvd.dao.*;
import com.solvd.model.*;
import com.solvd.util.Domxml;
import com.solvd.util.Requestdate;
import com.solvd.util.Soldiers;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import static com.solvd.model.OfficershipModel.*;
import static com.solvd.util.Requestdate.parseDateFormat;
import static com.solvd.util.Soldiers.arrayParse;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException, IOException, ParseException, ParserConfigurationException, SAXException {
        //*Select all (SQL) & operators(Insert, Update, Delete);
        AmmunitionDAO ammunitionDAO = new AmmunitionDAO();
        ammunitionDAO.getAllAmmunitions().forEach(LOGGER::info);

        WeaponDAO weaponDAO = new WeaponDAO();
        weaponDAO.getAllWeapons().forEach(LOGGER::info);

        MilitaryequipmentDAO militaryequipmentDAO = new MilitaryequipmentDAO();
        militaryequipmentDAO.getAllmilitaryEquipments().forEach(LOGGER::info);

        OfficershipDAO officershipDAO = new OfficershipDAO();
        officershipDAO.getAllOfficers().forEach(LOGGER::info);

        SoldiersDAO soldiersDAO = new SoldiersDAO();
        soldiersDAO.getAllsoldiers().forEach(LOGGER::info);
        soldiersDAO.insertSoldier();
        soldiersDAO.updateName(5);
        soldiersDAO.deleteId(23);

        //*Jaxb parse Xml;
        OfficershipModel officership = new OfficershipModel(1, "John", "Bang", 32, "soldier", "male", 2);
        jaxbParser(officership);

        // *Parser Json;
        parseJsonTowrite(officership);
        parseJsonNode(officership);
        parseArrayJasonRead(officership);
        Soldiers soldiers = new Soldiers();
        arrayParse(soldiers);

        // *Parse Json Date format;
        Requestdate request = new Requestdate();
        parseDateFormat(request);

        Domxml domxml = new Domxml();
        domxml.parseSoldiersXML();
        List<OfficershipModel> officershipModels = new OfficershipDAO().getAllOfficerships();
        LOGGER.info(officershipModels);
        List<ArmyModel> armyModelList = new ArmyDAO().getAllArmy();
        LOGGER.info(armyModelList);
        List<AmmunitionModel> ammunitionModels = new AmmunitionDAO().getAllAmmunition();
        LOGGER.info(ammunitionModels);
        List<AviaweaponModel> aviaweaponModels = new AviaweaponDAO().getAllAviaweapon();
        LOGGER.info(aviaweaponModels);
        List<LandweaponModel> landweaponModels = new LandweaponDAO().getAllLandweapon();
        LOGGER.info(landweaponModels);
        List<MilitarybaseModel> militarybaseModelList = new MilitarybaseDAO().getAllMilitarybases();
        LOGGER.info(militarybaseModelList);
        List<MilitaryequipmentModel> militaryequipmentModels = new MilitaryequipmentDAO().getAllMilitaryequipments();
        LOGGER.info(militaryequipmentModels);
        List<NavyweaponModel> navyweaponModels = new NavyweaponDAO().getAllNavyweapons();
        LOGGER.info(navyweaponModels);
        List<SoldierModel> soldierModels = new SoldiersDAO().getAllSoldiers();
        LOGGER.info(soldierModels);

        //* Update/Inset/Delete
        LandweaponDAO landweaponDAO = new LandweaponDAO();
        LOGGER.info(landweaponModels);
        LandweaponModel landweaponModel1 = new LandweaponModel();
        landweaponModel1.setNameLandweapon("gevelin");
        landweaponModel1.setIdLandweapon(1);
        landweaponDAO.updateLandweapon(landweaponModel1);
        LOGGER.info(landweaponModel1);
        //* Update/Inset/Delete
        landweaponModel1.setIdLandweapon(7);
        landweaponModel1.setNameLandweapon("pushka");
        landweaponModel1.setQuantityLandweapon(12);
        landweaponModel1.setWeaponIdland(3);
        landweaponDAO.addLandweapon(landweaponModel1);
        LOGGER.info(landweaponModel1);
        landweaponDAO.deleteLandweapon(7);
        LOGGER.info(landweaponModel1 + "Land weapon was deleted");

        //* Update/Inset/Delete
        NavyweaponDAO navyweaponDAO = new NavyweaponDAO();
        LOGGER.info(navyweaponModels);
        NavyweaponModel navyweaponModel = new NavyweaponModel();
        navyweaponModel.setIdNavyweapon(4);
        navyweaponModel.setNameNavyweapon("space rocket");
        navyweaponDAO.updateNavyweapon(navyweaponModel);
        LOGGER.info(navyweaponModel);
        navyweaponModel.setIdNavyweapon(5);
        navyweaponModel.setNameNavyweapon("space ship");
        navyweaponModel.setQuantityNavyweapon(12);
        navyweaponModel.setWeaponIdnavy(3);
        navyweaponDAO.addNavyweapon(navyweaponModel);
        LOGGER.info(navyweaponModel);
        navyweaponDAO.deleteNavyweapon(5);
        LOGGER.info(navyweaponModel + "Navy weapon was deleted");

        //* Update/Inset
        List<WeaponModel> weaponModels = weaponDAO.getAllweapons();
        LOGGER.info(weaponModels);
        WeaponModel weaponModel1 = new WeaponModel();
        weaponModel1.setName("water");
        weaponModel1.setIdWeapon(1);
        weaponDAO.updateWeapon(weaponModel1);
        LOGGER.info(weaponModel1);
        weaponModel1.setIdWeapon(6);
        weaponModel1.setName("cold weapon");
        weaponModel1.setClasss("unicombat");
        weaponDAO.addWeapon(weaponModel1);
        LOGGER.info("->");
        List<WeaponModel> weaponModels1 = weaponDAO.getAllweapons();
        LOGGER.info(weaponModels1);


    }
}