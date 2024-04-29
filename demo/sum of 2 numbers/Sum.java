
import java.util.Scanner;

public class Sum
{
	public static void main(String ar[])
	{
		
		int num1;
		int num2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		
		
		int c=num1+num2;
		
		System.out.println("\n SUM : "+c);
		scanner.close();
		
	}
}