/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EduQuizView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
    class Quiz {

    List<Question> questions = new ArrayList<>();

    //static method
    static class Question {
        int id;
        String question;
        String[] options;
        String answer;

        public Question(int id, String question, String[] options, String answer) {
            this.id = id;
            this.question = question;
            this.options = options;
            this.answer = answer;
        }
    }

    public Quiz() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Questions.txt"));
        String line;
        int id = 0;
        String q = "", answer = "";
        String[] options = new String[4];

        while ((line = br.readLine()) != null) {
            if (line.startsWith("ID:")) {
                id = Integer.parseInt(line.replace("ID:", "").trim());
            } else if (line.startsWith("Question:")) {
                q = line.replace("Question:", "").trim();
            } else if (line.startsWith("Option 1:")) {
                options[0] = line.replace("Option 1:", "").trim();
            } else if (line.startsWith("Option 2:")) {
                options[1] = line.replace("Option 2:", "").trim();
            } else if (line.startsWith("Option 3:")) {
                options[2] = line.replace("Option 3:", "").trim();
            } else if (line.startsWith("Option 4:")) {
                options[3] = line.replace("Option 4:", "").trim();
            } else if (line.startsWith("Answer:")) {
                answer = line.replace("Answer:", "").trim();
                questions.add(new Question(id, q, options.clone(), answer));
            }
        }
        br.close();
    }

    public List<Question> getQuestions() {
        return questions;
    }
}

