/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

/**
 *
 * @author User
 */
public abstract class EducationalContent {
    protected String title; 
    protected String text; 

    public EducationalContent(String title, String text) {
        this.title = title;
        this.text = text;
    }
    
   public abstract void displayContent(); 
}
