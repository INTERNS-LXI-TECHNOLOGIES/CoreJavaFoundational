package com.lxisoft.textfile;
import com.lxisoft.question.Question;
import com.lxisoft.multichoice.MultipleChoiceQuestion;
import com.lxisoft.quiz.Quiz;


public class Main {
    public static void main(String[] args) {
        // Create an array of questions
	
	Question[] questions = new Question[10];
	
		questions[0] = new Question("What is your name?", "sreeja");
        questions[1] = new MultipleChoiceQuestion("What is your age?", new String[]{"4", "16", "21", "20"}, "21");
        questions[2] = new Question("What is the largest mammal in the world?", "Blue whale");
        questions[3] = new MultipleChoiceQuestion("What is the fastest land animal?", new String[]{"cheetah", "cat", "cow", "elephant"}, "cheetah");
        questions[4] = new Question("Who painted the Mona Lisa?", "Leonardo da Vinci");
        questions[5] = new MultipleChoiceQuestion("What is the capital of France?", new String[]{"Paris", "china", "tokyo", "jappan"}, "Paris");
        questions[6] = new Question("What is the chemical symbol for water?", "H2o");
        questions[7] = new MultipleChoiceQuestion("What is the chemical symbol for gold?", new String[]{"Au", "Ag", "O", "N"}, "Au");
        questions[8] = new Question("What is the longest river in the world?", "Nile");
        questions[9] = new MultipleChoiceQuestion("What is the tallest mammal on Earth?", new String[]{"Giraffe", "dog", "cat", "cow"}, "Giraffe");

	
        // Fill the array with quiz questions
        
        // Complete the array with ten questions, you can use either MultipleChoiceQuestion or Question classes
        
        // Create a quiz object
        Quiz quiz = new Quiz(questions);




        // Start the quiz
        quiz.start();
    }
}
