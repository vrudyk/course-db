package com.solvd;

import com.solvd.dao.AmmunitionDAO;
import com.solvd.dao.MilitaryequipmentDAO;
import com.solvd.dao.SoldiersDAO;
import com.solvd.dao.WeaponDAO;
import com.solvd.model.OfficershipModel;
import com.solvd.util.Domxml;
import com.solvd.util.Requestdate;
import com.solvd.util.Soldiers;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import static com.solvd.model.OfficershipModel.*;
import static com.solvd.util.Requestdate.parDate;
import static com.solvd.util.Soldiers.arrayParse;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws SQLException, IOException, ParseException, ParserConfigurationException, SAXException {
        //*Select all (SQL) & operators(Insert, Update, Delete);
        AmmunitionDAO ammunitionDAO = new AmmunitionDAO();
        ammunitionDAO.getAllAmmunition().forEach(LOGGER::info);

        WeaponDAO weaponDAO = new WeaponDAO();
        weaponDAO.getAllweapons().forEach(LOGGER::info);

        MilitaryequipmentDAO militaryequipmentDAO = new MilitaryequipmentDAO();
        militaryequipmentDAO.getAllMilitaryequipments().forEach(LOGGER::info);

        SoldiersDAO soldiersDAO = new SoldiersDAO();
        soldiersDAO.getAllSoldiers().forEach(LOGGER::info);
        soldiersDAO.insertSoldier();
        soldiersDAO.updateName(5);
        soldiersDAO.deleteId(23);

        //*Jaxb parse Xml;
        OfficershipModel officership = new OfficershipModel(1, "John", "Bang", 32, "soldier", "male", 2);
        jaxbParser(officership);

        // *Parser Json;
        jsonParse(officership);
        parseJs(officership);
        parseArrayJs(officership);
        Soldiers soldiers = new Soldiers();
        arrayParse(soldiers);

        // *Parse Json Date format;
        Requestdate request = new Requestdate();
        parDate(request);

        //Domxml domxml = new Domxml();
        //parseSoldiersXML(domxml);

    }

}