package com.solvd;

import com.mysql.cj.xdevapi.Client;
import com.solvd.dao.*;
import com.solvd.model.ClientModel;
import com.solvd.model.EmployeeModel;
import com.solvd.model.EmployeesInfoModel;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static com.solvd.util.parsers.JavaToXml.jaxbObjectToXML;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws FileNotFoundException  {

        ClientModel client = new ClientModel(1, "Masha", "Kovalchuk", "380952310231");
        client.setCities(Arrays.asList("Kyiv", "Kharkiv", "Lviv"));
        jaxbObjectToXML(client);

//        PositionsDAO positionsDAO = new PositionsDAO();
//        positionsDAO.getAllPositions().forEach(LOGGER::info);

//        ClientsDAO clientsDAO = new ClientsDAO();
//        clientsDAO.getAllClients().forEach(LOGGER::info);
    }

}
