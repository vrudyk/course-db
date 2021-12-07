package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IOnlineShopesDAO;
import com.solvd.dao.interfaces.ISuppliersDAO;
import com.solvd.model.OnlineShopesModel;
import com.solvd.model.SuppliersModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuppliersDAO extends AbstractDAO implements ISuppliersDAO {

    private ISuppliersDAO entityDAO;
    private Class<ISuppliersDAO> DAOClass = ISuppliersDAO.class;

    @Override
    public List<SuppliersModel> getAllSuppliers() {
        List<SuppliersModel> allSuppliers = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM suppliers");
            while(resultSet.next()){
                SuppliersModel suppliersModel = new SuppliersModel();
                suppliersModel.setId(resultSet.getInt("id"));
                suppliersModel.setNameOfSuppliers(resultSet.getString("NameOfSuppliers"));
                suppliersModel.setOnlineShopes_id(resultSet.getInt("OnlineShopes_id"));
                allSuppliers.add(suppliersModel);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allSuppliers;
    }

    @Override
    public List<SuppliersModel> getAllSuppliersMyBatis() {
        SqlSession sqlSession = OpenSession.getOpenSession().openSession();
        entityDAO = sqlSession.getMapper(DAOClass);
        List<SuppliersModel> entities = entityDAO.getAllSuppliersMyBatis();
        sqlSession.close();
        return entities;
    }
}
