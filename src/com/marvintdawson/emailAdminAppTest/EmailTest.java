package com.marvintdawson.emailAdminAppTest;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    // Test Set Up
    @BeforeAll
    static void beforeAll() {

        System.out.println("Entering Email Test");
    }

    @BeforeEach
    static void beforeEach() {

        System.out.println("Print this before each test");
    }


    @Test
    @DisplayName("Email Class Exist")
    void emilClassExist() {
        getClass();
    }

    // Test Tear Down
    @AfterEach
    static void afterEach() {}

    @AfterAll
    static void afterAll() {}

}