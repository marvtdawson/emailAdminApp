package com.marvintdawson.emailAdminApp.email;

public class EmailService {

    private static final String EMAIL = "marvintdawson@yahoo.com";
    private static final String ALTERNATIVE_EMAIL = "marvintdawson@gmail.com";

    public String createEmail() {
        System.out.println("Creating Email");
        return EMAIL;
    }

    public static void updateEmail() {
        System.out.println("Updating Email Address");
    }

    public String createAlternativeEmail() {
        System.out.println("Create Alternative Email Address");
        return ALTERNATIVE_EMAIL;
    }

    public static void forwardEmail(){
        System.out.println("Forwarding Emails");
    }

    public static void deleteEmail() {
        System.out.println("Deleting Email Address");
    }
}
