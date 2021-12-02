package com.solvd.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Requestdate {
    private static final Logger LOGGER = Logger.getLogger(Requestdate.class);
    private String firstName;
    private String lastName;
    private int age;
    Date birthDate;

    public Requestdate (String firstName, String lastName, int age, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDate = birthDate;
    }

    public Requestdate() {
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }


    public static void parDate(Requestdate requestDate) throws IOException, ParseException {
        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat pasteDate = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        pasteDate.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date dater = pasteDate.parse("30-11-2021 08:15");
        Requestdate requester = new Requestdate("Mike", "Call", 49, dater);
        objectMapper.setDateFormat(pasteDate);
        objectMapper.writeValue(new File("src/main/resources/files/emptydate.json"), requester);
        LOGGER.info(requester);
    }

}
