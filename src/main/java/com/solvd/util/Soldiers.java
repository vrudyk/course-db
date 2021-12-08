package com.solvd.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Arrays;

public class Soldiers {
    private static final Logger LOGGER = Logger.getLogger(Soldiers.class);

    private int idSoldier;
    private String soldierName;
    private String soldierlastName;
    private int soldierAge;

    public Soldiers() {
    }

    public Soldiers(int idSoldier, String soldierName, String soldierlastName, int soldierAge) {
        this.idSoldier = idSoldier;
        this.soldierName = soldierName;
        this.soldierlastName = soldierlastName;
        this.soldierAge = soldierAge;
    }

    public int getIdSoldier() {
        return idSoldier;
    }

    public void setIdSoldier(int idSoldier) {
        this.idSoldier = idSoldier;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public String getSoldierlastName() {
        return soldierlastName;
    }

    public void setSoldierlastName(String soldierlastName) {
        this.soldierlastName = soldierlastName;
    }

    public int getSoldierAge() {
        return soldierAge;
    }

    public void setSoldierAge(int soldierAge) {
        this.soldierAge = soldierAge;
    }

    @Override
    public String toString() {
        return "Soldiers{" +
                "idSoldier=" + idSoldier +
                ", soldierName='" + soldierName + '\'' +
                ", soldierlastName='" + soldierlastName + '\'' +
                ", soldierAge=" + soldierAge +
                '}';
    }

    public static void arrayParse(Soldiers soldiers) throws IOException {
        try {
            ObjectMapper soldiermap = new ObjectMapper();
            ObjectNode soldier1 = soldiermap.createObjectNode();
            soldier1.put("idSoldier", 1);
            soldier1.put("soldierName", "Alex");
            soldier1.put("soldierlastName", "Man");
            soldier1.put("soldierAge", 22);

            ObjectNode soldier2 = soldiermap.createObjectNode();
            soldier2.put("idSoldier", 2);
            soldier2.put("soldierName", "Cortney");
            soldier2.put("soldierlastName", "Cox");
            soldier1.put("soldierAge", 20);
            ArrayNode arrayNode = soldiermap.createArrayNode();
            arrayNode.addAll(Arrays.asList(soldier1, soldier2));
            String newSoldiers = soldiermap.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);
            LOGGER.info(newSoldiers);

        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }
    }
}
