package com.solvd.util.parsers;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.solvd.model.EmployeeModel;
import com.solvd.model.EquipmentModel;
import com.solvd.model.PositionModel;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class JavaToJson {
    public static void objectToJson(PositionModel positionModel) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File("src/main/resources/json/positions.json"), positionModel);
        } catch (StreamWriteException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

