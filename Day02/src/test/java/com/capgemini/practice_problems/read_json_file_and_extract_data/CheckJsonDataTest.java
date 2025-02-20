package com.capgemini.practice_problems.read_json_file_and_extract_data;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckJsonDataTest {
    @Test

    void checkName() throws IOException {
        String filePath = "src/test/java/com/capgemini/practice_problems/read_json_file_and_extract_data/demo.json";
        List<User> list = ExtractInformation.extractData(filePath);

        assertEquals("Harsh veer singh",list.get(0).getName());
        assertEquals("harshveer7828@gmail.com",list.get(0).getEmail());
        assertEquals("Om tiwari",list.get(1).getName());
        assertEquals("harshveerofficial8@gmail.com",list.get(1).getEmail());
    }
}
