package com.ifr.informationformregistration.pojo;

import java.util.UUID;

// This file is made by EmJey
// Project: Information Form Registration
// FileName: UserInformation
// Date: 2023/06/13
// Email: emjeydev@gmail.com
// Github: emjeydev

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private int nationalCode;
    private int phoneNumber;
    private String address;
    private String maritalStatus;

    public User() {
        this.id = UUID.randomUUID();
    }


//    Getters And Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
