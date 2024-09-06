package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.SeriouslyWrongException;
import java.util.Scanner;

	public class TrueOrFalseQuestion extends Question {

		boolean answer ;
		Scanner scanner=new Scanner(System.in);
		

		public TrueOrFalseQuestion(String questionText, boolean answer) throws SeriouslyWrongException{
			super(questionText);
			if (questionText == null){
				throw new SeriouslyWrongException("SeriouslyWrongException");
			}
			this.answer = answer;
		}

		@Override
		public void ask() {
			System.out.print("ENTER YOUR TRUE / FALSE: ");
			boolean tORfAnswer = scanner.nextBoolean();
			
			if (tORfAnswer == answer){
				System.out.println("YOUR ANSWER IS CORRECT"+"\n");
				totalScores+=5;
			}
			else{
				System.out.println("INCORRECT ANSWER !"+"\n");
			}
		}
		
		public void displayQuestion() {
			System.out.println("T/F :"+getQuestionText());
			ask();
		}
	}