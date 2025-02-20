package com.capgemini.practice_problems.create_java_object_to_json;

import com.capgemini.practice_problems.convert_java_object_to_json.Car;
import com.capgemini.practice_problems.convert_java_object_to_json.ConvertJavaObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertToJsonTest {
    @Test
    void testJsonArray(){
        JSONArray arr = new JSONArray();
        Car hyundai = new Car("Aura",2024,"Black",2500000);

        ConvertJavaObject.convertToJson(arr,hyundai);

        JSONObject jsonObject = arr.getJSONObject(0);
        assertEquals(hyundai.getName(),jsonObject.getString("name"));

    }
}
