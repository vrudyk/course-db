package com.solvd.dao.interfaces;

import com.solvd.model.ProductsModel;

import java.util.List;

public interface IProductsDAO {
    List<ProductsModel> getAllProducts();

    List<ProductsModel> getAllProduct();
}
