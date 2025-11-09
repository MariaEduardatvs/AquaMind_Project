/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

/**
 *
 * @author User
 */
public class Articles extends EducationalContent {
    private String author; 

    public Articles(String author, String title, String text) {
        super(title, text);
        this.author = author;
    }
    
    @Override 
    public void displayContent() {
        System.out.println("Artcile"); 
        System.out.print("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Text: " + text);
        System.out.println();
    }
}
