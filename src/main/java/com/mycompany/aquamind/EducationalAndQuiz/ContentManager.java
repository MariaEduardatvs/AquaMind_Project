/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Maria Eduarda Tavares
 * to manage facts and articles
 */

public class ContentManager {

    private final ArrayList<EducationalContent> contents = new ArrayList<>();

    public ArrayList<EducationalContent> getContents() {
        return contents;
    }

    public void addContent(EducationalContent content) {
        contents.add(content);
    }

   
    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {

            for (EducationalContent content : contents) {

                writer.write(content.getClass().getSimpleName()); // Article or Fact
                writer.newLine();
                writer.write(content.title);
                writer.newLine();
                writer.write(content.text);
                writer.newLine();
                writer.write(content.source);
                writer.newLine();
                writer.write(content.author);
                writer.newLine();
                writer.write("---"); 
                writer.newLine();
            }

            System.out.println("Saved successfully!");

        } catch (IOException e) {
        }
    }

    
    public void loadFromFile(String filename) {
        contents.clear();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String type;
            while ((type = reader.readLine()) != null) {

                String title = reader.readLine();
                String text = reader.readLine();
                String source = reader.readLine();
                String author = reader.readLine();
                reader.readLine(); // skip ---

                if (type.equals("Articles")) {
                    contents.add(new Articles(title, text, source, author));
                } else if (type.equals("Facts")) {
                    contents.add(new Facts(title, text, source, author));
                }
            }

            System.out.println("Loaded successfully!");

        } catch (IOException e) {
            System.out.println("No saved file found.");
        }
    }
}
