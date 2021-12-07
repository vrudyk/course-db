package com.solvd.dao.interfaces;

import com.solvd.model.PassportModel;

import java.util.List;

public interface IPassportsDAO {
    List<PassportModel> getAllPassports();

    List<PassportModel> getAllPassport();
}
