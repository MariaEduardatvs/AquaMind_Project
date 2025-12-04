/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.tracker;

import java.io.*;
import java.util.ArrayList;
import com.mycompany.aquamind.user.user;

/**
 * Habit Repo
 * @author Kripa Shrestha
 */

public class HabitRepository {
    
    // Load habits belonging to a specific user
    public ArrayList<Habit> loadHabits(user u) {
        ArrayList<Habit> habits = new ArrayList<>();
        String filename = "habits_" + u.getUsername() + ".csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    boolean completed = Boolean.parseBoolean(parts[1].trim());
                    habits.add(new Habit(name, completed));
                }
            }
     } catch (FileNotFoundException e) {
   
        } catch (IOException e) {
            System.out.println("Error reading " + filename);
        }

        return habits;
    }
    
    // Save habits for a specific user
    public void saveHabits(user u, ArrayList<Habit> habits) {
        String filename = "habits_" + u.getUsername() + ".csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Habit h : habits) {
                bw.write(h.getName() + "," + h.isCompleted());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing habits for " + u.getUsername());
        }
    }
   
    
}
