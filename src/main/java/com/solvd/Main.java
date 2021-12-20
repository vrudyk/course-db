package com.solvd;

import com.solvd.dao.BankDAO;
import com.solvd.model.Client;
import com.solvd.service.parsers.JaxbReader;
import com.solvd.service.parsers.JaxbWriter;
import com.solvd.util.parsers.SaxParser;
import com.solvd.util.parsers.handlers.BankXmlParser;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

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
        // SaxParser.saxParserXmlToObject();

        Client client = new Client();
        client.setIdClient(11);
        client.setName("Vasia");
        client.setAge(22);
        client.setPassport_Passport_number(123456799);
        client.setPassport_Identification_Code(1234567800);

        JaxbWriter.jaxbObjectToXml(client);
        JaxbReader.jaxbXmlToObject();
    }
}
