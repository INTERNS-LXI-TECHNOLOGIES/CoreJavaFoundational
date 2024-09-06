package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CompletelyWrongException;
import java.util.Scanner;

	public class SocialTaskQuestion extends Question {
		
		private String socialSkillAnswer;
		Scanner scanner=new Scanner(System.in);

		public SocialTaskQuestion(String questionText,String socialSkillAnswer) {
			super(questionText);
			if (questionText == null){
				throw new CompletelyWrongException("CompletelyWrongException");
			}
			this.socialSkillAnswer=socialSkillAnswer;
		}

		@Override
		public void ask() {
			System.out.print("ENTER YOUR ANSWER FOR STQ: ");
			String stqAnswer = scanner.nextLine();
			
			if (stqAnswer.equalsIgnoreCase(socialSkillAnswer)){
				System.out.println("YOUR ANSWER IS CORRECT"+"\n");
				totalScores+=5;
			}
			else{
				System.out.println("INCORRECT ANSWER !"+"\n");
			}
		}
		
		public void displayQuestion() {
			System.out.println("STQ :"+getQuestionText());
			ask();
		}
	}