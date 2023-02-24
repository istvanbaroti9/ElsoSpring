package com.elsospring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Letting use the Person values from property files
@ConfigurationProperties(prefix = "person")

@Component
public class Person {

    @Override
    public String toString() {
        return "Person{" +
                "selectedProfile='" + selectedProfile + '\'' +
                ", message='" + message + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getSelectedProfile() {
        return selectedProfile;
    }

    public void setSelectedProfile(String selectedProfile) {
        this.selectedProfile = selectedProfile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    //Using profiles
    @Value("${spring.profiles.active}")
    private String selectedProfile;

    @Value("${msg}")
    private String message;

    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
