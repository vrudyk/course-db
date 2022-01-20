package com.solvd.service.parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.model.Chair;
import com.solvd.model.Teacher;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JsonWriter {
    private static final Logger LOGGER = Logger.getLogger(JsonWriter.class);

    public static void jsonWriterChair (Chair chair) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/json/chair.json"), chair);
            String result = objectMapper.writeValueAsString(chair);
            LOGGER.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonWriterTeacher (Teacher teacher) {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("src/main/resources/json/teacher.json"), teacher);
            String result = objectMapper.writeValueAsString(teacher);
            LOGGER.info(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
