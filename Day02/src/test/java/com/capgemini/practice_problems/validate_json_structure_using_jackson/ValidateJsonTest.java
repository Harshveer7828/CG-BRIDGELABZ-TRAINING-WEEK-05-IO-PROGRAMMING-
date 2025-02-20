package com.capgemini.practice_problems.validate_json_structure_using_jackson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateJsonTest {
    @Test
    void checkValidType(){
        String filePath = "src/test/java/com/capgemini/practice_problems/validate_json_structure_using_jackson/schema.json";
        assertTrue(ValidateJSON.isValidJson(filePath));
    }
}
