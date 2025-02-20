package com.capgemini.practice_problems.parse_json_data_and_filter;

public class Person {
    private String name;
    private String email;
    private int age;
    private String city;

    // Constructor
    public Person() {}

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', email='" + email + "', age=" + age + ", city='" + city + "'}";
    }
}
