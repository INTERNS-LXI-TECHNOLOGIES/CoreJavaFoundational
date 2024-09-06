package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CannotGoException;
import java.util.Scanner;

	public class MultipleChoiceQuestion extends Question {
		
		private String[] options;
		private int answerChoice ;
		Scanner scanner=new Scanner(System.in);

		public MultipleChoiceQuestion(String questionText, String[] options, int answerChoice) {
			super(questionText);
			if ( options == null)
				throw new CannotGoException("CannotGoException") ;
			this.options = options;
			this.answerChoice= answerChoice;
		}

		@Override
		public void ask() {
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}
			
			System.out.print("ENTER YOUR ANSWER FOR MCQ: ");
			int mcqAnswer = scanner.nextInt();
			
			if (mcqAnswer == answerChoice){
				System.out.println("YOUR ANSWER IS CORRECT"+"\n");
				totalScores+=5;
			}
			else{
				System.out.println("INCORRECT ANSWER !"+"\n");
			}
		}
		
		public void displayQuestion() {
			System.out.println("MCQ: "+getQuestionText());
			ask();
		}
	}