package model;

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

public class Dom {

    private static List<SoldierModel> parseSoldiersXML() throws ParserConfigurationException, IOException, SAXException {
        {
            List<SoldierModel> soldierModels = parseSoldiersXML();
            System.out.println(parseSoldiersXML());

        }

        List<SoldierModel> soldierModels = new ArrayList<>();
        SoldierModel soldierModel = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/soldiers.xml"));
        document.getDocumentElement().normalize();
        NodeList nList = document.getElementsByTagName("soldier");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                //Create new Employee Object
                soldierModel = new SoldierModel();
                soldierModel.setIdSoldiers(Integer.parseInt(eElement.getAttribute("idSoldiers")));
                soldierModel.setFirstName(eElement.getElementsByTagName("firstName").item(0).getTextContent());
                soldierModel.setLastName(eElement.getElementsByTagName("lastName").item(0).getTextContent());
                soldierModel.setAge(Integer.parseInt(eElement.getAttribute("age")));
                soldierModel.setRankk(eElement.getElementsByTagName("lastName").item(0).getTextContent());
                soldierModel.setGender(eElement.getElementsByTagName("gender").item(0).getTextContent());

                soldierModels.add(soldierModel);
            }
        }
        return soldierModels;
    }
}

