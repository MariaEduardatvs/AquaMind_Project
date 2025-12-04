/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;

/**
 *
 * @author Kripa Shrestha
 */
public class Habit {
    private String name;
    boolean completed;
    
    //Constructor
    public Habit(String name, boolean completed){
        this.name = name;
        this.completed=completed;
    }
    
    public String getName(){
      return name;
    }
    
    //return if true habit is completes, else false
    public boolean isCompleted(){
        return completed;
    }
    
    //Toggles the habit completion tick box
    public void toggleCompleted(){
        this.completed = !this.completed;
    }

}