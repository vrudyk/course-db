package com.solvd;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.dao.*;
import com.solvd.model.*;
import com.solvd.util.parses.JaxbToXML;
import com.solvd.util.parses.ReadXML;
import org.apache.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws IOException, XMLStreamException {
        ClientsDAO clientsDAO = new ClientsDAO();
        ClientsModel client = clientsDAO.getRandomClient();
        randomClientBuyProduct(client);//logic of program
        new ReadXML().readXML();//read xml with StAX

        JaxbToXML jaxbToXML = new JaxbToXML();//write to xml with jaxb
        jaxbToXML.jaxbObjToXML(client);

        List<OnlineShopesModel> onlineShop = new OnlineShopesDAO().getAllOnlineShopes();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("src/main/resources/onlineShopObjToJSON.json"),onlineShop);//write to json with jackson

        List<OnlineShopesModel> onlineShopJSONToObj = new ArrayList<>();
        onlineShopJSONToObj = objectMapper.readValue(new File("src/main/resources/onlineShopObjToJSON.json"),//read from json with jackson
                new TypeReference<List<OnlineShopesModel>>(){});
        for(int i=0; i<onlineShopJSONToObj.size();i++){
            LOGGER.info(onlineShopJSONToObj.get(i).toString()+"\n");
        }

        ClientsModel clientsModel = new ClientsModel();
        clientsModel.setFirstName("MyBatis");
        clientsModel.setSecondName("AddClient");
        clientsModel.setNumberOfPhone("351513");
        clientsModel.seteMail("mybatis@gmail.com");
        clientsModel.setOnlineShopesId(2);
        clientsDAO.addClient(clientsModel); //run query with mybatis

        LOGGER.info("\nADDED NEW CLIENT\n");
        LOGGER.info(clientsDAO.getAllClientsMyBatis().toString());//get all table with my batis
        clientsDAO.updateName("Updated Name");//update name with mybatis
        LOGGER.info("\nUpdated name\n");
        LOGGER.info(clientsDAO.getAllClients().toString());

        CreditCardsDAO creditCardsDAO = new CreditCardsDAO();
        creditCardsDAO.deleteRow(2);//delete row with mybatis
        clientsDAO.deleteRow(2);
        LOGGER.info("\nDeleted row from clients where onlineshopes_id=2\n");
        LOGGER.info(clientsDAO.getAllClientsMyBatis().toString());

        CreditCardsModel creditCardsModel = new CreditCardsModel();
        creditCardsModel.setCardNumber("1111222233334444");
        creditCardsModel.setCvv("111");
        creditCardsModel.setValidityPeriod("2030-1-1");
        creditCardsModel.setClients_id(1);
        creditCardsDAO.addCreditCard(creditCardsModel);
        LOGGER.info("\nINSERT NEW CARD\n"+creditCardsDAO.getAllCreditCards().toString());

        creditCardsDAO.updateCreditCard(1);
        LOGGER.info("\nUPDATE CARD WITH ID"+1+"\n"+
                creditCardsDAO.getAllCreditCards().toString());

    }

    public static void randomClientBuyProduct(ClientsModel client){
        OnlineShopesDAO onlineShopesDAO = new OnlineShopesDAO();
        OnlineShopesModel onlineShop=onlineShopesDAO.getOnlineShop(client.getOnlineShopesId());

        ListOfGoodsDAO listOfGoodsDAO = new ListOfGoodsDAO();
        ListOfGoodsModel product = listOfGoodsDAO.getProductInShop(client.getOnlineShopesId());

        String check = client.getFirstName()+" "+client.getSecondName() +" want buy the "+product.getNameOfThing()+":\n"+
                "Price: "+product.getPrice()+"\n"+
                "Warranty: "+product.getWarranty()+"\n\n"+
                "Client's contacs:\n"+
                "Phone number: "+client.getNumberOfPhone()+"\n"+
                "E-mail: "+client.geteMail()+"\n\n"+
                "Online shop's contacs:\n"+
                "Link: "+onlineShop.getLink()+"\n"+
                "Phone number: "+onlineShop.getPhoneNumber()+"\n";
        LOGGER.info("Check:\n"+check);
    }

}
