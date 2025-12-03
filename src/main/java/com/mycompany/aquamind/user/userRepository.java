/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * author: Piotr Konkol
 * date last updated: December 2025
 */

package com.mycompany.aquamind.user;

import java.io.*;
import java.util.ArrayList;

public class userRepository {

    private ArrayList<user> users = new ArrayList<>(); // Array list

   
    public userRepository() {
        loadUsersFromFile(); // load the users to have them ready
    }

    
    private void loadUsersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String username = parts[0].trim();
                    String email    = parts[1].trim();
                    String password = parts[2].trim();

                    users.add(new user(username, email, password));
                }
            }
            //exception handling
        } catch (FileNotFoundException e) {
            System.out.println("No user file found");
        } catch (IOException e) {
            System.out.println("Error reading users.csv");
        }
    }

//this is the part of the user, to actually add the user to file
    private void saveUserToFile(user u) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.csv", true))) {
            bw.write(u.getUsername() + "," + u.getEmail() + "," + u.getPassword());
            bw.newLine();
            //exception handling
        } catch (IOException e) {
            System.out.println("Error writing to users.csv");
        }
    }

    //add the user to the system
    public boolean addUser(user u) {

        // prevent duplicate usernames
        if (findUser(u.getUsername()) != null) {
            return false;
        }

        users.add(u);
        saveUserToFile(u);
        return true;
    }
    public boolean deleteUser(String username) {
    for (int i = 0; i < users.size(); i++) {
        if (users.get(i).getUsername().equals(username)) {
            users.remove(i); //remove the user
            saveAllUsersToFile(); // rewrite the csv
            return true;
        }
    }
    return false;
}
    private void saveAllUsersToFile() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("users.csv"))) { // rewrite to the csv file
        for (user u : users) {
            bw.write(u.getUsername() + "," + u.getEmail() + "," + u.getPassword());
            bw.newLine();
        }
    } catch (IOException e) {
        System.out.println("Error saving all users!");
    }
}

    // find user, return user
    public user findUser(String username) {
        for (user u : users) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;
    }

   //validate that the user exists
    public boolean validate(String username, String password) {
        user u = findUser(username);

        if (u == null) return false;
        return u.getPassword().equals(password);
    }

    // get all the users
    public ArrayList<user> getAllUsers() {// array list utilisation
        return users;
    }
    // wipes the users file (only admin can do it, to give function to the inheritance)
    public void wipeFile() {
    try{
        new PrintWriter("users.csv").close();//overwrites file then writes nothing which should empty the csv
    } catch (IOException e) {
        System.out.println("Error clearing users.csv");
        }
    }
}

