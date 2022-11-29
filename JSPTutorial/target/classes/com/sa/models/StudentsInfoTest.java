package com.sa.models;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author : Chittebabu
 * Objective : JUnit5 Test for StudentsInfo class
 * Date : 28/11/2022
 */

class StudentsInfoTest {
    StudentsInfo si;

    @BeforeAll
    public static void initAll() {
        System.out.println("Setup complete...");
    }

    @Test
    public void checkFirstName() {
        si = new StudentsInfo();
        si.setFirstName("Jack");
        assertFalse(si.getFirstName().isEmpty());
    }

    @Test
    public void checkLastName() {
        si = new StudentsInfo();
        si.setLastName("Smith");
        assertTrue(si.getLastName().isEmpty());
    }

    @Test
    public void checkGender() {
        si = new StudentsInfo();
        si.setGender("Male");
        assertFalse(si.getGender().isBlank());
    }

    @Test
    public void checkPhoneNumber() {
        si = new StudentsInfo();
        si.setPhoneNumber("123456789");
        assertFalse(si.getPhoneNumber().isEmpty());
    }

    @Test
    public void checkCourseSelected() {
        si = new StudentsInfo();
        si.setCourseSelected("Programming with Java");
        assertFalse(si.getCourseSelected().isEmpty());
    }

    @AfterAll
    public static void shutDown() {
        System.out.println("Shutting down...");
        System.out.println("Shutdown completed");
    }
}