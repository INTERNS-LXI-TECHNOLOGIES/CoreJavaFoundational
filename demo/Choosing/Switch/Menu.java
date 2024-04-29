import java.util.Scanner;

public class Menu
{
	public static void main(String[] arg)
	{
		System.out.println(" 1 for poratta\n 2 for chappathi\n 3 for dosa\n 4 for mandi");
		
		
		Scanner scanner=new Scanner(System.in);
		
		int choice=scanner.nextInt();
								
									
										
		switch(choice)
		{
			case 1:
			{
			System.out.println("you selected poratta");
			}
			break;
			
			case 2:
			{
				System.out.println("you selected chappathi");
			}
			break;
			
			case 3:
			{
				System.out.println("you selected dosa");	
			}
			break;
			
			case 4:
			{
				System.out.println("you selected mandi");
			}
			break;
			
			default :
			{
				System.out.println("you are a fool");
			}
			break;
		}
	}
}
		
