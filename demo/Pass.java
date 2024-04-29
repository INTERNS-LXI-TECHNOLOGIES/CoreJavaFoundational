
import java.util.Scanner;

public class Pass
{
	public static void main(String[]ar)
	{
		System.out.println("Enter The Mark:");
	
		Scanner scanner=new Scanner(System.in);
		
		int mark=scanner.nextInt();
		
		if(mark>=50&&mark<=100)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
}