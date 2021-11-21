package configuration;

import util.IConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {
    private Statement statement;
    protected ResultSet resultSet;
    private Connection connection;

    public Connection getСonnection() {
        MyConnection.newInstance();
        connection = MyConnection.getConnection(IConstants.BLOSHKOARMY_URL, IConstants.USERNAME, IConstants.PASSWORD);
        return connection;
    }

    public ResultSet getResultSet(String sqlQuery) throws SQLException {
        getСonnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sqlQuery);
        return resultSet;
    }

    public void closeALL() {
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
