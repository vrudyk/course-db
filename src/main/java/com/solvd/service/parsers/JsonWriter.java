package com.solvd.service.parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.model.Passport;
import com.solvd.model.Salary;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JsonWriter {

    private static final Logger LOGGER = Logger.getLogger(JsonWriter.class);

    public static void jsonWriterSalary (Salary salary) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/salary.json"), salary);
            String result = objectMapper.writeValueAsString(salary);
            LOGGER.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonWriterPassport (Passport passport) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/passport.json"), passport);
            String result = objectMapper.writeValueAsString(passport);
            LOGGER.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
