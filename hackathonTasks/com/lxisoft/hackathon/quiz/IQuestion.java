package com.lxisoft.hackathon.quiz;

	public interface IQuestion  {

		static int calculateAverageScores() {
			System.out.println("Average scores calculated.");
			return 0;
		}
		void displayQuestion();
	}