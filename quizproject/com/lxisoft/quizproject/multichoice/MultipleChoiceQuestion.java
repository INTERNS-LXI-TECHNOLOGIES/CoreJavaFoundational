package com.lxisoft.quizproject.multichoice;
import  com.lxisoft.quizproject.quiz.*;
import  com.lxisoft.quizproject.question.*;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;

    
	public MultipleChoiceQuestion(String questionText, String correctAnswer, String[] choices) {
        super(questionText, correctAnswer);
        this.choices = choices;
    }

    public void displayQuestion() {
        super.displayQuestion();
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + " " + choices[i]);
        }
    }

}
