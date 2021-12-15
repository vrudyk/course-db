package com.solvd.util.parsers.handlers;

import java.util.ArrayList;
import java.util.Stack;

import com.solvd.Main;
import com.solvd.model.BankModel;
import org.apache.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BankParserHandler extends DefaultHandler
    {
        private static final Logger LOGGER = Logger.getLogger(BankParserHandler.class);

        //This is the list which shall be populated while parsing the XML.
        private ArrayList bankList = new ArrayList();

        //As we read any XML element we will push that in this stack
        private static Stack elementStack = new Stack();

        //As we complete one user block in XML, we will push the User instance in bankList
        private Stack objectStack = new Stack();

        public void startDocument() throws SAXException
        {
            LOGGER.info("start of the document   : ");
        }

        public void endDocument() throws SAXException
        {
            LOGGER.info("end of the document document     : ");
        }

        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
        {
            //Push it in element stack
            this.elementStack.push(qName);
            LOGGER.info("start element - " + currentElement());

            //If this is start of 'user' element then prepare a new User instance and push it in object stack
            if ("bank".equals(qName))
            {
                //New User instance
                BankModel bank = new BankModel();

                //Set all required attributes in any XML element here itself
                if(attributes != null && attributes.getLength() == 1)
                {
                    bank.setIdBank(Integer.parseInt(attributes.getValue(0)));
                }
                this.objectStack.push(bank);
            }
        }

        public void endElement(String uri, String localName, String qName) throws SAXException
        {
            //Remove last added  element
            this.elementStack.pop();

            //User instance has been constructed so pop it from object stack and push in bankList
            if ("bank".equals(qName))
            {
                BankModel object = (BankModel) this.objectStack.pop();
                this.bankList.add(object);
            }
        }
        /**
         * This will be called everytime parser encounter a value node
         * */
        public void characters(char[] ch, int start, int length) throws SAXException
        {
            String value = new String(ch, start, length).trim();

            if (value.length() == 0)
            {
                return; // ignore white space
            }

            //handle the value based on to which element it belongs
            if ("Name".equals(currentElement()))
            {
                BankModel bank = (BankModel) this.objectStack.peek();
                bank.setName(value);
            }
        }

        /**
         * Utility method for getting the current element in processing
         * */
        private static String currentElement()
        {
            return (String) elementStack.peek();
        }

        //Accessor for bankList object
        public ArrayList getBanks()
        {
            return bankList;
        }
    }
