package com.lxisoft.hackathon;

import com.lxisoft.hackathon.quiz.IQuestion;
import com.lxisoft.hackathon.quiz.Question;
import com.lxisoft.hackathon.quiz.MultipleChoiceQuestion;
import com.lxisoft.hackathon.quiz.SocialTaskQuestion;
import com.lxisoft.hackathon.quiz.TrueOrFalseQuestion;
import java.util.Scanner;

	public class TDD {
		public static void main(String[] args) throws Exception{
			
			String option[]={"False","int","STring","Array"};
			Scanner scanner=new Scanner(System.in);
			
			IQuestion quiz[] = { new MultipleChoiceQuestion("which of the followings are data types?", option, 2), 
				new TrueOrFalseQuestion("There are 52 data types in java", true),
					new SocialTaskQuestion("Write all the data types","int")   } ;

			System.out.println("\t"+"Welcome to quiz"+"\n");

			for( IQuestion q : quiz)
			{
				q.displayQuestion();
			}
			
			System.out.println("TOTAL SCORE:- "+Question.totalScores);
			System.out.println("AVERAGE SCORE:- "+Question.calculateAverageScores());
			System.out.println("Thank you");
		}
	}