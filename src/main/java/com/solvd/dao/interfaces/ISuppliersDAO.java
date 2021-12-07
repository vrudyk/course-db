package com.solvd.dao.interfaces;

import com.solvd.model.SuppliersModel;

import java.util.List;

public interface ISuppliersDAO {

    public List<SuppliersModel> getAllSuppliers();

    public List<SuppliersModel> getAllSuppliersMyBatis();
}
