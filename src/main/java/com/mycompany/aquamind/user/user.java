/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Author Piotr Konkol
*/


package com.mycompany.aquamind.user;

public class user {
    private String username;
    private String passwordHash;  // this is going to be hashed by authService as to not keep a plain text file user details; this will then load it and will be able
                                   // to return it to the calling class such as AuthService.
    private String email;

    public user(String username, String passwordHash, String email) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getEmail() {
        return email;
    }

    public static user loadUser(String username) {
// return user data
    }
}