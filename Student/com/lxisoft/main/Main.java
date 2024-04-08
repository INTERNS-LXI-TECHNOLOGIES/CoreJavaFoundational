import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		String option;
		String choice;
		Student student=new Student();
		
		do{
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your name:");
			String name=scanner.nextLine();
			
			System.out.println("Enter your class:");
			int clas=scanner.nextInt();
			
			System.out.println("Enter your rollNo:");
			int rollno=scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Enter your Gender:");
			String gender=scanner.nextLine();
			
			
			System.out.println("Enter your Subject:");
			String subject=scanner.nextLine();
			
			System.out.println("Do you want to submit another record?");
		    option=scanner.nextLine();
			
			System.out.println("Do you want to change the subject?");
			choice=scanner.nextLine();
			
			
		}while(option.equals("yes"));
		if(choice=="yes"){
			System.out.println("Enter the subject");
			String subject=scanner.nextLine();
		}
		
	}
}
			
			
			