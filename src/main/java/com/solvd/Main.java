package com.solvd;

import com.solvd.dao.ClientsDAO;
import com.solvd.dao.ListOfGoodsDAO;
import com.solvd.dao.OnlineShopesDAO;
import com.solvd.model.ClientsModel;
import com.solvd.model.ListOfGoodsModel;
import com.solvd.model.OnlineShopesModel;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        ClientsDAO clientsDAO = new ClientsDAO();
        LOGGER.info(clientsDAO.getRandomClient().toString());
        randomClientBuyProduct(clientsDAO.getRandomClient());
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
