package com.solvd.model;

import java.util.Objects;

public class Group {
    private int id;
    private int curator;
    private int groupNumber;
    private int chair_id;

    public int getId() {
        return id;
    }

    public int getCurator() {
        return curator;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getChair_id() {
        return chair_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurator(int curator) {
        this.curator = curator;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setChair_id(int chair_id) {
        this.chair_id = chair_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return getId() == group.getId() &&
                getCurator() == group.getCurator() &&
                getGroupNumber() == group.getGroupNumber() &&
                getChair_id() == group.getChair_id();
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", curator=" + curator +
                ", groupNumber=" + groupNumber +
                ", chair_id=" + chair_id +
                '}';
    }
}
