	
import java.util.Scanner;

public class ViewController
{
	
	 private boolean flag=true;
	 
	 
	 int i=0;
	 Contact contact = new Contact(); 
	 Scanner s = new Scanner(System.in);
	
	  public boolean getFlag()
       {
       return flag;
       }
       public void setFlag(boolean flag)
       {
	    this.flag = flag;
       }
	   
	
		
        
		
		boolean programContinue = true;
		
		public void viewThing(){
			
				 while (programContinue)
		{

			System.out.println("\n----CONTACT DETAILS----\n");
			
			
			    System.out.println("Enter 1 :YOUR DETAILS");
		        System.out.println("Enter 2 :PRINT YOUR DETAILS");
		        System.out.println("Enter 3 :QUIT");
		        

		         String count  = s.nextLine();
				 
				
			    switch (count)
			     {
				case ("1"):
				contactDetails();
					
					break;
					
					
			     case ("2"):
                   printDetails();
				 
                      break;
					  
				case ("3"):
				
                    System.out.print("Quit");			
					programContinue = false;
                      break;
					  
				default:
					System.out.println("Invalid Expression");		
			}
		}}
			
			public void contactDetails()
			{
				
				
				
				
			
            
			  
	              
	              
	      
	              while(i<20)
				  {

                    System.out.println("Enter your name");
                    contact.getPersons()[i].setName(s.nextLine());
                    
   
                    System.out.println("Enter your email id");
                    contact.getPersons()[i].setEmailId(s.nextLine());
   
                    System.out.println("Enter your phonenumber");
                     contact.getPersons()[i].setNumber(Integer.parseInt(s.nextLine()));
   
                    System.out.println("Enter yes to continue no to quit");
                    String response = s.nextLine();
				    i++;
                    if(response.equals("no"))
		              {
                          break;
                      }
				  }
	




			}

	
 
 
            public  void printDetails()
 
           {
	 
	 
	 
	        System.out.println(contact);
	 
	 
	 
           }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
   
		  
			  
			  
			  









	
	
	
	
	