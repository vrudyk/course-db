package com.solvd;

import com.solvd.dao.*;
import com.solvd.model.*;
import com.solvd.util.parsers.DomParser;
import com.solvd.util.parsers.JsonToJava;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, FileNotFoundException {
          //MyBatis

        //Select1
//        List<EmployeeModel> employeeModels = new EmployeesDAO().getAllEmployee();
//        LOGGER.info(employeeModels);

//      //Insert1
//        EmployeeModel employeeModel = new EmployeeModel();
//        employeeModel.setfName("Katya");
//        employeeModel.setlName("Boberka");
//        employeeModel.setSalary("27000");
//        employeeModel.setPositions_id(5);
//        employeeModel.setPassport_id(5);
//        employeeModel.setEmployeesInfo_id(5);
//        new EmployeesDAO().addEmployees(employeeModel);
//
//        LOGGER.info("->");
//        List<EmployeeModel> employeeModels1 = new EmployeesDAO().getAllEmployee();
//        LOGGER.info(employeeModels1);

        //Update1
//        EmployeeModel employeeModel = new EmployeeModel();
//        employeeModel.setId(1);
//        employeeModel.setfName("Edgar");
//        employeeModel.setlName("Kamanskiy");
//        employeeModel.setSalary("31000");
//        employeeModel.setPositions_id(1);
//        employeeModel.setPassport_id(1);
//        employeeModel.setEmployeesInfo_id(1);
//        new EmployeesDAO().updateEmployees(employeeModel);

        //Select2
//        List<ClientModel> clientModels = new ClientsDAO().getAllClient();
//        LOGGER.info(clientModels);

//      //Insert2
//        ClientModel clientModel = new ClientModel();
//        clientModel.setfName("Irina");
//        clientModel.setlName("Ribka");
//        clientModel.setPhone("380509128376");
//        new ClientsDAO().addClients(clientModel);
//
//        LOGGER.info("->");
//        List<ClientModel> clientModels1 = new ClientsDAO().getAllClient();
//        LOGGER.info(clientModels1);

        //Update2
//        ClientModel clientModel = new ClientModel();
//        clientModel.setId(1);
//        clientModel.setfName("Dan");
//        clientModel.setlName("Danover");
//        clientModel.setPhone("380959221212");
//        new ClientsDAO().updateClient(clientModel);

        //Select3
//        List<EmployeesInfoModel> employeesInfoModels = new EmployeesInfoDAO().getAllEmployeeInfo();
//        LOGGER.info(employeesInfoModels);
        //Select4
//        List<EquipmentModel> equipmentModels = new EquipmentsDAO().getAllEquipments();
//        LOGGER.info(equipmentModels);
        //Delete1
//        EquipmentModel equipmentModel = new EquipmentModel();
//        new EquipmentsDAO().deleteEquipment(1);
        //Select5
//        List<LocationModel> locationModels = new LocationsDAO().getAllLocation();
//        LOGGER.info(locationModels);
        //Select6
//        List<OrdersModel> ordersModels = new OrdersDAO().getAllOrder();
//        LOGGER.info(ordersModels);
        //Select7
//        List<PassportModel> passportModels = new PassportsDAO().getAllPassport();
//        LOGGER.info(passportModels);
        //Select8
//        List<PositionModel> positionModels = new PositionsDAO().getAllPosition();
//        LOGGER.info(positionModels);
        //Select9
//        List<ProductsModel> productsModels = new ProductsDAO().getAllProduct();
//        LOGGER.info(productsModels);
        //Select10
//        List<ProductsDetailsModel> productsDetailsModels = new ProductsDetailsDAO().getAllProductsDetail();
//        LOGGER.info(productsDetailsModels);

           //DOM
//        DomParser.parseEmployee();

          //JSON
//        PositionModel positionModel = new PositionModel(1, "photographer");
//        JavaToJson.objectToJson(positionModel);

          //JAXB
//        ClientModel client = new ClientModel(1, "Masha", "Kovalchuk", "380952310231");
//        client.setCities(Arrays.asList("Kyiv", "Kharkiv", "Lviv"));
//        jaxbObjectToXML(client);


//        PositionsDAO positionsDAO = new PositionsDAO();
//        positionsDAO.getAllPositions().forEach(LOGGER::info);

//        ClientsDAO clientsDAO = new ClientsDAO();
//        clientsDAO.getAllClients().forEach(LOGGER::info);
    }

}
