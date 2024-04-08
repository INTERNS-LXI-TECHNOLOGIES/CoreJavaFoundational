package com.lxisoft.main;
import com.lxisoft.question.Question;
import com.lxisoft.quiz.Quiz;
import com.lxisoft.multichoice.MultipleChoiceQuestion;



public class Main {
    public static void main(String[] args) {
		 Question[] questions = new Question[10];
        
        
        questions[0] = new Question("What is the capital of France?", "Paris");
        questions[1] = new MultipleChoiceQuestion("Which of the following is a programming language?", "Java", new String[]{"Java", "Banana", "Table"});
		questions[2] = new Question("what is the capital of india?", "delhi");
        questions[3] = new MultipleChoiceQuestion("Which is the largest district in kerala?", "idukki", new String[]{"palakkad", "thrissutr", "idukki"});
        questions[4] = new Question("what programming language using in ai?", "python");
		questions[5] = new MultipleChoiceQuestion("Which is the smallest district in kerala?", "alappuzha", new String[]{"alappuzha", "palakkad", "thrissure"});
	   questions[6] = new Question("what is the power house of the cell?", "mito");
	   questions[7] = new MultipleChoiceQuestion("what is the chemical symbol for gold?", "au", new String[]{"au", "ag", "cu"});
	   questions[8] = new Question("What is the chemical formila of water?", "o2");
	   questions[9] = new MultipleChoiceQuestion("What is the chemical formila of carbondioxide?", "co2", new String[]{"co2", "o2", "ca"});
 
		Quiz quiz = new Quiz(questions);

        
        quiz.start();
    }
}
