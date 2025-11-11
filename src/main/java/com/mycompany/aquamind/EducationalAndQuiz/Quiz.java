/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

import java.util.ArrayList;

/**
 *
 * @author Maria Eduarda Tavares Holds the quiz questions and answers, checks
 * the user’s responses, and calculates a score. Stores lists of questions and
 * answers (ArrayList<String>). Uses startQuiz() to ask each question. Compares
 * user input to correct answers. Displays the final score.
 */
public class Quiz {

    private ArrayList<String> question = new ArrayList<>();
    private ArrayList<String> answer = new ArrayList<>();
    private int score = 0;

    public int getScore() {
        return score;
    }

   public void addQuestion(String question, String answer){
   this.question.add(question); 
   this.answer.add(answer); 
   }

   public void startQuiz(){
   System.out.println("Starting Quiz");
   
   for(int i=0; i<question.size(); i++){
   
   }
   }
   

}



