package com.solvd.dao;

import com.solvd.configuration.AbstractDAO;
import com.solvd.dao.interfaces.ICreditCardsDAO;
import com.solvd.dao.interfaces.IListOfGoodsDAO;
import com.solvd.model.EmployeesModel;
import com.solvd.model.ListOfGoodsModel;
import com.solvd.model.OnlineShopesModel;
import com.solvd.util.OpenSession;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListOfGoodsDAO extends AbstractDAO implements IListOfGoodsDAO {

    private IListOfGoodsDAO entityDAO;
    private Class<IListOfGoodsDAO> DAOClass = IListOfGoodsDAO.class;

    @Override
    public List<ListOfGoodsModel> getListOfGoods() {
        List<ListOfGoodsModel> allListOfGoodsModels = new ArrayList<>();

        try{
            getResultSet("SELECT * FROM listofgoods");
            while(resultSet.next()){
                ListOfGoodsModel listOfGoodsModel = new ListOfGoodsModel();
                listOfGoodsModel.setIdThing(resultSet.getInt("idThing"));
                listOfGoodsModel.setNameOfThing(resultSet.getString("NameOfThing"));
                listOfGoodsModel.setPrice(resultSet.getInt("Price"));
                listOfGoodsModel.setInStock(resultSet.getInt("Price"));
                listOfGoodsModel.setWarranty(resultSet.getString("warranty"));
                listOfGoodsModel.setOnlineShopes_id(resultSet.getInt("OnlineShopes_id"));
                allListOfGoodsModels.add(listOfGoodsModel);
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return allListOfGoodsModels;
    }

    @Override
    public ListOfGoodsModel getProductInShop(int id) {
        ListOfGoodsModel product = new ListOfGoodsModel();
        try{
            String query= String.format("SELECT * FROM listofgoods where `OnlineShopes_id` = %s", id);
            getResultSet(query);
            while(resultSet.next()){
                product.setIdThing(resultSet.getInt("idThing"));
                product.setNameOfThing(resultSet.getString("NameOfThing"));
                product.setPrice(resultSet.getInt("Price"));
                product.setInStock(resultSet.getInt("Price"));
                product.setWarranty(resultSet.getString("warranty"));
                product.setOnlineShopes_id(resultSet.getInt("OnlineShopes_id"));
            }
        } catch (SQLException throwables){
            throwables.printStackTrace();
        } finally {
            closeAll();
        }
        return product;
    }


    @Override
    public List<ListOfGoodsModel> getListOfGoodsMyBatis() {
        SqlSession sqlSession = OpenSession.getOpenSession().openSession();
        entityDAO = sqlSession.getMapper(DAOClass);
        List<ListOfGoodsModel> entities = entityDAO.getListOfGoodsMyBatis();
        sqlSession.close();
        return entities;
    }
}
