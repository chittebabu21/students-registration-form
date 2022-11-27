package com.sa.models;

/**
 * Author : Chittebabu
 * Objective : POJO for Students table --> MySQL
 * Date : 25/11/2022
 */

public class StudentsInfo {
    private int studentId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String courseSelected;

    // constructor with all declarations
    public StudentsInfo(int studentId, String firstName, String lastName, String gender, String address, String phoneNumber, String courseSelected) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.courseSelected = courseSelected;
    }

    // empty constructor
    public StudentsInfo() {
    }

    // getter and setter methods
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourseSelected() {
        return courseSelected;
    }

    public void setCourseSelected(String courseSelected) {
        this.courseSelected = courseSelected;
    }

    @Override
    public String toString() {
        return "StudentsInfo{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", courseSelected='" + courseSelected + '\'' +
                '}';
    }
}
