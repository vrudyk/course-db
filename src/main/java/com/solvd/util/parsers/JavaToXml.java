package com.solvd.util.parsers;

import com.solvd.model.ClientModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JavaToXml {
    public static void jaxbObjectToXML(ClientModel client) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ClientModel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(client, new File("src/main/resources/client.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}