package com.solvd.util.parsers;

import com.solvd.util.parsers.handlers.BankXmlParser;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SaxParser {

    private static final Logger LOGGER = Logger.getLogger(SaxParser.class);

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
