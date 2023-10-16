import java.util.Scanner;
public  class Restaurant
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\t\t\t\t~~~~~~~~~~~~WELCOME TO RESTAURANT~~~~~~~~~~~~\t\t\t\t");
		boolean check= true;
		while(check)		
		{			  
			System.out.println(" press 1 To View Details ");
			System.out.println(" press 2 To Do You Want To Continue ");				  
			check=true;
			String number=scan.nextLine();
			switch(number)
			{
				case "1":
				System.out.println("\n 1-Chicken Biriyani-130 \n 2-Mutton Biriyani-180 \n 3-Egg Biriyani-100 \n 4-Fish Biriyani-160");
				break;
			
				case "2":
                check =printDetails();						
                break;
							 
				default:						
				System.out.println("somthing went wrong");
				break;
			}			
		} 
    }
		
        public static boolean printDetails()
		{
			Scanner scan=new Scanner(System.in);				
			System.out.println("yes to continue or No to exit");
		    String sc=scan.nextLine();
		    if(sc.equals("yes"))
			{							
				return true;
			}
			else
			{
				return false;						
			}								
		}
}
	
 