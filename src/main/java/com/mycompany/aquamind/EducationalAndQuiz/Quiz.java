 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EducationalAndQuiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maria Eduarda Tavares Holds the quiz questions and answers, checks
 * the user’s responses, and calculates a score. Stores lists of questions and
 * answers (ArrayList<String>). Uses startQuiz() to ask each question. Compares
 * user input to correct answers. Displays the final score.
 */
public class Quiz {
    
    private ArrayList<String>questions=new ArrayList<>(); //stores each question as a single string
    private ArrayList<String[]> options=new ArrayList<>(); //stores multiple answer choices for each question using an array of strings
    private ArrayList<Integer>correctAnswers =new ArrayList<>(); // stores the index of the correct answer for each question
    private int score; // keeps track of the player's current score
    private int answer; //to store the answer
    
    Scanner scanner = new Scanner(System.in);

    public Quiz(int score, int answer) {
        this.score = score;
        this.answer = answer;
    }
 
    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public ArrayList<String[]> getOptions() {
        return options;
    }

    public ArrayList<Integer> getCorrectIndices() {
        return correctAnswers;
    }
    
    
    //method to add a question to the quiz
    public void addQuestion(String question, String[] choices, int correctIndex) {
    questions.add(question);
    options.add(choices);
    correctAnswers.add(correctIndex);
    }
    
    //start quiz
   public void start(){
 for(int i=0; i<questions.size(); i++){
     System.out.println((i + 1) + ". " + questions.get(i));
     String [] choices = options.get(i);
     
     //show the alternatives 
     for (int j=0; j<choices.length; j++){
         System.out.println("   " + (j + 1) + ") " + choices[j]);
     }
  
     //reading the answer 
     System.out.println("your answer: ");
     int answer = scanner.nextInt();
     
     //verify the answer 
     if (answer - 1 == correctAnswers.get(i)) {
                System.out.println("Corret!");
                score++;
            } else {
                System.out.println("Wrong! correct asnwer: " + choices[correctAnswers.get(i)]);
                
            }
        }
  
   System.out.println("=== end of the quiz===");
   System.out.println("final score: " + score + "/" + questions.size());
  }
      }
  
 
 
    
   

   





