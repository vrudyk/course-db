package com.solvd.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

public class PositionModel {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    public PositionModel() {
    }

    public PositionModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PositionModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}