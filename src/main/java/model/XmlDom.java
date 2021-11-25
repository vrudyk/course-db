package model;


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

public class XmlDom {

    private static final Logger LOGGER = Logger.getLogger(XmlDom.class);
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;

    {
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    Document document;

    {
        try {
            document = builder.parse("soldiers.xml");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    NodeList soldierList = document.getElementsByTagName("soldier");

    {
        for (int i = 0; i < soldierList.getLength(); i++) {
            Node sol = soldierList.item(i);
            if (sol.getNodeType() == Node.ELEMENT_NODE) {
                Element soldier = (Element) sol;
                String idSoldiers = soldier.getAttribute("idSoldiers");
                {
                    NodeList nameList = soldier.getChildNodes();
                    for (int j = 0; j < nameList.getLength(); j++) {
                        Node n = nameList.item(j);
                        if (n.getNodeType() == Node.ELEMENT_NODE) {
                            Element name = (Element) n;
                            LOGGER.info("Soldiers" + idSoldiers + ":" + name.getTagName() + "=" + name.getTextContent());
                        }

                    }

                }
            }

        }
    }
}




