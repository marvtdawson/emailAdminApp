package com.marvintdawson.emailAdminApp.email;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Run Email Service Test -")
class EmailServiceTest {

    EmailService emailService;

    @BeforeEach
    void setUp() {
        emailService = new EmailService();
        System.out.println("Before Each Test - ");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Should Test If Email Was Created - ")
    void createEmail() {

        // Arrange
        String email = "marvintdawson@yahoo.com";

        // Act
        String emailChecker = this.emailService.checkForExistingEmail();

        // Assert
        assertEquals(emailChecker, email);
    }

    @Test
    @DisplayName("Should Test If Existing Email Was Updated...")
    void updateEmail() {

        // arrange
        String emailStatus = "Saved";

        // act
        String emailUpdateChecker = this.emailService.updateEmail();

        // assert
        assertEquals(emailStatus, emailUpdateChecker);
    }

    @Test
    @DisplayName("Should Test If Alternative Email Was Created...")
    void createAlternativeEmail() {

        // arrange
        String checkAlternativeEmail = "marvintdawson@gmail.com";

        // act
        String testAlternativeEmail = this.emailService.createAlternativeEmail();

        // assert
        assertEquals(testAlternativeEmail, checkAlternativeEmail);
    }

    @Test
    @DisplayName("Should Test If Emails Are Forward...")
    void forwardEmail() {
        // arrange
        Boolean forwardEmailStatus = false;

        // act
        Boolean testEmailStatus = this.emailService.forwardEmail();

        // assert
        assertNotEquals(forwardEmailStatus, testEmailStatus);
    }

    @Test
    @DisplayName("Should Test If Email Was Deleted...")
    void deleteEmail() {

        // arrange
        Boolean deleteEmailStatus = true;

        // act
        Boolean testDeleteEmailStatus = this.emailService.deleteEmail();

        // assert
        assertNotEquals(deleteEmailStatus, testDeleteEmailStatus);
    }
}