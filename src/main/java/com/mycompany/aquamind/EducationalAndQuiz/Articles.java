/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

/**
 *
 * @author Maria Eduarda Tavares 
 * Represents articles about water conservation.
 *
 */
public class Articles extends EducationalContent {

    public Articles(String title, String text, String source, String author) {
        super(title, text, source, author);
    }

    @Override
    public void displayContent() {
        System.out.println("Article");
        System.out.println("Title: " + title);
        System.out.println("Text: " + text);
        System.out.println();
    }
}
