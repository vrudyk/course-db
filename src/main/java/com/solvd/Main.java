package com.solvd;

import com.solvd.dao.ClientsDAO;
import com.solvd.dao.ListOfGoodsDAO;
import com.solvd.dao.OnlineShopesDAO;
import com.solvd.model.ClientsModel;
import com.solvd.model.ListOfGoodsModel;
import com.solvd.model.OnlineShopesModel;
import com.solvd.util.parses.JaxbToXML;
import com.solvd.util.parses.ReadXML;
import org.apache.log4j.Logger;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        ClientsDAO clientsDAO = new ClientsDAO();
        ClientsModel client = clientsDAO.getRandomClient();
        randomClientBuyProduct(client);
        new ReadXML().readXML();

        JaxbToXML jaxbToXML = new JaxbToXML();
        jaxbToXML.jaxbObjToXML(client);
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
