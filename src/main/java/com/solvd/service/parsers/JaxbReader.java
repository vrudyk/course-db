package com.solvd.service.parsers;

import com.solvd.model.Faculty;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    private static final Logger LOGGER = Logger.getLogger(JaxbReader.class);

    public static Faculty jaxbXmlToObject (String filePath) {
        try{
            File file = new File(filePath);
            JAXBContext jaxbContext = JAXBContext.newInstance(Faculty.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            return (Faculty) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
