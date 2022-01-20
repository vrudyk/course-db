package com.solvd.configuration;

import com.solvd.util.IConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {

    protected ResultSet resultSet;
    private Statement statement;
    private Connection connection;

    public Connection getConnection() {
        MyConnection.newInstance();
        connection = MyConnection.getConnection(IConstants.URL, IConstants.USER, IConstants.PASS);
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
