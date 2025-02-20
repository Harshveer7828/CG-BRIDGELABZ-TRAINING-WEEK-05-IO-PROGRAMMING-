package com.capgemini.practice_problems.validate_json_structure_using_jackson;

import static com.capgemini.practice_problems.validate_json_structure_using_jackson.ValidateJSON.isValidJson;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/java/com/capgemini/practice_problems/validate_json_structure_using_jackson/schema.json";
        if (isValidJson(filePath)) {
            System.out.println("Valid JSON structure!");
        } else {
            System.out.println("Invalid JSON structure!");
        }
    }
}
