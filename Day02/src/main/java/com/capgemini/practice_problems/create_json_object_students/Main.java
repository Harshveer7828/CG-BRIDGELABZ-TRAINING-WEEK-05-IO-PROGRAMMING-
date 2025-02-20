package com.capgemini.practice_problems.create_json_object_students;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JSONObject student1 = new JSONObject();
        JSONObject student2 = new JSONObject();
        JSONArray subjectArray = new JSONArray(Arrays.asList("Maths","Physics","Chemistry"));
        JSONArray resultArray = new JSONArray();

        student1.put("name" , "Harsh veer singh");
        student1.put("age" , 22);
        student1.put("subjects",subjectArray);

        student2.put("name","Om Tiwari");
        student2.put("age",22);
        student2.put("subjects",subjectArray);

        resultArray.put(student2);
        resultArray.put(student1);

        System.out.println(resultArray.toString(4));
    }
}
