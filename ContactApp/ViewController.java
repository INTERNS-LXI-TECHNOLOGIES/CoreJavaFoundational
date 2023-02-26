import java.util.Scanner;
public class ViewController
{
   Scanner scan = new Scanner(System.in);
   
    private ContactList list = new ContactList();
	
	public ContactList getContact()
	{
		return this.list;
	}
	 int i =0;
	
	public void vieW(){
		
		System.out.println("               Contact list               "+"\n");
		boolean value = true;
		while(value)
		{
			System.out.println("       Click : 1  To Enter details         ");
		    System.out.println("       Click : 2  To View contact List      ");
		    System.out.println("       Click : 3      Quit                  ");
			
			int caSe = Integer.parseInt(scan.nextLine());
			
			switch(caSe)
			{
			  case 1:	
			  enterDetails();
			  break;
			  
			  case 2:
			  printDetails();
			  break;
			  
			  case 3:
			  System.out.println("Quit");
			  value = false;
			  break;
				
		      default:
				System.out.println("Default");
				
			}
		
		}
		
		
		
		
	}
	
	public void enterDetails()
	{
	  while(i<20)
	  {
		System.out.println("Enter name"+"\n"); 
		list.getDetails()[i].setName(scan.nextLine()); 
        System.out.println("Enter phone number"+"\n");
        list.getDetails()[i].setNumber(scan.nextLine());
        System.out.println("Enter Email Address"+"\n");
        list.getDetails()[i].setEmail(scan.nextLine());		
		i++;
		System.out.println(i+" "+"Contact details entered"+"\n"+"\n"+"Do you want to enter another contact to your contact list"+"\n"+"\n"+"Type yes to continue the way or no to Quit"+"\n");
		String response = scan.nextLine();
        if(response.equals("no")){
			break;
		}		
	  }

	}
        public void printDetails()
		{
		  System.out.println(list);
		}	  
		
		
		
		
		
	


}