package com.solvd.configuration;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static final Logger LOGGER = Logger.getLogger(MyConnection.class);

    private static MyConnection instance;

    private MyConnection() {
        try {
            LOGGER.info("Register driver ...");
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static MyConnection newInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        return instance;
    }

    public static Connection getConnection(String url, String name, String pass) {
        try {
            return DriverManager.getConnection(url, name, pass);
        } catch (SQLException e ) {
            LOGGER.info("Connection isn't created! Method returned NULL!");
            LOGGER.error(e);
            return null;
        }
    }
}
