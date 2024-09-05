package com.lxisoft.hackathon.quiz;

public abstract class Question implements IQuestion{
    
	public static int totalScores ;
	private String questionText;

    // Implement  int calculateAverageScores() 
	
	public static int calculateAverageScores(int totalQuestions){
		int score = totalScores/totalQuestions ;
		return score ;
	}

    
	public Question(String questionText) {
        this.questionText = questionText;
    }
	public String getQuestionText() {
		return questionText;
	}
	
	
    public abstract void ask();
}
