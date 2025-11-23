/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

import java.util.List;

/**
 *
 * @author Maria Eduarda Tavares
 * Responsible for managing the quiz system.
 * * Allows adding questions and answer options.
 * Starts the quiz and provides access to the final score.
 */
public class QuizManager {
    private Quiz quiz;
    
    public QuizManager(){
    quiz=new Quiz(0,0); //creates the quiz with score 0
    }
    
    public void addQuestion(String question, String[] options, int correctIndex){
    quiz.addQuestion(question, options, correctIndex); //to add questions
    }
    
    public void startQuiz(){
    System.out.println("starting quiz");
    quiz.start(); //starting quiz
    }
    
    public int getFinalScore(){
    return quiz.getScore(); //show the score
    }
    }
   
   
   
   

