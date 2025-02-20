package com.capgemini.practice_problems.read_json_file_and_extract_data;

public class User {
    private String name;
    private String email;
    private int salary;
    private String department;

    User(){}

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}
