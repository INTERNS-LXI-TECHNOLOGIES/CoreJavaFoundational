import java.util.Scanner;

public class Grade
{
	public static void main(String[]ar)
	{
		System.out.println("Enter The Mark : ");
			
		Scanner scanner=new Scanner(System.in);
		
		float totalMark=scanner.nextFloat();
		
		if(totalMark>=90)
		{
			System.out.println(" A Grade");
		}
		else if(totalMark>=80&&totalMark<90)
		{
			System.out.println(" B Grade");
		}
		else if(totalMark>=70&&totalMark<80)
		{
			System.out.println(" c Grade");
		}
		else if(totalMark>=60&&totalMark<70)
		{
			System.out.println(" d Grade");
		}
		else if(totalMark>=50&&totalMark<60)
		{
			System.out.println(" E Grade");
		}
		else if(totalMark<50)
		{
			System.out.println(" Failed ");
		}
	}
}
			