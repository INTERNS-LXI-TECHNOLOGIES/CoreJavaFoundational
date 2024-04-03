package com.lxisoft.textfile;
import com.lxisoft.quiz.Quiz;
import com.lxisoft.question.Question;
import com.lxisoft.multichoice.MultipleChoiceQuestion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an array of questions
        Question[] questions = new Question[7];

        // Fill the array with quiz questions
        questions[0] = new Question("What is the capital of France?", "Paris");
        questions[1] = new Question("How many languages are spoken in India?", "424");
        questions[2] = new Question("How many Continents are there ?", "7");
        questions[3] = new Question("What's the color of an Elephant", "Black");
        questions[4] = new Question("How many tyres does a car have", "4");
        questions[5] = new MultipleChoiceQuestion("who is the pm of india", "modi", new String[]{"India", "modi", "amit sha", "lalu alex"});
        questions[6] = new MultipleChoiceQuestion("who is the cm of kerala", "pv", new String[]{"pv", "modi", "amit sha", "lalu alex"});

        // Create a quiz object
        Quiz quiz = new Quiz(questions);

        // Start the quiz
        quiz.start();
    }
}