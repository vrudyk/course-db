package com.solvd.service.parsers;

import com.solvd.model.Faculty;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {

    public static void jaxbObjectToXml(Faculty faculty, String filePath) {
        try{

            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Faculty.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            //Print XML String to Console
            jaxbMarshaller.marshal(faculty, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
