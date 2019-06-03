package com.fundatec.AggregatorAPI.domain;

import java.util.ArrayList;
import java.util.List;

public class Secret {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Phone> phoneNumber;

    public Secret() {
        phoneNumber = new ArrayList<>();
    }

    public Secret(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        phoneNumber = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public List<Phone> getPhoneNumber() {
        return phoneNumber;
    }
}
