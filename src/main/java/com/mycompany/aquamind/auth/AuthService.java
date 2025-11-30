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
import java.io.*;
import java.util.ArrayList;

public class AuthService {

    private ArrayList<user> users = new ArrayList<>();
    private user currentUser;

    public AuthService() {
        loadUsers();
    }

   //Goes into csv file so that the users are ready
    private void loadUsers() {
        File f = new File("users.csv");
        if (!f.exists()) {
            return; // no file yet, move out
        }
           //create the file
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    users.add(new user(parts[0], parts[1], parts[2]));
                }
            }
            //exception handling - this will let us know what failed if it does
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //add user to file
    private void saveUsers() { // buffered writer, better than filewriter (writes all at once)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.csv"))) {
            for (user u : users) {
                bw.write(u.getUsername() + "," + u.getEmail() + "," + u.getPassword());
                bw.newLine();
            }
            //exception handling - this will let us know what failed if it does
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   //part of the saveUser process, checks the possibility of registering user
    public boolean register(String username, String password, String email) {

        // check if username exists already
        for (user u : users) {
            if (u.getUsername().equals(username)) {
                return false; // username taken
            }
        }

        user newUser = new user(username, email, password);
        users.add(newUser);
        saveUsers();         // write to file  
        currentUser = newUser;

        return true;
    }

    // using the info they gave us, check if username and password is correct
    public boolean login(String username, String password) {
        for (user u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                currentUser = u;
                return true;
            }
        }
        return false;
    }

    // guest login
    public void setGuest() {
        currentUser = new user("Guest", "none", "none");
    }

    public user getCurrentUser() {
        return currentUser;
    }
}
