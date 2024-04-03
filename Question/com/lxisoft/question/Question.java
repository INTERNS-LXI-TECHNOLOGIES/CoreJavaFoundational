package com.lxisoft.question;


public class Question {
    protected String questionText;
    protected String correctAnswer;

    public Question(correctAnswer){
    this.questionText=questionText;
	this.correctAnswer=correctAnswer;
	}
	
 
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }

    public void displayQuestion(){              
      System.out.println("Question:"+questionText);
		
	}
}
