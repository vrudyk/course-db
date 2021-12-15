package com.solvd;

import com.solvd.dao.BankDAO;
import com.solvd.util.parsers.handlers.BankXmlParser;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws FileNotFoundException {

        // BankDAO bankDAO = new BankDAO();
        // bankDAO.getAllBanks().forEach(LOGGER::info);
        // bankDAO.insertIntoBank(4, "AlphaBank");
        // bankDAO.insertIntoBank(5, "SberBank");
        // bankDAO.getAllBanks().forEach(LOGGER::info);
        // LOGGER.info("==============\n");
        // bankDAO.deleteBankById(5);
        // bankDAO.getAllBanks().forEach(LOGGER::info);

        saxParserXmlToObject();
    }

    public static void saxParserXmlToObject() throws FileNotFoundException {
        //Locate the file
        File xmlFile = new File("src/main/resources/bank.xml");

        //Create the parser instance
        BankXmlParser parser = new BankXmlParser();

        //Parse the file
        ArrayList banks = parser.parseXml(new FileInputStream(xmlFile));

        //Verify the result
        LOGGER.info(banks);

    }
}
