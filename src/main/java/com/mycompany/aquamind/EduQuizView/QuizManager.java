/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aquamind.EduQuizView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
class QuizManager {
    private static final String FILE_NAME = "Questions.txt";

    public static void deleteQuestionById(int questionId) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
        String line;
        boolean skip = false;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("ID:")) {
                int id = Integer.parseInt(line.replace("ID:", "").trim());
                skip = (id == questionId); // pula se for a pergunta que queremos deletar
            }

            if (!skip) {
                lines.add(line);
            }

            if (skip && line.startsWith("Answer:")) {
                skip = false; // termina de pular a pergunta
            }
        }
        reader.close();

        // Escreve de volta no arquivo original
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (String l : lines) {
            writer.write(l);
            writer.newLine();
        }
        writer.close();

        System.out.println("Pergunta com ID " + questionId + " deletada com sucesso!");
    }

    public static void main(String[] args) {
        try {
            deleteQuestionById(2); // Exemplo: deleta a pergunta com ID 2
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

