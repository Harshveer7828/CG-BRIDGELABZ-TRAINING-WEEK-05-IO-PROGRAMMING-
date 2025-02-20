package com.capgemini.practice_problems.convert_a_list_to_java_array_objects;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Creating a list of User objects
            List<User> users = new ArrayList<>();
            users.add(new User("Harsh Veer Singh", "harshveer7828@gmail.com", "Engineering", 75000));
            users.add(new User("Om Tiwari", "omtiwari123@gmail.com", "HR", 65000));
            users.add(new User("Aryan Gupta", "aryangupta@gmail.com", "IT", 85000));

            // Convert list to JSON array
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writeValueAsString(users);

            // Print JSON array
            for (String user : jsonArray.split("}")) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
