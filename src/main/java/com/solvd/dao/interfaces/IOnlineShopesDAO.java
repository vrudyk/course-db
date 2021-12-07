package com.solvd.dao.interfaces;

import com.solvd.model.OnlineShopesModel;

import java.util.List;

public interface IOnlineShopesDAO {
    public List<OnlineShopesModel> getAllOnlineShopes();

    public OnlineShopesModel getOnlineShop(int id);

    public List<OnlineShopesModel> getAllOnlineShopesMyBatis();
}
