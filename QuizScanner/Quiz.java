import java.util.Scanner;

public class Quiz{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\t"+"WELCOME TO THE QUIZ COMPETITION"+"\n");
		
		System.out.println("QUESTION 1"+"\n");
		System.out.print("Where do polar bears live?"+"\n");
		System.out.print("Option A :-India"+"\n");
		System.out.print("Option B :-The Arctic"+"\n");
		System.out.print("Option C :-Ice Land"+"\n");
		System.out.print("Option D :-America"+"\n");
		
		System.out.print("\n"+"ENTER YOUR OPTION :-");
		String option1=scanner.nextLine();
		
		
		
			if(option1.equalsIgnoreCase("B")){
				System.out.println("CORRECT ANSWER"+"\n");		
			}
			else{
				System.out.println("INCORRECT ANSWER"+"\n");
			}
		
		System.out.println("QUESTION 2"+"\n");
		System.out.print("How many Continents are there?"+"\n");
		System.out.print("Option A :-Nine"+"\n");
		System.out.print("Option B :-Twelve"+"\n");
		System.out.print("Option C :-Eight"+"\n");
		System.out.print("Option D :-Seven"+"\n");
		
		System.out.print("\n"+"ENTER YOUR OPTION :-");
		String option2=scanner.nextLine();
		
			if(option2.equalsIgnoreCase("D")){
				System.out.println("CORRECT ANSWER"+"\n");	
			}
			else{
				System.out.println("INCORRECT ANSWER"+"\n");
			}
		
		
		System.out.println("QUESTION 3"+"\n");
		System.out.print("How many months have 31 days?"+"\n");
		System.out.print("Option A :-Nine Months"+"\n");
		System.out.print("Option B :-Twelve Months"+"\n");
		System.out.print("Option C :-Eight Months"+"\n");
		System.out.print("Option D :-Seven Months"+"\n");
		
		System.out.print("\n"+"ENTER YOUR OPTION :-");
		String option3=scanner.nextLine();
		
		
			if(option3.equalsIgnoreCase("D")){
				System.out.println("CORRECT ANSWER"+"\n");
			}
			else{
				System.out.println("INCORRECT ANSWER"+"\n");
			}
			System.out.println("END OF QUIZ");
			
	}
}