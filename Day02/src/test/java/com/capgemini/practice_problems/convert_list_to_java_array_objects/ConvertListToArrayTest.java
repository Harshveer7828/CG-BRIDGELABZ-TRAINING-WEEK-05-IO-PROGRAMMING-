package com.capgemini.practice_problems.convert_list_to_java_array_objects;

import com.capgemini.practice_problems.convert_a_list_to_java_array_objects.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConvertListToArrayTest {
    @Test
    void checkConversion() throws JsonProcessingException {
        List<User> users = new ArrayList<>();
        users.add(new User("Harsh Veer Singh", "harshveer7828@gmail.com", "Engineering", 75000));
        users.add(new User("Om Tiwari", "omtiwari123@gmail.com", "HR", 65000));
        users.add(new User("Aryan Gupta", "aryangupta@gmail.com", "IT", 85000));

        // Convert list to JSON array
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonArray = objectMapper.writeValueAsString(users);

        assertTrue(jsonArray.contains("Harsh Veer Singh"));
        assertTrue(jsonArray.contains("harshveer7828@gmail.com"));
        assertTrue(jsonArray.contains("65000"));
    }
}
