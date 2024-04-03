package com.lxisoft.multichoice;
import com.lxisoft.question.*;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;

    // Overloaded Constructor for MultipleChoiceQuestion class
    public MultipleChoiceQuestion(String question, String[] choices, String correct) {
        super(question, correct);
        this.choices = choices;
    }

    // Method to display the question with choices
  
    public void displayTheQuestion() {
        super.displayTheQuestion();
        System.out.println("Choose one of the following options:");
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }
}
