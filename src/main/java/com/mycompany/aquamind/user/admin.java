/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * author: Piotr Konkol
 * date last updated: November 2025
 */
package com.mycompany.aquamind.user;

import java.util.ArrayList;
public class admin extends user { //inheritance

    private userRepository repo;

    public admin(String username, String email, String password, userRepository repo) {
        super(username, email, password);
        this.repo = repo;
    }
    //things that only an admin should be able to do
    public void cleanUsers() {
        repo.wipeFile();
    }
    public ArrayList<user> getAllUsers() {//array list
        return repo.getAllUsers();
    }
}
