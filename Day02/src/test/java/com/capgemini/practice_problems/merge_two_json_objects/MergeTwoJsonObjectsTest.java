package com.capgemini.practice_problems.merge_two_json_objects;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeTwoJsonObjectsTest {
    @Test
    void checkFile(){
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();

        jsonObject1.put("name", "Harsh veer singh");
        jsonObject1.put("email", "harshveer7828@gmail.com");

        assertEquals(2,jsonObject1.length()); // length is 2


        jsonObject2.put("phone_number", "7828159961");
        jsonObject2.put("city", "Bhopal");

        // add the object 2 keys to first
        for (String key : jsonObject2.keySet()) {
            jsonObject1.put(key, jsonObject2.get(key));
        }

        assertEquals(4,jsonObject1.length()); // Initially the length is 2 but now it is updated to 4
    }
}
