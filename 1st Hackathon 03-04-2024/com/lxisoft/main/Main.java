package com.lxisoft.main;
import com.lxisoft.question.*;
import com.lxisoft.multichoice.*;
import com.lxisoft.quiz.*;


public class Main {
    public static void main(String[] args) {
      
	  Question[] questions = new Question[10];
	  
	  questions[0]= new Question("What is the capital of Canada?","Ottawa");
	  questions[1]= new Question("In what year did Christopher Columbus discover America?","1492");
	  questions[2]= new Question("What is the largest organ in the human body?","Skin");
	  questions[3]= new Question("What is the currency of Japan?","Japanese Yen");
	  questions[4]= new Question("What is the capital of Australia?","Canberra");
	  questions[5]= new Question(" Who wrote the Harry Potter book series?","J K Rowling");
	  questions[6]= new MultipleChoiceQuestion("Who is credited with discovering penicillin?","Alexander Fleming", new String[] {"Alexander Fleming","Steven Fleming","Johan Blake","Naturam Singh"});
	  questions[7]= new MultipleChoiceQuestion("What is the largest organ inside the human body?","Liver", new String[] {"Kidney","Pancrease","Liver","Brain"});
	  questions[8]= new MultipleChoiceQuestion(" Which gas do plants primarily use in photosynthesis?","Carbon Dioxide", new String[] {"Oxygen","Carbon Dioxide","Hydrogen","Helium"});
	  questions[9]= new MultipleChoiceQuestion(" Which country is famous for the pyramids of Giza?","Egypt", new String[] {"Iran","Oman","Iraq","Egypt"});
	  
	 
        Quiz quiz = new Quiz(questions);

        quiz.start();
    }
}

