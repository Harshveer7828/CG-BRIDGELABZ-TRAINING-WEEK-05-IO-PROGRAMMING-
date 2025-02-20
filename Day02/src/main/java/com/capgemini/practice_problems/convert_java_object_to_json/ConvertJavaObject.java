package com.capgemini.practice_problems.convert_java_object_to_json;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertJavaObject {
    // Method to convert the java object into json
    public static void convertToJson(JSONArray result, Car car) {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",car.getName());
        jsonObject.put("color",car.getColor());
        jsonObject.put("price",car.getPrice());
        jsonObject.put("model",car.getModel());

        result.put(jsonObject);

    }
}
