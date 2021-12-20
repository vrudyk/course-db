package com.solvd.service.parsers;

import com.solvd.model.Client;
import com.solvd.util.parsers.SaxParser;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {

    private static final Logger LOGGER = Logger.getLogger(JaxbReader.class);

    public static void jaxbXmlToObject () {

        try{
            File file = new File("src/main/resources/client.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Client client = (Client) jaxbUnmarshaller.unmarshal(file);

            LOGGER.info("Id = " + client.getIdClient());
            LOGGER.info("Name = " + client.getName());
            LOGGER.info("Age = " + client.getAge());
            LOGGER.info("Passport number = " + client.getPassport_Passport_number());
            LOGGER.info("Identification code = " + client.getPassport_Identification_Code());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
