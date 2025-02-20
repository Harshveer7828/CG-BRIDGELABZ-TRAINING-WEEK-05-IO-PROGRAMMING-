package com.capgemini.hands_on_practice_problem.convert_list_into_jsonarray;

public class Person {
    private String name;
    private String email;
    private int age;
    private String department;

    // Constructor
    public Person(String name, String email, int age, String department) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.department = department;
    }

    // Getters (Needed for Jackson)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
