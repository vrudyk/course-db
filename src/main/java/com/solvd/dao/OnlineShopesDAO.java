package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.IListOfGoodsDAO;
import com.solvd.dao.interfaces.IOnlineShopesDAO;
import com.solvd.model.ListOfGoodsModel;
import com.solvd.model.OnlineShopesModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OnlineShopesDAO extends AbstractDAO implements IOnlineShopesDAO {

    private IOnlineShopesDAO entityDAO;
    private Class<IOnlineShopesDAO> DAOClass = IOnlineShopesDAO.class;


    @Override
    public List<OnlineShopesModel> getAllOnlineShopes() {
        List<OnlineShopesModel> allOnlineShopes = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM onlineshopes");
            while(resultSet.next()){
                OnlineShopesModel onlineShopes = new OnlineShopesModel();
                onlineShopes.setId(resultSet.getInt("id"));
                onlineShopes.setName(resultSet.getString("name"));
                onlineShopes.setLink(resultSet.getString("link"));
                onlineShopes.setPhoneNumber(resultSet.getString("phone number"));
                allOnlineShopes.add(onlineShopes);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allOnlineShopes;
    }

    @Override
    public OnlineShopesModel getOnlineShop(int id) {
        OnlineShopesModel onlineShopesModel= new OnlineShopesModel();
        try{
            String query= String.format("SELECT * FROM onlineshopes where id = %s", id);
            getResultSet(query);
            while(resultSet.next()){
                onlineShopesModel.setId(resultSet.getInt("id"));
                onlineShopesModel.setName(resultSet.getString("name"));
                onlineShopesModel.setLink(resultSet.getString("link"));
                onlineShopesModel.setPhoneNumber(resultSet.getString("phone number"));
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return onlineShopesModel;
    }

    @Override
    public List<OnlineShopesModel> getAllOnlineShopesMyBatis() {
        SqlSession sqlSession = OpenSession.getOpenSession().openSession();
        entityDAO = sqlSession.getMapper(DAOClass);
        List<OnlineShopesModel> entities = entityDAO.getAllOnlineShopesMyBatis();
        sqlSession.close();
        return entities;
    }
}
