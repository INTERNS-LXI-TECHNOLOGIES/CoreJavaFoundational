import java.util.Scanner;
 
public class Calculator{
	public static void main (String[]args){
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Press 1 for adition");
		System.out.println("Press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for exit");
		
		boolean a = true;
		while(a) {
		
		System.out.print("Enter the first number:");
		double num1= scanner.nextDouble();
		
		System.out.print("Enter the second number:");
		double num2= scanner.nextDouble();
		
		
		System.out.print("Enter the method:");
		String method = scanner.next();
		scanner.nextLine();
		
		double result;
				
		switch (method) {
		
		case ("1"):
			result = num1+num2;
			System.out.println(result);
        break;
			
		case ("2") :
			result = num1-num2;
			System.out.println(result);
        break;
		
		case ("3"):
			result = num1*num2;
			System.out.println(result);
        break;
		
		case("4"):
			a=false;
		break;
			
		default:
		System.out.println("Invalid");
		}
		
	}
	}
	
}