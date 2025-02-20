package com.capgemini.practice_problems.read_json_file_and_extract_data;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExtractInformation {
    // Method to extract the information from the JSON file
    public static List<User> extractData(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Convert JSON file into User object
        List<User> users = objectMapper.readValue(new File(filePath), new TypeReference<List<User>>(){});

        for (User user : users) {
            System.out.println("Name: " + user.getName());
            System.out.println("Email: " + user.getEmail());
            System.out.println("----------------------------");
        }

        return users;
    }
}
