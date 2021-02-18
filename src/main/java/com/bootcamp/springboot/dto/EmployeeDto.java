package com.bootcamp.springboot.dto;

import com.bootcamp.springboot.model.Position;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class EmployeeDto {

    @NotNull
    private Long employeeId;

    @NotNull
    private LocalDate birthDay;

    @NotNull
    private Position position;

    @NotNull
    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotNull
    @NotBlank(message = "Middle Name is required")
    private String middleName;

    @NotNull
    @NotBlank(message = "Last Name is required")
    private String lastName;

    private String street;

    private String barangay;

    private String city;

    private int zipCode;

    public EmployeeDto() {
    }

    public EmployeeDto(Long employeeId, LocalDate birthDay, Position position, String firstName, String middleName, String lastName, String street, String barangay, String city, int zipCode) {
        this.employeeId = employeeId;
        this.birthDay = birthDay;
        this.position = position;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", birthDay=" + birthDay +
                ", position=" + position +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", barangay='" + barangay + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
