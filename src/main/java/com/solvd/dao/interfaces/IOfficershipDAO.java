package com.solvd.dao.interfaces;

import com.solvd.model.OfficershipModel;
import java.util.List;

public interface IOfficershipDAO {
    List<OfficershipModel> getAllOfficerships();
    List<OfficershipModel> getAllOfficers();
}

