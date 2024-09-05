
package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.SeriouslyWrongException;
import java.util.*;

public class TrueOrFalseQuestion extends Question {

    boolean answer ;

    public TrueOrFalseQuestion(String questionText, boolean answer) throws Exception {
        
		super(questionText);
		
			if (questionText == null){
				throw new SeriouslyWrongException("message");
			}
			this.answer = answer;
    }
	

    @Override
    public void ask() {
        System.out.println(getQuestionText() + " (True/False)");
        
		// use scanner to collect the answer
		Scanner scan = new Scanner(System.in);
		boolean tfAnswer = scan.nextBoolean();
		
		if (tfAnswer==answer){
			System.out.println("Your Answer is Correct");
			totalScores += 5;
		}
		else {
			System.out.println("Answer is not currect");
		}
    }
	
	@Override
	public void displayQuestion(){
		
		ask();
	}
	
	
}
