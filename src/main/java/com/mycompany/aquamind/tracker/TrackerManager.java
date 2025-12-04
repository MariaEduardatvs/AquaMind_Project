/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;

import com.mycompany.aquamind.user.user;
import java.util.ArrayList;
/**
 * https://www.w3schools.com/java/java_arraylist.asp - used for ArrayList references
 * @author Kripa Shrestha
 */
public class TrackerManager {
    private WaterUseCalculator calculator;
    private HabitRepository habitRepo;
    
    private user currentUser;
    private ArrayList<Habit> habits;
    private double totalUsage; //Storing the latest water usage result
   
    
    //Constructor to initialise the habit list and calculator
    public TrackerManager(user loggedInUser){
        this.currentUser = loggedInUser;
        this.habitRepo = new HabitRepository();
        this.calculator = new WaterUseCalculator();
        
        //Load the user specific habits from file
        this.habits = habitRepo.loadHabits(currentUser);
        this.totalUsage =0;
    }
    
    /*
    * Habit Management
    */
    
    public void addHabit(Habit h){
        habits.add(h);
        habitRepo.saveHabits(currentUser, habits); //persist
    }
    
    //Finds and toggles the completion of a habit based on the name of the habit
    public void markHabitComplete(String name){
        for(Habit h: habits){
            if(h.getName().equalsIgnoreCase(name)){
                h.toggleCompleted();
                habitRepo.saveHabits(currentUser, habits); //save update
                return;
            }
        }
    }
    
    public void saveHabits() {
    if (currentUser != null && habits != null) {
        habitRepo.saveHabits(currentUser, habits);
    }
}
    
    public int getCompletedHabitCount(){
        int count = 0;
        for(Habit h : habits){
            if (h.completed){
                count++;
            }
        }
        return count;
    }
    
    //Returns the list of habits which the UI uses to display the completed habits on the screen.
    public ArrayList<Habit>getHabits(){
        return habits;
    }
    
    /*
    *Water Use Calculation
    */
    
    //Passes the user number input to WaterUSeCalculator and returns the total estimated water use for the day
    public double calculateDailyUse(double shower, int laundry, double sink){
        calculator.setShowerMinutes(shower);
        calculator.setLaundryLoads(laundry);
        calculator.setSinkMinutes(sink);
        
        totalUsage = calculator.calculateUse();
        return totalUsage;
    }
    
    public double getTotalUsage(){
        return totalUsage;
    }
    
}
