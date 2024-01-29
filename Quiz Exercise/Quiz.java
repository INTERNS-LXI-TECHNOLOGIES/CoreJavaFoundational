import java.util.Scanner;

public class Quiz {
	public static void main (String[]args){
		
	Scanner scanner = new Scanner(System.in);
	int totalscore =0;
	
			
		System.out.print("Question 1");
		String que1 = scanner.nextLine();
		
		System.out.println("How many days in a week");
		System.out.println("Option A = 7");
		System.out.println("Option B = 5");
		System.out.println("Option C = 6");
		System.out.println("Option D = 4");
		
		System.out.print("Enter the Answer:");
		String answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("A")) {
			System.out.println("The answer is correct");totalscore++;
		}
		else {
			System.out.println("Wrong");
		}
		
		System.out.print("Question 2");
		String que2 = scanner.nextLine();
		
		System.out.println("How many months in year");
		System.out.println("Option A = 7");
		System.out.println("Option B = 12");
		System.out.println("Option C = 11");
		System.out.println("Option D = 4");
		
		System.out.print("Enter the Answer:");
		String answer2 = scanner.nextLine();
		
		if (answer2.equalsIgnoreCase("B")) {
			System.out.println("The answer is correct");totalscore++;
		}
		else {
			System.out.println("Wrong");
		}
		
		System.out.print("Question 3");
		String que3 = scanner.nextLine();
		
		System.out.println("Who is the Prime minister of India");
		System.out.println("Option A = Amit shah");
		System.out.println("Option B = Rajiv gandhi");
		System.out.println("Option C = Narendra Modi");
		System.out.println("Option D = Yogi Aditya Nath");
		
		System.out.print("Enter the Answer:");
		String answer3 = scanner.nextLine();
		
		if (answer3.equalsIgnoreCase("C")) {
			System.out.println("The answer is correct");totalscore++;
		}
		else {
			System.out.println("Wrong");
		}
		
		System.out.print("Question 4");
		String que4 = scanner.nextLine();
		
		System.out.println("What is the capital of India");
		System.out.println("Option A = Kerala");
		System.out.println("Option B = Tamilnadu");
		System.out.println("Option C = Maharashtra");
		System.out.println("Option D = New Delhi");
		
		System.out.print("Enter the Answer:");
		String answer4 = scanner.nextLine();
		
		if (answer4.equalsIgnoreCase("D")) {
			System.out.println("The answer is correct");totalscore++;
		}
		else {
			System.out.println("Wrong");
		}
		
		System.out.println("Total Score = \t" +totalscore);
		
		boolean a = true;
	
		while(a){
		 
			if (totalscore>=2){
			
			System.out.print("Question 5");
			String que5 = scanner.nextLine();
			
			System.out.println("How many  in year");
			System.out.println("Option A = 7");
			System.out.println("Option B = 12");
			System.out.println("Option C = 11");
			System.out.println("Option D = 4");
		
			System.out.print("Enter the Answer:");
			String answer5 = scanner.nextLine();
		
		
		}
		else {
			a= false;
		}	
	}
		
	}
}