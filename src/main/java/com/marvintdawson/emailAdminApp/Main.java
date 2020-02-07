package com.marvintdawson.emailAdminApp;

import com.marvintdawson.emailAdminApp.email.Email;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Email em1 = new Email("John", "Smith");
        System.out.println(em1);
        Email em2 = new Email("Jane", "Smith","jsmith@test.com");
        System.out.println(em2);
    }
}
