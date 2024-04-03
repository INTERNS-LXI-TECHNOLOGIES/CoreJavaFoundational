package com.lxisoft.question.main;
import com.lxisoft.question.multichoice.*;
import com.lxisoft.question.question.*;
import com.lxisoft.question.quiz.* ;
public class Main {
    public static void main(String[] args) {
        // Create an array of questions
      Question[] question=new Question[5];
	  
        
        // Fill the array with quiz questions
		
        question[0]=new Question("who is CM of kerala","PV");
		question[1]=new Question("what is the mother tounge in kerala","malayalam");
	    question[2]=new MultipleChoiceQuestion("where do polar bear live","ice land",new String[]{"america","africa","ice land","antartica"});
		question[3]=new MultipleChoiceQuestion("what is the color of elephant","black",new String[]{"green","red","white","black"});
	    question[4]=new Question("how many tyres does a cycle","2");

        // Complete the array with ten questions, you can use either MultipleChoiceQuestion or Question classes
        
        // Create a quiz object
        Quiz quiz = new Quiz(question);

        // Start the quiz
        quiz.start();
    }
}
