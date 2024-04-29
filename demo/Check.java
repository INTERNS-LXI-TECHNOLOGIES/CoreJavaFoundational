import java.util.Scanner;
public class Check
{
	public static void main(String[]ar)
	{
		System.out.println("Enter a Number : ");
		
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		if(num>0)
		{
			System.out.println("\n"+num +" is a Positive Number"); 
		}
		else
		{
			System.out.println("\n"+num +" is a Negative Number");
		}
	}
}