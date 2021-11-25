package model;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Parsesoldier {
    private static final Logger LOGGER = Logger.getLogger(Parsesoldier.class);

     {
        String filePath = "soldiers.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("SoldierModel");

            List <SoldierModel> soldierList = new ArrayList <> ();

            for (int i = 0; i < nodeList.getLength(); i++) {
                soldierList.add(getUser(nodeList.item(i)));
            }
                    // lets print User list information
            for (SoldierModel print: soldierList) {
                LOGGER.info(print.toString());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }

    }
    private static SoldierModel getUser(Node node) {
        SoldierModel soldier = new SoldierModel();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            soldier.setIdSoldiers(Integer.parseInt(getTagValue("idSoldiers", element)));
            soldier.setFirstName(getTagValue("firstName", element));
            soldier.setLastName(getTagValue("lastName", element));
            soldier.setAge(Integer.parseInt(getTagValue("age", element)));
            soldier.setRankk(getTagValue("rankk", element));
            soldier.setGender(getTagValue("gender", element));

        }
        return soldier;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

}