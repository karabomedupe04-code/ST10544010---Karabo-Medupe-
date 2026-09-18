/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatappregistation;

/**
 *
 * @author Student
 */
public class login {
    
public boolean checkUsername(String username) {
    return username.contains("_") && username.length() <=5;
}

//Password Validation
public boolean checkPasswordComplexity(String password) {
    
        boolean hasCapital = false;
        boolean hasSmall = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasCapital = true;
            } else if (Character.isLowerCase(character)) {
                hasSmall = true;
            } else if (Character.isDigit(character)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(character)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8 && hasCapital
                && hasSmall && hasNumber && hasSpecial;
    }

//Cellphone Number Validation
public boolean checkCellphoneNumber(String cellphone) {
        if (!cellphone.startsWith("+27") && cellphone.length() !=12) {
            return false;
        }

        for (int i = 3; i < cellphone.length(); i++) {
            char character = cellphone.charAt(i);

            if (!Character.isDigit(character)) {
                return false;
            }
        }

        return true;
    }


//Registered User
String registeredUser(String username , String password, String cellphone){
    
   if (checkUsername(username)) {
        System.out.println("Username succesfully captured.");
     } else {
        System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters in length.");
     }
   
    if (checkCellphoneNumber(cellphone)) {
        System.out.println("Cellphone number successfully added.");
    } else {
        System.out.println("Cellphone number incorrectly formatted or does not contain an international code.");
    }

    if (checkPasswordComplexity(password)) {
    System.out.println("Password successfully entered.");
} else {
    System.out.println("Password entered incorrectly; please ensure that your password that is at least eight characters long, contains a capital leter, a number, and a special character.");
}
        
    if(!checkUsername(username) && checkPasswordComplexity(password) && checkCellphoneNumber(cellphone)){
        return "failed to register";
    }
    return "User successfully registered";
}


//loginUser
public boolean loginUser(String registeredUser, String registeredPassword, String loginUsername, String loginPassword) {
        return registeredUser.equals(loginUsername) && registeredPassword.equals(loginPassword);
    }
    
  
    //loginStatus
    public String returnLoginStatus(String firstName,  String lastName ,String registeredUser, String registeredPassword, String loginUsername, String loginPassword) {
        if (loginUser(registeredUser, registeredPassword, loginUsername, loginPassword)) {
            return "Welcome " + firstName + " " + lastName + ", it is great to see you again: ";
        } else {
            return "Username or password incorrect, please try again.";
        }
            
    }
}

    
    


