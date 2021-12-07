package com.solvd.dao.interfaces;

import com.solvd.model.ListOfGoodsModel;

import java.util.List;

public interface IListOfGoodsDAO {
    public List<ListOfGoodsModel> getListOfGoods();

    public List<ListOfGoodsModel> getListOfGoodsMyBatis();

    public ListOfGoodsModel getProductInShop(int id);
}
