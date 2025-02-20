package com.capgemini.practice_problems.merge_two_json_objects;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject jsonObject1 = new JSONObject();
        JSONObject jsonObject2 = new JSONObject();

        jsonObject1.put("name", "Harsh veer singh");
        jsonObject1.put("email", "harshveer7828@gmail.com");

        jsonObject2.put("phone_number", "7828159961");
        jsonObject2.put("city", "Bhopal");

        for (String key : jsonObject2.keySet()) {
            jsonObject1.put(key, jsonObject2.get(key));
        }

        System.out.println(jsonObject1.toString(4)); // Pretty print JSON
    }
}
