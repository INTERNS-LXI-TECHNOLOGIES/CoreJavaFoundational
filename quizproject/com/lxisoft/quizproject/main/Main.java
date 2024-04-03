package com.lxisoft.quizproject.main;
import com.lxisoft.quizproject.question.*;
import com.lxisoft.quizproject.quiz.*;
import com.lxisoft.quizproject.multichoice.*;
public class Main {
    public static void main(String[] args) {
      
         Question[] questions=new Question[10];  
     System.out.println("\n");
        questions[0] = new Question("What is the capital of France?", "Paris");
        questions[1] = new MultipleChoiceQuestion("What is the color of an apple?", "Red",new String[]{"Red", "Green", "Yellow", "Orange"});
        questions[2] = new Question("What is the chemical symbol for oxygen?", "O");
        questions[3] = new MultipleChoiceQuestion("What is the chemical symbol for water?", "H2O", new String[]{"H2O", "CO2", "NaCl", "O2"});
        questions[4] = new Question("what is the capital of Spain?", "Madrid");
        questions[5] = new MultipleChoiceQuestion("Which planet is known as the Red Planet?", "Mars", new String[]{"Mars", "Venus", "Jupiter", "Saturn"});
        questions[6] = new Question("What is the chemical symbol for iron?", "Fe");
        questions[7] = new MultipleChoiceQuestion("What is the largest ocean?", "Pacific", new String[]{"Pacific", "Atlantic", "Indian", "Arctic"});
        questions[8] = new Question("What is the capital of Japan?", "Tokyo");
        questions[9] = new MultipleChoiceQuestion("What is the chemical symbol for gold?", "Au", new String[]{"Au", "Ag", "Fe", "Cu"});
        
       
        
     Quiz quiz = new Quiz(questions);
     quiz.start();
    }
}
