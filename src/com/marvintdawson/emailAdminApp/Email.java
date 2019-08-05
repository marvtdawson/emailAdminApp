package com.marvintdawson.emailAdminApp;

public class Email {
    String firstName;
    String lastName;
    String email;
    String department;
    String password;
    int mailBoxCapacity;
    String alternateEmail;

    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
