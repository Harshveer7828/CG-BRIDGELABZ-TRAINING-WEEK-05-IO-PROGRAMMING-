package com.capgemini.practice_problems.parse_json_data_and_filter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<Person> people = objectMapper.readValue(
                    new File("src/main/java/com/capgemini/practice_problems/parse_json_data_and_filter/schema.json"),
                    new TypeReference<List<Person>>() {
                    }
            );
            List<Person> filteredPeople = new ArrayList<>();
            for (Person person : people) {
                // Check if the person's age is greater than 25
                if (person.getAge() > 25) {
                    filteredPeople.add(person);
                }
            }
            // Print filtered results
            System.out.println("People with age > 25:");
            for (Person person : filteredPeople) {
                System.out.println(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
