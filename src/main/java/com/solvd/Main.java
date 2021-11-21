package com.solvd;

import dao.AmmunitionDAO;
import dao.SoldiersDAO;
import dao.WeaponDAO;
import org.apache.log4j.Logger;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        SoldiersDAO soldiersDAO = new SoldiersDAO();
        soldiersDAO.getAllSoldiers().forEach(LOGGER::info);

        AmmunitionDAO ammunitionDAO = new AmmunitionDAO();
        ammunitionDAO.getAllAmmunition().forEach(LOGGER::info);

        WeaponDAO weaponDAO = new WeaponDAO();
        weaponDAO.getAllweapon().forEach(LOGGER::info);

    }

}

