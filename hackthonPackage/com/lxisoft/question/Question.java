package com.lxisoft.question;

public class Question {

    protected String questionText;
    protected String correctAnswer;
    

    // Create an overloaded Constructor for Question class
    public Question(String question, String correct) {
        this.questionText = question;
        this.correctAnswer = correct;
    }

    // Method to check if the given answer is correct
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

    // Method to display the question
    public void displayTheQuestion() {
        System.out.println(questionText);
    }
}
