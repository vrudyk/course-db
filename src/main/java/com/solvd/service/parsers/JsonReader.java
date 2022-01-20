package com.solvd.service.parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.model.Chair;
import com.solvd.model.Teacher;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonReader {

    private static final Logger LOGGER = Logger.getLogger(JsonReader.class);

    public static void jsonReaderChair() {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Chair chair = objectMapper.readValue(new File("src/main/resources/json/chair.json"), Chair.class);
            LOGGER.info(chair);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonReaderTeacher () {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Teacher teacher = objectMapper.readValue(new File("src/main/resources/json/teacher.json"), Teacher.class);
            LOGGER.info(teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
