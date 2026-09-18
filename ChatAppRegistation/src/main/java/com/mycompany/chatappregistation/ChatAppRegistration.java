package com.mycompany.chatappregistation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Student
 */

import java.util.Scanner;

public class ChatAppRegistration {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Scanner for ChatAppLogin
        login login = new login();
        
        //Registration Welcome Message
        System.out.println("-----Register-----");
        
        //User first name
        System.out.print("Please enter your first name: ");
        String firstName = input.nextLine();
        
        //User last name
        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();
        
        //Username Validation
        System.out.print("Please enter a username which is no more than 5 characters long and contains an underscore: ");
        String username = input.nextLine();

        //Password Validation
        System.out.print("Please enter a password which is at least eight characters long and contains a capital letter, a number and a special character: ");
        String password = input.nextLine();

        //Cellphone Number Validation
        System.out.print("Enter your cellphone number: ");
        String cellphoneNumber = input.nextLine();

        String result = login.registeredUser(username, password, cellphoneNumber);
        System.out.println(result);

        //login
         if (result.contains("successfully")) {
            System.out.println("\n--------Login-------");
            System.out.println("Enter your username to login: ");
            String loginUsername = input.nextLine();
            System.out.println("Enter password to login: ");
            String loginPassword = input.nextLine();
            System.out.println(login.returnLoginStatus(firstName, lastName, username, password, loginUsername, loginPassword));
         
}
        
    input.close();
                       
    }
}
