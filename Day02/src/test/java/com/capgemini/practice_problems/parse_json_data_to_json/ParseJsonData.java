package com.capgemini.practice_problems.parse_json_data_to_json;

import com.capgemini.practice_problems.parse_json_data_and_filter.Person;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseJsonData {
    @Test
    void parseCheck(){
        try {
                ObjectMapper objectMapper = new ObjectMapper();
                List<Person> people = objectMapper.readValue(
                        new File("src/test/java/com/capgemini/practice_problems/parse_json_data_to_json/schema.json"),
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

                // if the length of the filteredPeople
                assertEquals(2,filteredPeople.size());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
