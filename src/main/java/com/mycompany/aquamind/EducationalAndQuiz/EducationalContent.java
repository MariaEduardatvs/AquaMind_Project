/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

/**
 *
 * @author Maria Eduarda Tavares Acts as a base for all types of educational
 * content. title and text attributes. Abstract method displayContent() will be
 * implemented by subclasses.
 */
public abstract class EducationalContent {

    public String title;
    public String text;
    public String source;
    public String author;

    public EducationalContent(String title, String text, String source, String author) {
        this.title = title;
        this.text = text;
        this.source = source;
        this.author = author;
    }

    public abstract void displayContent(); //abstract method to display the content 
    
      public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getSource() {
        return source;
    }
}


 