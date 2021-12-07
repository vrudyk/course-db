package com.solvd.util.parsers;

import com.solvd.model.EmployeeModel;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomParser {
    private static final Logger LOGGER = Logger.getLogger(DomParser.class);
    private static final String FILENAME = "src/main/resources/xml/employee.xml";

    public static List<EmployeeModel> parseEmployee() throws ParserConfigurationException, IOException, SAXException {
        List<EmployeeModel> employeeModels = new ArrayList<>();
        EmployeeModel employeeModel = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/xml/employee.xml"));
        document.getDocumentElement().normalize();
        NodeList nList = document.getElementsByTagName("employee");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                NodeList salaryNodeList = ((Element) node).getElementsByTagName("salary");
                String salary = salaryNodeList.item(0).getTextContent();
                String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

                Element eElement = (Element) node;
                employeeModel = new EmployeeModel();
                employeeModel.setId(Integer.parseInt(eElement.getAttribute("id")));
                employeeModel.setfName(eElement.getElementsByTagName("fName").item(0).getTextContent());
                employeeModel.setlName(eElement.getElementsByTagName("lName").item(0).getTextContent());

                employeeModels.add(employeeModel);

                LOGGER.info("Current Element :" + node.getNodeName());
                LOGGER.info("Employee Id : " + employeeModel.getId());
                LOGGER.info("fName : " + employeeModel.getfName());
                LOGGER.info("lName : " + employeeModel.getlName());
                System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);
            }
        }
        return employeeModels;
    }
}