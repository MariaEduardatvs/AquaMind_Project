package com.mycompany.aquamind.EducationalAndQuiz;

public class QuizManager {

    private final Quiz quiz;

    public QuizManager() {
        quiz = new Quiz(0, 0); // initialize quiz with 0 score
    }

    public void addQuestion(String question, String[] options, int correctIndex) {
        quiz.addQuestion(question, options, correctIndex);
    }

    public void startQuiz() {
        quiz.start();   // runs the quiz logic
    }

    public int getFinalScore() {
        return quiz.getScore();
    }

    public Quiz getQuiz() {
        return quiz;
    }
}

   
   
   

