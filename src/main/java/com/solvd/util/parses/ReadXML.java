package com.solvd.util.parses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.solvd.model.EmployeesModel;
import org.apache.log4j.Logger;

public class ReadXML {

    private static final Logger LOGGER = Logger.getLogger(ReadXML.class);

    public void readXML() throws FileNotFoundException,XMLStreamException {


        File file = new File("src/main/resources/employees.xml");

        // Instance of the class which helps on reading tags
        XMLInputFactory factory = XMLInputFactory.newInstance();

        // Initializing the handler to access the tags in the XML file
        XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(file));

        //All read employees objects will be added to this list
        List<EmployeesModel> employeeList = new ArrayList<>();

        //Create Employee object. It will get all the data using setter methods.
        //And at last, it will stored in above 'employeeList'
        EmployeesModel employee = null;

        // Checking the availability of the next tag
        while (eventReader.hasNext())
        {
            XMLEvent xmlEvent = eventReader.nextEvent();

            if (xmlEvent.isStartElement())
            {
                StartElement startElement = xmlEvent.asStartElement();

                //As soo as employee tag is opened, create new Employee object
                if("employee".equalsIgnoreCase(startElement.getName().getLocalPart())) {
                    employee = new EmployeesModel();
                }

                //Read all attributes when start tag is being read
                @SuppressWarnings("unchecked")
                Iterator<Attribute> iterator = startElement.getAttributes();

                while (iterator.hasNext())
                {
                    Attribute attribute = iterator.next();
                    QName name = attribute.getName();
                    if("id".equalsIgnoreCase(name.getLocalPart())) {
                        employee.setId(Integer.valueOf(attribute.getValue()));
                    }
                }

                //Now everytime content tags are found;
                //Move the iterator and read data
                switch (startElement.getName().getLocalPart())
                {
                    case "firstName":
                        Characters firstNameDataEvent = (Characters) eventReader.nextEvent();
                        employee.setFirstName(firstNameDataEvent.getData());
                        break;

                    case "secondName":
                        Characters secondNameDataEvent = (Characters) eventReader.nextEvent();
                        employee.setSecondName(secondNameDataEvent.getData());
                        break;
                    case "position":
                        Characters positionDataEvent = (Characters) eventReader.nextEvent();
                        employee.setPosition(positionDataEvent.getData());
                        break;
                    case "onlineShopesId":
                        Characters onlineShopesIdDataEvent = (Characters) eventReader.nextEvent();
                        employee.setOnlineShopesId(Integer.parseInt(onlineShopesIdDataEvent.getData()));
                        break;
                }
            }

            if (xmlEvent.isEndElement())
            {
                EndElement endElement = xmlEvent.asEndElement();

                //If employee tag is closed then add the employee object to list;
                //and be ready to read next employee data
                if("employee".equalsIgnoreCase(endElement.getName().getLocalPart())) {
                    employeeList.add(employee);
                }
            }
        }

        outputList(employeeList);
    }

    private void outputList(List<EmployeesModel> employeesList){
        for(int i=0; i<employeesList.size(); i++){
            String employeeData="Employee № "+(i+1)+"\n"+
                    "Full name: "+employeesList.get(i).getFirstName()+" "+employeesList.get(i).getSecondName()+"\n"+
                    "Position: "+employeesList.get(i).getPosition()+"\n"+
                    "OnlineShop id: "+employeesList.get(i).getOnlineShopesId()+"\n";
            LOGGER.info(employeeData);
        }
    }
}
