package com.solvd.util.parsers;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.solvd.model.ClientModel;
import com.solvd.model.OrdersModel;
import com.solvd.model.PositionModel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class JsonToJava {
    private static final String format = "yyyy-MM-dd";
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        OrdersModel[] ordersModelList = mapper.readValue(new File("src/main/resources/orders.json"),
                OrdersModel[].class);
        System.out.println("Orders Array ->");
        for (OrdersModel ordersModel : ordersModelList) {
            System.out.println(ordersModel);
        }
    }
}