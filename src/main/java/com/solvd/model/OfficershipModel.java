package com.solvd.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

@XmlRootElement(name = "officership")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfficershipModel implements Serializable {
    private static final Logger LOGGER = Logger.getLogger(OfficershipModel.class);
    private static final long serialVersionUID = 1L;
    final static ObjectMapper officer = new ObjectMapper();
    private int idOfficership;
    private String firstName;
    private String lastName;
    private int age;
    private String rankk;
    private String gender;
    private int militaryBaseid;

    public OfficershipModel(int idOfficership, String firstName, String lastName, int age, String rankk, String gender, int militaryBaseid) {
        this.idOfficership = idOfficership;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rankk = rankk;
        this.gender = gender;
        this.militaryBaseid = militaryBaseid;


    }

    public OfficershipModel() {
    }

    public int getIdOfficership() {
        return idOfficership;
    }

    public void setIdOfficership(int idOfficership) {
        this.idOfficership = idOfficership;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRankk() {
        return rankk;
    }

    public void setRankk(String rankk) {
        this.rankk = rankk;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMilitaryBaseid() {
        return militaryBaseid;
    }

    public void setMilitaryBaseid(int militaryBaseid) {
        this.militaryBaseid = militaryBaseid;
    }

    @Override
    public String toString() {
        return "OfficershipModel{" +
                "idOfficership=" + idOfficership +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", rankk='" + rankk + '\'' +
                ", gender='" + gender + '\'' +
                ", militaryBaseid=" + militaryBaseid +
                '}';
    }

    public static void jaxbParser(OfficershipModel officership) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(OfficershipModel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.marshal(officership, new File("src/main/resources/officership.xml"));

        } catch (JAXBException e) {

            e.printStackTrace();
        }
    }

    public static void jsonParse(OfficershipModel officership) throws IOException {
        OfficershipModel officershiper = new OfficershipModel(1, "Reebook", "Nike", 33, "soldier", "male", 2);
        officer.writeValue(new File("src/main/resources/officership.json"), officershiper);
    }

    public static void parseJs(OfficershipModel officership2) throws IOException {
        try {
            String officerJson = "{\"idOfficership\": 1,\"firstName\": \"Reebook\", \"lastName\": \"Nike\", \"age\":33, \"rankk\":\"soldier\", \"gender\": \"male\", \"militaryBaseid\": 2}";
            OfficershipModel officers = officer.readValue((officerJson), OfficershipModel.class);
            JsonNode jsonNode = officer.readTree(officerJson);
            String firstName = jsonNode.get("firstName").asText();
            LOGGER.info(officers);
            LOGGER.info(officers.getFirstName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }
    }

    public static void parseArrayJs(OfficershipModel officership3) throws IOException {
        try {
            List<OfficershipModel> officerlist = officer.readValue(new File("src/main/resources/files/officerships.json"), new TypeReference<List<OfficershipModel>>() {
            });
            LOGGER.info(officerlist);
        } catch (JsonProcessingException e) {
            e.printStackTrace();

        }
    }

}


