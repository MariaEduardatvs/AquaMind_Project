/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

/**
 *
 * @author Maria Eduarda Tavares
 * Represents a short fact about water.
 */
public class Facts extends EducationalContent {
    private final String source; 

    public Facts(String source, String title, String text) {
        super(title, text);
        this.source = source;
    }
    
    @Override
    public void displayContent(){
    System.out.println("Fact");
    System.out.println("Title: " + title);
    System.out.println("Source: " + source);
    System.out.println("Text: " + text);
    System.out.println();
    
    }
}
