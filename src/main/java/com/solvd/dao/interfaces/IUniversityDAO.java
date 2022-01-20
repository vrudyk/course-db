package com.solvd.dao.interfaces;

import com.solvd.model.UniversityModel;
import com.solvd.util.enums.Acreditation;

import java.util.List;

public interface IUniversityDAO {

    List<UniversityModel> getAll();

    List<UniversityModel> getAllUniversities();

    void deleteUniversityById(int idUniversity);

    void insertIntoUniversity(int idUniversity, String Name, Acreditation acreditation);

    void addUniversity(UniversityModel universityModel);
}
