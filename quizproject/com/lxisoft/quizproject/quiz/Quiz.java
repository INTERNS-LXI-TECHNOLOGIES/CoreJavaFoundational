package com.lxisoft.quizproject.quiz ;
import com.lxisoft.quizproject.question.*;
import java.util.Scanner;
public class Quiz {
    public  Question[] questions;

   public Quiz(Question[] questions){
		this.questions=questions;
	}
    
    public void start() {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (question.isCorrect(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Quiz ended. Your score: " + score + "/" + questions.length);
    }
}
