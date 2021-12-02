package com.solvd;

import com.solvd.util.parsers.DomParser;
import com.solvd.util.parsers.JsonToJava;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        DomParser.parseEmployee();


//        PositionModel positionModel = new PositionModel(1, "photographer");
//        JavaToJson.objectToJson(positionModel);


//        ClientModel client = new ClientModel(1, "Masha", "Kovalchuk", "380952310231");
//        client.setCities(Arrays.asList("Kyiv", "Kharkiv", "Lviv"));
//        jaxbObjectToXML(client);


//        PositionsDAO positionsDAO = new PositionsDAO();
//        positionsDAO.getAllPositions().forEach(LOGGER::info);

//        ClientsDAO clientsDAO = new ClientsDAO();
//        clientsDAO.getAllClients().forEach(LOGGER::info);
    }

}
