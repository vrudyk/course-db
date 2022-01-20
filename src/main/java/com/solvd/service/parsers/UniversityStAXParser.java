package com.solvd.service.parsers;

import com.solvd.model.UniversityModel;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UniversityStAXParser {
    private List<UniversityModel> universityList;

    public UniversityStAXParser(String filePath) {
        try {
            File file = new File(filePath);

            // Instance of the class which helps on reading tags
            XMLInputFactory factory = XMLInputFactory.newInstance();

            // Initializing the handler to access the tags in the XML file
            XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(file));

            //All read employees objects will be added to this list
            universityList = new ArrayList<>();

            //Create Employee object. It will get all the data using setter methods.
            //And at last, it will stored in above 'employeeList'
            UniversityModel university = null;

            // Checking the availability of the next tag
            while (eventReader.hasNext()) {
                XMLEvent xmlEvent = eventReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();

                    //As soo as employee tag is opened, create new Employee object
                    if ("university".equalsIgnoreCase(startElement.getName().getLocalPart())) {
                        university = new UniversityModel();
                    }

                    //Read all attributes when start tag is being read
                    @SuppressWarnings("unchecked")
                    Iterator<Attribute> iterator = startElement.getAttributes();

                    while (iterator.hasNext()) {
                        Attribute attribute = iterator.next();
                        QName name = attribute.getName();
                        if ("id".equalsIgnoreCase(name.getLocalPart())) {
                            university.setId(Integer.valueOf(attribute.getValue()));
                        }
                    }

                    //Now everytime content tags are found;
                    //Move the iterator and read data
                    switch (startElement.getName().getLocalPart()) {
                        case "name":
                            Characters nameDataEvent = (Characters) eventReader.nextEvent();
                            university.setName(nameDataEvent.getData());
                            break;

                        case "acreditation":
                            Characters acreditationDataEvent = (Characters) eventReader.nextEvent();
                            university.setAcreditation(acreditationDataEvent.getData());
                            break;
                    }
                }

                if (xmlEvent.isEndElement()) {
                    EndElement endElement = xmlEvent.asEndElement();

                    //If employee tag is closed then add the employee object to list;
                    //and be ready to read next employee data
                    if ("university".equalsIgnoreCase(endElement.getName().getLocalPart())) {
                        universityList.add(university);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        }
    }

    public List<UniversityModel> getUniversityList () {
        return universityList;
    }
}
