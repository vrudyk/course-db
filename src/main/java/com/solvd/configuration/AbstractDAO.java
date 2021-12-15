package com.solvd.configuration;

import java.sql.*;

import com.solvd.util.IConstants;

public class AbstractDAO {

    private Statement statement;
    protected ResultSet resultSet;
    private Connection connection;


    public Connection getConnection() {
        MyConnection.newInstance();
        connection = MyConnection.getConnection(IConstants.BANK_URL, IConstants.USERNAME, IConstants.PASSWORD);
        return connection;
    }

    public ResultSet getResultSet(String sqlQuery) throws SQLException {
        getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlQuery);
        return resultSet;
    }

    public void closeAll() {
        if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ignored) {
            }
        if (statement != null)
            try {
                statement.close();
            } catch (SQLException ignored) {
            }
        if (connection != null)
            try {
                connection.close();
            } catch (SQLException ignored) {
            }
    }
}
