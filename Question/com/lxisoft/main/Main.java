package com.lxisoft.main;
import com.lxisoft.question.Question;
import com.lxisoft.multichoice.MultipleChoiceQuestion;
import com.lxisoft.quiz.Quiz;

public class Main {
    public static void main(String[] args) {
       Question[] questions=new Question[10]; 
		questions[0]=new Question("Who wrote the famous play Romeo and Juliet?","William Shakespeare");
		questions[1]=new MultipleChoiceQuestion("Which of the following is not a primary color in the RGB color model?","Yellow",new String[]{"Red","Green","Blue","Yellow"});
        questions[2]=new Question("What is the chemical symbol for water?","H20");
		questions[3]=new MultipleChoiceQuestion("What is the capital city of Australia?","Canberra",new String[]{"Sydney","Canberra","Melbourne","Brisbane"});
        questions[4]=new Question("Which planet is known as the Red Planet?","Mars");
		questions[5]=new MultipleChoiceQuestion("What is the chemical symbol for oxygen?","O",new String[]{"Ox","O","Oxg","Oxn"});
        questions[6]=new Question("What is the capital of France?","Paris");
		questions[7]=new MultipleChoiceQuestion("What is the largest planet in our solar system?","Jupiter",new String[]{"Earth","MarsJupiter","Saturn","Jupiter"});
        questions[8]=new Question("What is the chemical symbol for gold?","Au");
		questions[9]=new MultipleChoiceQuestion("Which of the following is not a programming language?","Photoshop",new String[]{"Python","Java","Ruby","Photoshop"});
		
        
        Quiz quiz = new Quiz(questions);

        
        quiz.start();
    }
}