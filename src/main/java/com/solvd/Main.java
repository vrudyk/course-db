package com.solvd;

import com.solvd.dao.BankDAO;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        BankDAO bankDAO = new BankDAO();
       // bankDAO.getAllBanks().forEach(LOGGER::info);
       // bankDAO.insertIntoBank(4, "AlphaBank");
        bankDAO.insertIntoBank(5, "SberBank");
       // bankDAO.getAllBanks().forEach(LOGGER::info);
       // LOGGER.info("==============\n");
       // bankDAO.deleteBankById(5);
        bankDAO.getAllBanks().forEach(LOGGER::info);
    }
}
