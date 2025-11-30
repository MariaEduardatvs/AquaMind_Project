/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Author Piotr Konkol
*/
//Purpose of the file is to track the current user
// this is to allow the app to call upon this to give appropriate responses
/*
what it should start to contain
constructor
getters + setters

Admin user?
*/

package com.mycompany.aquamind.user;

public class user {

    private String username;
    private String email;
    private String password;

    public user(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password; 
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
