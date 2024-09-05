
package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CompletelyWrongException;
import java.util.*;

public class SocialTaskQuestion extends Question {
	String questionText;

    public SocialTaskQuestion(String questionText) {
        
		super(questionText);
		
			if (questionText == null){
				throw new CompletelyWrongException("message") ;
			}
		
    }
	
	

    @Override
    public void ask() {
        System.out.println(getQuestionText() + " (This question requires a social task.)");
        // use scanner to collect the answer
		
		Scanner scan = new Scanner(System.in);
		String stAnswer = scan.nextLine();
		
		if(stAnswer!=null){
			System.out.println("Your Answer is Correct");
			totalScores += 5 ;
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
