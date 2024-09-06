package com.lxisoft.hackathon.quiz;

	public abstract class Question implements IQuestion{
		public static int totalScores ;
		private String questionText;

		public static int calculateAverageScores() {
			int averageScore = totalScores/3;
			System.out.println("Average scores calculated.");
			return averageScore;
		}

		public Question(String questionText) {
			this.questionText = questionText;
		}

		public String getQuestionText() {
			return questionText;
		}

		public abstract void ask();
	}