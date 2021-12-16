import com.solvd.dao.EmployeesDAO;
import com.solvd.dao.interfaces.IEmployeesDAO;
import com.solvd.model.EmployeeModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModelTest {
    private Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private static final Logger LOGGER = Logger.getLogger(EmployeeModelTest.class);

    @BeforeClass
    public void setUp() {
        String dbUrl = "jdbc:mysql://localhost/petrushkoPhotoStudio";
        String dbUser = "root";
        String dbPass = "kpetrushko5";
        connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            LOGGER.info("Connecting to Database...");
            connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            if (connection != null) {
                LOGGER.info("Connected to the Database...");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAllEmployeesFromDb() {
        List<EmployeeModel> allEmployees = new ArrayList<>();
        try {
            String query = "SELECT * FROM employees";
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                EmployeeModel employee = new EmployeeModel();
                employee.setId(resultSet.getInt("id"));
                employee.setfName(resultSet.getString("fName"));
                employee.setlName(resultSet.getString("lName"));
                employee.setSalary(resultSet.getString("salary"));
                employee.setPositions_id(resultSet.getInt("positions_id"));
                employee.setPassport_id(resultSet.getInt("passport_id"));
                employee.setEmployeesInfo_id(resultSet.getInt("employeesInfo_id"));
                allEmployees.add(employee);
                LOGGER.info(allEmployees);
                Assert.assertEquals(21, 21, "Number of product doesn't match");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        if (connection != null) {
            try {
                LOGGER.info("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

}
