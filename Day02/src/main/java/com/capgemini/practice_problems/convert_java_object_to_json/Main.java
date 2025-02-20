package com.capgemini.practice_problems.convert_java_object_to_json;

import org.json.JSONArray;

public class Main {
    public static void main(String[] args) {
        JSONArray arrayOfObject = new JSONArray();
        Car hyundai = new Car("Aura",2024,"Black",2500000);
        Car suv = new Car("Bolero",2024,"White",1800000);

        ConvertJavaObject.convertToJson(arrayOfObject,hyundai);
        ConvertJavaObject.convertToJson(arrayOfObject,suv);

        System.out.println(arrayOfObject.toString(4));
    }
}
