package com.solvd.util.parses;

import com.solvd.model.ClientsModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbToXML {
    private static JAXBContext jaxbContext;
    private static Marshaller jaxbMarshaller;
    public void jaxbObjToXML(ClientsModel clientsModel){
        try {
            if(jaxbContext==null) {
                jaxbContext = JAXBContext.newInstance(ClientsModel.class);
            }
            if(jaxbMarshaller==null) {
                jaxbMarshaller = jaxbContext.createMarshaller();
            }

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(clientsModel, new File("src/main/resources/clients.xml"));
        } catch (JAXBException e){
            e.printStackTrace();
        }
    }

}
