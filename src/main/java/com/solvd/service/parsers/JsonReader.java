package com.solvd.service.parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.model.Passport;
import com.solvd.model.Salary;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class JsonReader {

    private static final Logger LOGGER = Logger.getLogger(JsonReader.class);

    public static void jsonReaderSalary() {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Salary salary = objectMapper.readValue(new File("src/main/resources/salary.json"), Salary.class);
            String result = objectMapper.writeValueAsString(salary);
            LOGGER.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonReaderPassport () {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Passport passport = objectMapper.readValue(new File("src/main/resources/passport.json"), Passport.class);
            LOGGER.info(passport);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
