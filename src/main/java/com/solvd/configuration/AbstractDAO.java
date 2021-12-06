package com.solvd.configuration;

import com.solvd.util.IConstants;

import java.sql.*;

public class AbstractDAO {

    private Statement statement;
    protected ResultSet resultSet;
    private  Connection connection;

    public Connection getConnection(){
        MyConnection.newInstance();
        connection = MyConnection.getConnection(IConstants.MYDB_URL,
                IConstants.MYDB_USERNAME, IConstants.MYDB_PASSWORD);
        return connection;
    }

    public ResultSet getResultSet(String sqlQuery) throws SQLException{
        getConnection();
        statement=connection.createStatement();
        resultSet=statement.executeQuery(sqlQuery);
        return resultSet;
    }

    public void closeAll(){
        if(resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ignored){

            }
        if(statement !=null)
            try {
                statement.close();
            } catch (SQLException ignored){

            }
        if(connection !=null)
            try {
                connection.close();
            } catch (SQLException ignored){

            }
    }

}
