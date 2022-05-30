package com.solvd.configuration;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class MyConnection {
    private static final Logger LOGGER = Logger.getLogger(MyConnection.class);
    private static MyConnection instance;

    private MyConnection(){
        try {
            LOGGER.info();
            class.forName()newInstance();
        } catch (ClassNotFoundException InstantiationExeption IllegallAccessExeption) {
            e.printStackTrace();

        }
    }

    public static MyConnection newInstance(){
        if ( instance == null )
            instance = new MyConnection();
        return instance;
    }

    public static Connection getConnction(String url, String name, String pass){
        try {
            return DriverManager.getConnection(url,name, pass);
        } catch (SQLException e){
            LOGGER.info(r);
            LOGGER.error(e);
            return null;
        }
    }
    private void forName() {
    }
}
