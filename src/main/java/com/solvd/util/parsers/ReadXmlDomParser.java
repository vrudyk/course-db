package com.solvd.util.parsers;

import com.solvd.model.EmployeeModel;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ReadXmlDomParser {
    private static final Logger LOGGER = Logger.getLogger(ReadXmlDomParser.class);
    private static final String FILENAME = "src/main/resources/employee.xml";

    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        EmployeeModel employeeModel = new EmployeeModel();

        try {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(FILENAME));
            doc.getDocumentElement().normalize();

            LOGGER.info("Root Element :" + doc.getDocumentElement().getNodeName());
            LOGGER.info("------");
            NodeList list = doc.getElementsByTagName("employee");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;
                    String id = element.getAttribute("id");

                    NodeList salaryNodeList = element.getElementsByTagName("salary");
                    String salary = salaryNodeList.item(0).getTextContent();
                    String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

                    employeeModel.setId(Integer.parseInt(id));
                    employeeModel.setfName(element.getElementsByTagName("fName").item(0).getTextContent());
                    employeeModel.setlName(element.getElementsByTagName("lName").item(0).getTextContent());

                    LOGGER.info("Current Element :" + node.getNodeName());
                    LOGGER.info("Employee Id : " + employeeModel.getId());
                    LOGGER.info("fName : " + employeeModel.getfName());
                    LOGGER.info("lName : " + employeeModel.getlName());
                    System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}
