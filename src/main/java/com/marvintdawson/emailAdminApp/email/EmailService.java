package com.marvintdawson.emailAdminApp.email;

public class EmailService {

    private static final String EMAIL = "marvintdawson@yahoo.com";
    private static final String ALTERNATIVE_EMAIL = "marvintdawson@gmail.com";
    private static final Boolean FORWARD_EMAIL = true;
    private static final Boolean DELETE_EMAIL = false;


    public String checkForExistingEmail() {
        System.out.println("Check For Existing Email");
        return EMAIL;
    }

    public String updateEmail() {
        System.out.println("Updating Email Address");
        return "Saved";
    }

    public String createAlternativeEmail() {
        System.out.println("Create Alternative Email Address");
        return ALTERNATIVE_EMAIL;
    }

    public boolean forwardEmail(){
        System.out.println("Forwarding Emails");
        return FORWARD_EMAIL; // return true
    }

    public boolean deleteEmail() {
        System.out.println("Deleting Email Address");
        return DELETE_EMAIL;
    }
}
