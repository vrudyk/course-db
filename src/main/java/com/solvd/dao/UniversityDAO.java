package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IUniversityDAO;

import com.solvd.model.UniversityModel;
import com.solvd.util.OpenSession;
import com.solvd.util.enums.Acreditation;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UniversityDAO extends AbstractDAO implements IUniversityDAO {
    private static final Logger LOGGER = Logger.getLogger(UniversityDAO.class);
    private IUniversityDAO entityDAO;
    private Class<IUniversityDAO> DAOClass = IUniversityDAO.class;


    @Override
    public List<UniversityModel> getAll() {
        SqlSession session = OpenSession.getOpenSession().openSession();
        entityDAO = session.getMapper(DAOClass);
        List<UniversityModel> entities = entityDAO.getAll();
        session.close();
        return entities;
    }

    @Override
    public List<UniversityModel> getAllUniversities() {
        List<UniversityModel> allUniversities = new ArrayList<>();
        try {
            getResultSet("SELECT * FROM University");
            while (resultSet.next()) {
                UniversityModel university = new UniversityModel();
                university.setId(resultSet.getInt("id"));
                university.setName(resultSet.getString("name"));
                university.setAcreditation(resultSet.getString("acreditation"));
                allUniversities.add(university);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allUniversities;
    }

    @Override
    public void deleteUniversityById(int idUniversity) {
        String delete = "DELETE FROM university WHERE id = %s";
        String sqlDelete = String.format(delete, idUniversity);
        String massage = String.format("Removed University with id = %s", idUniversity);

        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlDelete);
            LOGGER.info(massage);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    @Override
    public void insertIntoUniversity(int idUniversity, String Name, Acreditation acreditation) {
        String insert = "INSERT INTO university  VALUE (%s, '%s', '%s')";
        String sqlInsertIntoUniversity = String.format(insert, idUniversity, Name, acreditation.getValue());
        String massage = String.format("Added new University with id = %s, name = '%s', acreditation = '%s'",
                idUniversity, Name, acreditation.getValue());

        try {
            Connection conn = getConnection();
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsertIntoUniversity);
            LOGGER.info(massage);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
    }

    @Override
    public void addUniversity(UniversityModel universityModel) {

    }
}
