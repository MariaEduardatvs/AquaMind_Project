/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Author Piotr Konkol
*/
// This is going to be the main "application class" for the auth section
/*
createAccount
login
passwordHash
userExistence : bool
loadUser
searchUser(String username)
deleteUser(String username)
displayAllUsers()
addAttempt(LoginAttempt x)
displayAllAttempts()
searchAttempts(String username)
*/ 
// just an early prototype to fit Checkpt 2
package com.mycompany.aquamind.auth;
import com.mycompany.aquamind.user.user;

public class AuthService {

    private user currentUser;  // store whoever is logged in
    public boolean login(String username, String password) {
    // no need for logic yet, will just always be correct i think
        currentUser = new user(username, "placeholder@mail.ie", password);
        return true;
    }

 
    public boolean register(String username, String password, String email) {
        // Once again no logic is actually required yet
        currentUser = new user(username, email, password);
        return true; 
    }

    public void setGuest() {
        System.out.println("AUTH SERVICE: setGuest() called");
        currentUser = new user("Guest", "none", "none");
    }

    public user getCurrentUser() {
        return currentUser;
    }
}
