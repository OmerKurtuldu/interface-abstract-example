package com.demo.entities;

import java.time.LocalDateTime;

public class Customer implements Entity {
    private int id;
    private String name;
    private String surName;
    private Integer DateOfBirth;
    private String NationalityId;

    public Customer(int id, String name, String surName, Integer dateOfBirth, String nationalityId) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
