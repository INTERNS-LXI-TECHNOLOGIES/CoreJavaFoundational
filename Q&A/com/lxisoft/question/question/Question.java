
package com.lxisoft.question.question;

// Question class represents a quiz question
public class Question {
    protected String questionText;
    protected String correctAnswer;

    // Create an overloaded Constructor for Question class
	public Question(String questionText,String correctAnswer){
		
		
		this.questionText=questionText;
		this.correctAnswer=correctAnswer;
		
	}

    // Method to check if the given answer is correct
	
	//public void checkAnswerCorrect()
		
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
	
	
	
	

    public void displayQuestion(){
		
		System.out.println("question:"+questionText);
	}
   
}



