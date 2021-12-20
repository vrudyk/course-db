package com.solvd.service.parsers;

import com.solvd.model.Client;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {

    public static void jaxbObjectToXml(Client client) {
        try{

            File file = new File("src/main/resources/client.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to Console
            jaxbMarshaller.marshal(client, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
