package com.capgemini.hands_on_practice_problem.convert_list_into_jsonarray;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class CheckConversionIntoJsonArray {

    @Test
    public void testConvertListToJsonArray() throws JsonProcessingException {
        // Step 1: Create a list of Person objects
        List<Person> people = Arrays.asList(
                new Person("Harsh Veer Singh", "harshveer7828@gmail.com", 30, "Engineering")
        );

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonArray = objectMapper.writeValueAsString(people);

        String expectedJson = "[{\"name\":\"Harsh Veer Singh\",\"email\":\"harshveer7828@gmail.com\",\"age\":30,\"department\":\"Engineering\"}]";

        // Step 4: Assertion - Verify that the generated JSON matches the expected JSON
        assertEquals(expectedJson, jsonArray);
    }
}
