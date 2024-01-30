import java.util.Scanner;

public class Calculator{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		boolean restart= true;
	
	while(restart){	
	System.out.print("Enter the First Number :-");
	double num1 = scanner.nextDouble();
	
	
	System.out.print("Enter the Second Number :-");
	double num2 = scanner.nextDouble();
	
	double result=0;
	
	System.out.println("\n"+"CHOOSE THE OPTION NUMBER BELOW :- ");
	System.out.println("OPTION 1:- ADDITION (+)");
	System.out.println("OPTION 2:- SUBTRACTION (-)");
	System.out.println("OPTION 3:- MULTIPLICATION (*)");
	System.out.println("OPTION 4:- DIVISION (/)"); 
	
	System.out.print("\n"+"ENTER THE OPTION NUMBER :-"+"\n");
	int option = scanner.nextInt();
	
	if (option==1){
		result=num1+num2;
			System.out.println("RESULT = "+result);
		}
		else if(option==2){
		result=num1-num2;
			System.out.println("RESULT = "+result);
		}
		else if(option==3){
		result=num1*num2;
			System.out.println("RESULT = "+result);
		}
		else if(option==4){
		result=num1/num2;
			System.out.println("RESULT = "+result);
		}
		else {
			System.out.println("INVALID OPTION");
		}
		scanner.nextLine();
		
		System.out.print("\n"+"DO WISH TO CONTINUE: YES/NO: ");
		
		String check =scanner.nextLine();
		
		if(check.equalsIgnoreCase("YES")){
			restart=true;
		}
		else{
			restart=false;
			}
		}
				
	}	
		} 