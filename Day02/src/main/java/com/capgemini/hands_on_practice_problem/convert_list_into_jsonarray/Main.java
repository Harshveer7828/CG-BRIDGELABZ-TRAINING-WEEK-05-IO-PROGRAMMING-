package com.capgemini.hands_on_practice_problem.convert_list_into_jsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Person> people = Arrays.asList(
                    new Person("Harsh Veer Singh", "harshveer7828@gmail.com", 30, "Engineering"),
                    new Person("Om Tiwari", "omtiwari@gmail.com", 28, "Finance"),
                    new Person("Aryan Gupta", "aryangupta@gmail.com", 26, "Marketing")
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(people);

            // Print the json array
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

