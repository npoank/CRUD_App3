package org.andrew.crud.models;


import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name must not be empty")
    @Size(min = 2, max = 30, message = "Invalid name size (2-30 symbols)")
    private String name;

    @Min(value = 0, message = "Minimal age 0")
    private int age;

    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Invalid email")
    private String email;

    // Country, City, postcode (6 digits) -- valid address
    // Belarus, Minsk, 220125
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Form for address: Country, City, postcode (6 digits)")
    private String address;

    public Person() {
    }

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
