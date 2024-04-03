package com.lxisoft.multichoice;
import com.lxisoft.question.*;

public class MultipleChoiceQuestion extends Question {
    private String[] choices;

 public MultipleChoiceQuestion(String questionText,String correctAnswer,String[] choices){ 
	super(questionText,correctAnswer);
    
    this.choices=choices;
 }

   public void displayQuestion(){ 
    super.displayQuestion();
	for(int i=0;i<choices.length;i++){
		System.out.println((i+1)+ " " +choices[i]);
	}
   
}
}