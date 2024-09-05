package com.lxisoft.hackathon;
import com.lxisoft.hackathon.quiz.IQuestion;
import com.lxisoft.hackathon.quiz.MultipleChoiceQuestion;
import com.lxisoft.hackathon.quiz.SocialTaskQuestion;
import com.lxisoft.hackathon.quiz.TrueOrFalseQuestion;
import com.lxisoft.hackathon.quiz.Question;


public class TDD {
	
    public static void main(String[] args) throws Exception {
	
		String[] options = {"sri" , "sriz", "sreeja" , "sree"};
		
		IQuestion quiz[] = { new MultipleChoiceQuestion("whats your name?", options , 3), 
							 new TrueOrFalseQuestion("java is object oriented programming language?", true),
							 new SocialTaskQuestion("please explain the hackathon experience?")} ;
    
		System.out.println("Welcome to quiz");

			for( IQuestion q : quiz){
				q.displayQuestion();
			}
			
		System.out.println("Total Marks:- " +Question.totalScores);
		System.out.println("Avarage:- " +Question.calculateAverageScores(quiz.length));
	
			
		System.out.println("Thank you");

	}
}
