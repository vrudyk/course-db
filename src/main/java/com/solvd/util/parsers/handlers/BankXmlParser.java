package com.solvd.util.parsers.handlers;

import com.solvd.model.BankModel;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class BankXmlParser {

    public ArrayList parseXml(InputStream in)
    {
        //Create a empty link of users initially
        ArrayList<BankModel> banks = new ArrayList<>();
        try
        {
            //Create default handler instance
            BankParserHandler handler = new BankParserHandler();

            //Create parser from factory
            XMLReader parser = XMLReaderFactory.createXMLReader();

            //Register handler with parser
            parser.setContentHandler(handler);

            //Create an input source from the XML input stream
            InputSource source = new InputSource(in);

            //parse the document
            parser.parse(source);

            //populate the parsed users list in above created empty list; You can return from here also.
            banks = handler.getBanks();

        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

        }
        return banks;
    }
}
