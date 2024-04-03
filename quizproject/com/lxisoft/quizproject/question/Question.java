package com.lxisoft.quizproject.question;
import java.util.Scanner;
public class Question {
    public String questionText;
    public String correctAnswer;
	

    public Question(String questionText, String correctAnswer){
		this.questionText=questionText;
		this.correctAnswer=correctAnswer;
	}

    // Method to check if the given answer is correct
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
	}
	public void displayQuestion() {
        System.out.println(questionText);
    }
   
}


		