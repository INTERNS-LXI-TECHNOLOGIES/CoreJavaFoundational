package com.lxisoft.hackathon.quiz;
import com.lxisoft.hackathon.exception.CannotGoException;
import com.lxisoft.hackathon.quiz.IQuestion;
import java.util.*;

public class MultipleChoiceQuestion extends Question {
    
	private String[] options;
    private int answerChoice ;

    public MultipleChoiceQuestion(String questionText, String[] options, int answerChoice) {
        
		super(questionText);
		
			if ( options == null){
				throw new CannotGoException("message") ;
			}
			
        this.options = options;
		this.answerChoice = answerChoice;
    }
	
	
    @Override
    public void ask() {
		
        System.out.println(getQuestionText());
			
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}
        // use scanner to collect the answer
		
		Scanner scan = new Scanner(System.in);
		
		int mcqAnswer = scan.nextInt();
		
			if(mcqAnswer==answerChoice){
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
