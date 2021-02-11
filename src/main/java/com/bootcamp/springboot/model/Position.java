package com.bootcamp.springboot.model;

public enum Position {
    PROFESSIONAL_STAFF("Professional Staff"),
    MARKETING_MANAGER("Marketing Manager"),
    RECEPTIONIST("Receptionist"),
    OFFICE_MANAGER("Office Manager"),
    OPERATIONS_MANAGER("Operations Manager");

    private String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
