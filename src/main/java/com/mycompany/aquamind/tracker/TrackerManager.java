/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;
import java.util.ArrayList;
/**
 * https://www.w3schools.com/java/java_arraylist.asp - used for ArrayList references
 * @author Kripa Shrestha
 */
public class TrackerManager {
    private WaterUseCalculator calculator = new WaterUseCalculator();
    private final ArrayList<Habit> habits; //object used for water calculations
    private double totalUsage; //Storing the latest water usage result
    
    //Constructor to initialise the habit list and calculator
    public TrackerManager(){
        habits = new ArrayList<>();
        calculator = new WaterUseCalculator();
        totalUsage =0;
    }
    
    //Adds a new Habit object to the list
    public void addHabit(Habit h){
        habits.add(h);
    }
    
    //Finds and toggles the completion of a habit based on the name of the habit
    public void markHabitComplete(String name){
        for(Habit h: habits){
            if(h.getName().equalsIgnoreCase(name)){
                h.toggleCompleted();
                return;
            }
        }
    }
    
    //Passes the user number input to WaterUSeCalculator and returns the total estimated water use for the day
    public double calculateDailyUse(double shower, int laundry, double sink){
        calculator.setShowerMinutes(shower);
        calculator.setLaundryLoads(laundry);
        calculator.setSinkMinutes(sink);
        
        totalUsage = calculator.calculateUse();
        return totalUsage;
    }
    
    public int getCompletedHabitCount(){
        int count = 0;
        for(Habit h : habits){
            if (h.isCompleted){
                count++;
            }
        }
        return count;
    }
    
    //Returns the list of habits which the UI uses to display the completed habits on the screen.
    public ArrayList<Habit>getHabits(){
        return habits;
    }
    
}
