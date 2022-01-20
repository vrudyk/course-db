package com.solvd.dao.interfaces;

import com.solvd.model.Group;

import java.util.List;

public interface IGroupDAO {

    List<Group> getAllGroups();

    void deleteGroup(int id);

    void insertIntoGroup(Group group);

    void updateGroup(Group group);
}