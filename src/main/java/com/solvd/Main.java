package com.solvd;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.dao.BankDAO;
import com.solvd.model.Client;
import com.solvd.model.Passport;
import com.solvd.model.Salary;
import com.solvd.service.parsers.JaxbReader;
import com.solvd.service.parsers.JaxbWriter;
import com.solvd.service.parsers.JsonReader;
import com.solvd.service.parsers.JsonWriter;
import com.solvd.util.parsers.SaxParser;
import com.solvd.util.parsers.handlers.BankXmlParser;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        /*  // Jdbc parser (Bank)
        BankDAO bankDAO = new BankDAO();
        bankDAO.getAllBanks().forEach(LOGGER::info);
        bankDAO.insertIntoBank(4, "AlphaBank");
        bankDAO.insertIntoBank(5, "SberBank");
        bankDAO.getAllBanks().forEach(LOGGER::info);
        LOGGER.info("==============\n");
        bankDAO.deleteBankById(5);
        bankDAO.getAllBanks().forEach(LOGGER::info);
        SaxParser.saxParserXmlToObject();
         */

        /*    // Jaxb parser (client)
        Client client = new Client();
        client.setIdClient(11);
        client.setName("Vasia");
        client.setAge(22);
        client.setPassport_Passport_number(123456799);
        client.setPassport_Identification_Code(1234567800);

        JaxbWriter.jaxbObjectToXml(client);
        JaxbReader.jaxbXmlToObject();
         */

        /*  // Json parser (salary and passport)
        ObjectMapper objectMapper = new ObjectMapper();
        Salary salary = new Salary();
        salary.setIdSalary(5);
        salary.setSalary(20000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Passport passport = new Passport(123456789, 1234567810, 7323, "MD",
                "M", sdf.parse("1999-11-21"));

        JsonWriter.jsonWriterPassport(passport);
        //JsonReader.jsonReaderPassport();
        // JsonWriter.jsonWriterSalary(salary);
        // JsonReader.jsonReaderSalary();
         */


    }
}
